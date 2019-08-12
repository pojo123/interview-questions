package com.clc.questions;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");

		String parentWin = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();

		Set<String> windows = driver.getWindowHandles();
		for (String string : windows) {
			String window2 = string;
			if (!parentWin.equals(window2)) {
				driver.switchTo().window(window2);

				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("abcd@gmail.com");
				driver.findElement(By.name("btnLogin")).click();

				Set<String> windowss = driver.getWindowHandles();
				for (String string2 : windowss) {
					if (!parentWin.equals(string2) || window2.equals(string2)) {
						driver.switchTo().window(string2);

						List<WebElement> colls = driver.findElement(By.tagName("table")).findElement(By.tagName("tr"))
								.findElements(By.tagName("td"));
						for (WebElement cell : colls) {
							System.out.println(cell.getText());
							
							driver.switchTo().window(parentWin);
 
						}
					}
				}
			}

		}

	}

}
