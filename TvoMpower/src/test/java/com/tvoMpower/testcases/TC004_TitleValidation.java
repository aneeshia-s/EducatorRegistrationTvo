package com.tvoMpower.testcases;

import org.testng.annotations.Test;

public class TC004_TitleValidation extends TC001_crossBrowser {

	// Validates Title of the page

	@Test
	public void titleValidation() throws InterruptedException {
		registration();

		if (driver.getTitle().equals("TVO mPower | Play Free Online Math Games K-6")) {

			logger.info("Valid Title");
		} else {

			logger.info("Invalid Title");
		}

	}

}
