package com.tvoMpower.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC007_CheckBox extends TC001_crossBrowser {
	//Testing whether checkbox is working properly

	@Test
	public void checkbox() throws InterruptedException {
		registration();

		boolean enabled = driver.findElement(By.id("emailPromos")).isSelected();

		if (enabled) {

			logger.info("Checkbox selected");
		} else {

			logger.info("Checkbox not selected");
		}

	}

}
