package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {

	static WebDriver driver;
	public static void systemConfig() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}

	public static void openUrl(String url) {
      driver.get(url);
	}

	public static void maxWindow() {
		driver.manage().window().maximize();
	}

	public static void type(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();	
	}

	public static void selectOptionByText(WebElement element, String text) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	public static void selectOptionByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}
	public static void selectOptionByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.deselectByIndex(index);
	}
	public void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public void closeBrowser() {
		driver.quit();
	}
}

