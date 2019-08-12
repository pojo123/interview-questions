package com.clc.questions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewBrowserWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
//		WebElement wb=driver.findElement(By.xpath("//button[@id='button1']"));
		driver.get("https://chandanachaitanya.github.io/selenium-practice-site/?languages=Java&enterText=");
		String parentWindow = driver.getWindowHandle();

		driver.findElement(By.id("win2")).click();
		Set<String> windows = driver.getWindowHandles();

		for (String window2 : windows) {
			if (!parentWindow.equals(windows)) {
				driver.switchTo().window(window2);
				System.out.println(driver.getTitle());
				String lastWindow = window2;

			}
			driver.switchTo().window(parentWindow);
		}
		System.out.println(driver.getTitle());

		System.out.println(driver.getTitle());

	}

}
