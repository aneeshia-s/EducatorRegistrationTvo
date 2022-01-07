package com.tvoMpower.testcases;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TC010_BrokenLinkvalidation extends TC001_crossBrowser {

	// Testing for all broken links in website

	@Test
	public void BrokenLinkvalidation() throws InterruptedException {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			String url = it.next().getAttribute("href");
			logger.info(url);
			if (url == null || url.isEmpty()) {
				logger.info("URL is either not configured for anchor tag or it is empty");
				continue;
			}
		}
	}
}
