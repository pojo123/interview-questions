package com.clc.questions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		Select select = new Select(driver.findElement(By.id("selenium_commands")));
		List<WebElement> allOptions = select.getOptions();
		for (WebElement webElement : allOptions) {
			if(webElement.getText().contains("commands")) {
				System.out.println(webElement.getText());
			}
		}

	}

}
