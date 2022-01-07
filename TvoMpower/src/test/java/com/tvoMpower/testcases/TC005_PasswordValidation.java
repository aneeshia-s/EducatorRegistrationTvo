package com.tvoMpower.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC005_PasswordValidation extends TC001_crossBrowser

//Testing password field
//values can be added through config.properties file

{
	@Test
	public void passwordValidation() throws InterruptedException {
		registration();

		String str = driver.findElement(By.xpath("//*[@id=\"correctDirectiveSpacing\"]/div[2]/div/div")).getText();
		String str1 = "Your password must be 8-32 characters long";

		if (str.equals(str1)) {

			logger.info("invalid password");
		} else {

			logger.info("valid password");
		}

	}

}
