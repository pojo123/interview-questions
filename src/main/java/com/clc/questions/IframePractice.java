package com.clc.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframePractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://hugelearning.com/iframe-practice-page/");
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.name("First_Name")).sendKeys("sweety");
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("iframe2");
		String text=driver.findElement(By.id("post-364")).getText();
		System.out.println(text);
		
	
		
	}

}
