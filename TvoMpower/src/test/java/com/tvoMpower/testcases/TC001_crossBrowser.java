package com.tvoMpower.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.tvoMpower.pageObjects.RegistrationPage;
import com.tvoMpower.utilities.ReadConfig;

//BASE CLASS

public class TC001_crossBrowser {

	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL();
	public String firstname = readconfig.getFirstName();
	public String lastname = readconfig.getLastName();
	public int bindex = readconfig.getBoardIndex();
	public int rindex = readconfig.getRoleIndex();
	public int sindex = readconfig.getSchoolIndex();
	public String email = readconfig.getEmailId();
	public String password = readconfig.getPassword();
	public int soindex = readconfig.getSourceIndex();

	public static WebDriver driver;

	public static Logger logger;

	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException {
		
		//Testing the website in browsers-Chrome, IE, Edge, Firefox

		logger = Logger.getLogger("tvoMpower");
		PropertyConfigurator.configure("log4j.properties");

		String chromepath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
		String firefoxpath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
		String iepath = System.getProperty("user.dir") + "\\Drivers\\IEDriver.exe";
		String edgepath = System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe";
		if (br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromepath);
			driver = new ChromeDriver();
		} else if (br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", firefoxpath);
			driver = new FirefoxDriver();
		} else if (br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", iepath);
			driver = new InternetExplorerDriver();
		}

		else if (br.equals("edge")) {
			System.setProperty("webdriver.edge.driver", edgepath);
			driver = new EdgeDriver();
		}

		driver.get(baseURL);
		logger.info("Browser opened");

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	public void registration() throws InterruptedException {
		//Adding data to registration page
		
		RegistrationPage re = new RegistrationPage(driver);
		re.setFirstName(firstname);
		logger.info("firstname entered");
		re.setLastName(lastname);
		logger.info("lastname entered");
		re.roleDropdown(rindex);
		logger.info("role entered");
		re.boardDropdown(bindex);
		logger.info("board entered");
		re.schoolDropdown(sindex);
		logger.info("school entered");
		re.setEmail(email);
		logger.info("email entered");
		re.setPassword(password);
		logger.info("password entered");
		re.sourceDropdown(soindex);
		logger.info("source entered");
		re.clicksubmit();
		Thread.sleep(5000);
	}

}
