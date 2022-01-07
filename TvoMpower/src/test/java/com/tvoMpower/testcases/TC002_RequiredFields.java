package com.tvoMpower.testcases;

import org.testng.annotations.Test;

public class TC002_RequiredFields extends TC001_crossBrowser {
	
	//Testing required fields in website.
	//values can be added through config.properties file

	@Test
	public void requiredFields() throws InterruptedException {

		registration();

	}

}
