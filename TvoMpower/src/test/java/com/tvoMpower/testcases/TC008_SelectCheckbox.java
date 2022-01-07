package com.tvoMpower.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC008_SelectCheckbox extends TC001_crossBrowser {
	//Testing whether checkbox can be selected

	@Test
	public void SelectCheckbox() throws InterruptedException {

		WebElement checkbox = driver.findElement(By.id("emailPromos"));
		checkbox.click();
		logger.info("Checkbox Selected");

	}
}
