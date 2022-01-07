package com.tvoMpower.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC003_EmailValidation extends TC001_crossBrowser {
	
	//Testing email field
	//values can be added through config.properties file

	@Test
	public void emailvalidation() throws InterruptedException {
		registration();

		String str1 = "The email you want to use does not match the email of your school board."
				+ " The domain of your email address should be adsb.on.ca, email.adsb.on.ca, adsb.ca";
		List<WebElement> items = driver.findElements(By.cssSelector("ul li"));
		if (items.size() > 0) {
			for (WebElement we : items) {
				String str = we.getText();
				if (str.equals(str1)) {
					Assert.assertTrue(true);
					logger.info("invalid email");
				} else {
					Assert.assertTrue(false);
					logger.info("valid email");
				}

			}
		}

	}

}
