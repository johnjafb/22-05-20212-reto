package com.choucairtestinguno;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TérminosyCondiciones {
    
	
	private WebDriver driver;
	
	By indelemen = By.cssSelector("text-center:nth-child(1)");
	By homePageLocator = By.xpath(" //a[contains(text(),\\'What is being Choucair?\\')]");
	By registerLinkLocator = By.linkText("What is being Choucair?");

	//By findElement = By.cssSelector("div:nth-child(2) > .tF2Cxc .LC20lb");
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
	}

	@Test
	public void test() {
		
if(driver.findElement(indelemen).isDisplayed()) {
				driver.findElement(indelemen).click();
			
		}
		else {
			
			
			System.out.print("Register pages was not found");
		}
		fail("Not yet implemented");
	}

}
