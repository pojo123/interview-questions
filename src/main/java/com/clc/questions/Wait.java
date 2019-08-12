package com.clc.questions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.freecrm.com/");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement we= driver.findElement(By.id("b"));
		 
		 WebDriverWait wait= new WebDriverWait(driver, 10);
		 wait.until(ExpectedConditions.visibilityOf(we));
//		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("b")));
		 
		 FluentWait<WebDriver> fw = new FluentWait<WebDriver>(driver);
		 fw.withTimeout(20, TimeUnit.SECONDS).pollingEvery(4, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		 wait.until(ExpectedConditions.visibilityOf(we));
		 
		
		
	}
//	 WebElement element = wait.until(new Function<WebDriver, WebElement>() {
//	 public WebElement apply(WebDriver driver) {
//		 WebElement element = driver.findElement(By.xpath("//*[@id='softwareTestingMaterial']"));
//		 String getTextOnPage = element.getText();
//		 if(getTextOnPage.equals("Software Testing Material - DEMO PAGE")){
//		 System.out.println(getTextOnPage);
//		 return element;
//		 }else{
//		 System.out.println("FluentWait Failed");
//		 return null;
}
