package com.clc.questions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinimizeWindow {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Dimension d1=driver.manage().window().getSize();  //gives size of current window
		System.out.println(d1);
		
		if (true)
			return;
		
		driver.manage().window().maximize();          //maximizes the window
		
		Dimension d = new Dimension(700, 450);
		driver.manage().window().setSize(d);           //minimizes the window
		TimeUnit.SECONDS.sleep(2);
		driver.quit();

	}

}
