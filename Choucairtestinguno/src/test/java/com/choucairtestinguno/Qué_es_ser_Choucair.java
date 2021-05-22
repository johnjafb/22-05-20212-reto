package com.choucairtestinguno;
//import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.JavascriptExecutor;

public class Qué_es_ser_Choucair {
	 
	private WebDriver driver;
	
	By indelemen = By.cssSelector(".elementor-element-95db455 .elementor-row");
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
		//driver.quit();
	}

	@Test
	public void register() throws InterruptedException {
			if(driver.findElement(registerLinkLocator).isDisplayed()) {
				
			
			
			driver.findElement(indelemen).click();
			
		}
		else {
			
			
			System.out.print("Register pages was not found");
		}
		
		
		
		
	}

}
