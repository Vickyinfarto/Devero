package com.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalLibrary {
	public static WebDriver driver;
	
	public static void elementClick(WebElement element) throws Exception {
		try {
			WebDriverWait wb = new WebDriverWait(driver, 10);
			wb.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		} catch (Exception e) {
			
			elementClickUsingJS(element);
		}
		
	}
		public static void elementClickUsingJS(WebElement element) {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
		}

}
