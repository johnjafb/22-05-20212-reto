package com.choucairtestinguno;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTours_AutomatedTest {
	private WebDriver driver;
	
	
	By findElement = By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb");
	By usernameLocator = By.id("search_keywords");
	By passwordLocator = By.id("search_location");
	

	By registerBtnLocator = By.cssSelector(".search_submit > input");
	
	
	@Before
	public void setUp() throws Exception {   
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/en/jobs/");
	
	
	
	}

	@After
	public void tearDown() throws Exception {
	 // driver.quit();
		
	
	
	}

	@Test
	
	public void registerUser() throws InterruptedException {
		
		
		if(driver.findElement(usernameLocator).isDisplayed()) {
			
			driver.findElement(usernameLocator).sendKeys("analista");
			driver.findElement(passwordLocator).sendKeys("bogota");
			
			System.out.print("Register pagesj was not found");
			Thread.sleep(4000);
			driver.findElement(registerBtnLocator).click();
			
			Thread.sleep(6000);
			System.out.print("Register pagesjjjj was not found");
		}
		else {
			System.out.print("Register pages was not found");
		}
		
			
		}
		
		
		
	}



