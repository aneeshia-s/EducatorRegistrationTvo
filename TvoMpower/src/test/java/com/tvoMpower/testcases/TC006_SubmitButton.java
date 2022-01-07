package com.tvoMpower.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC006_SubmitButton extends TC001_crossBrowser {

	//Testing Submit Button
	
	@Test
	public void submitbutton() throws InterruptedException {
		registration();

		boolean exists = driver.findElements(By.id("registationImages")).size() != 0;

		if (exists) {

			logger.info("error");
		} else {

			logger.info("Form Submitted ");
		}

	}

}
