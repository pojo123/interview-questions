package com.clc.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions action = new Actions(driver);
//		driver.get("https://demoqa.com/droppable/");
//		WebElement source=driver.findElement(By.id("draggable"));
//		WebElement destination=driver.findElement(By.id("droppable"));
//		action.dragAndDrop(source, destination).perform();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement source1=driver.findElement(By.id("fourth"));
		WebElement destination1=driver.findElement(By.id("amt7"));
		action.dragAndDrop(source1, destination1).perform();
		
		
		
	}

}
