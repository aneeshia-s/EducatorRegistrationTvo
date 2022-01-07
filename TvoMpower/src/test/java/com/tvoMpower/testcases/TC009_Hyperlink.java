package com.tvoMpower.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC009_Hyperlink extends TC001_crossBrowser  {
	//Testing whether the the hyperlinks given in website are active
	
	@Test
	public void checkbox() throws InterruptedException
	{
		
	
		driver.findElement(By.linkText("Terms and Conditions")).click();
		logger.info("Terms and conditions hyperlink clicked");
		driver.findElement(By.linkText("Back")).click();
		driver.findElement(By.linkText("Privacy Policy")).click();
		logger.info("Privacy Policy hyperlink clicked");
		driver.findElement(By.linkText("Back")).click();
	}

}
