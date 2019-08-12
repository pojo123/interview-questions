package com.clc.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElement {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Boolean b = driver.findElement(By.id("btnLogin")).isDisplayed();
		System.out.println(b);
		
		String str = driver.findElement(By.id("logInPanelHeading")).getText();
		System.out.println(str);
		
		Boolean b1 = driver.findElement(By.id("btnLogin")).isEnabled();
		System.out.println(b1);
		
		
		String color = driver.findElement(By.id("btnLogin")).getCssValue("color");
		System.out.println(color);
		
		String fontsize = driver.findElement(By.id("btnLogin")).getCssValue("font-size");
		System.out.println(fontsize);
		
		String fontweight = driver.findElement(By.id("btnLogin")).getCssValue("font-weight");
		System.out.println(fontweight);	
		
		
		driver.close();
	}

}
