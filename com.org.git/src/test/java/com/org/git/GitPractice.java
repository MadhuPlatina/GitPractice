package com.org.git;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitPractice {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.get("https://www.fooddepot.com/");
		 String Title=driver.getTitle();
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//ul[@id='top-menu']//a[text()='Weekly Ad']")).click();
		 driver.findElement(By.xpath("//img[@id='logo']")).click();
		 String ExpectedTitle=driver.getTitle();
		 Assert.assertEquals(Title, ExpectedTitle);
		 driver.findElement(By.xpath("//*[@id='top-menu']//*[text()='Locations']")).click();
		 //Thread.sleep(10);
		 driver.findElement(By.xpath("//img[@id='logo']")).click();

		
		
		
	}

}
