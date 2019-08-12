package com.clc.questions;

import java.util.List;

import javax.swing.text.html.parser.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectProgram {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");

//		Select sc1 = new Select(driver.findElement(By.id("selenium_commands")));
//		List<WebElement> allOptions = sc1.getOptions();
//		for (WebElement element : allOptions) {
//			System.out.println("all available options-->"+element.getText());
//			
//			
//			
//		}

		Select sc = new Select(driver.findElement(By.id("selenium_commands")));
		sc.selectByVisibleText("Navigation Commands");
		sc.selectByVisibleText("Switch Commands");
		sc.selectByVisibleText("WebElement Commands");
		
		

		List<WebElement> str = sc.getAllSelectedOptions();
		for (WebElement str1 : str) {
			

			List<WebElement> allOptions = sc.getOptions();
			for (WebElement element : allOptions) {
				System.out.println("all available options-->" + element.getText());

			}
			System.out.println("all selected options-->" + str1.getText());
		}
		

//		Select sc1=new Select(driver.findElement(By.id("continents")));
//		boolean b=sc1.isMultiple();
//		System.out.println(b);
//		
//		Select sc2=new Select(driver.findElement(By.id("selenium_commands")));
//		boolean b1=sc2.isMultiple();
//		System.out.println(b1);
//		
		List<WebElement> list =sc.getOptions();
		for (WebElement webElement : list) {
			Boolean ele=webElement.isSelected();
			if(ele==false) {
				System.out.println("non selected elements are"+webElement.getText());
			}
		}

		driver.close();
	}

}
