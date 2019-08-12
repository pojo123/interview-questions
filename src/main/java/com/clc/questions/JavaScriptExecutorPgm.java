package com.clc.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorPgm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		WebElement button=driver.findElement(By.id("btnLogin"));
		
		//Perform Click on LOGIN button using JavascriptExecutor
		js.executeScript("arguments[0].click();", button);
		
		 //To generate Alert window using JavascriptExecutor. Display the alert message 	
		js.executeScript("alert('Welcome to OrangeHRM');");  

	}

}
