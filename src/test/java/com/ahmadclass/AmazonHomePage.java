package com.ahmadclass;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage {

    private WebDriver driver;
    @Test
    public void testAmazonSearch() {
    	
    	//this change is from Walaa Dames
    	
    	//this commit is from github desktop
        // Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	//asdasdasd
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	// Setup ChromeDriver using WebDriverManager
    	
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Add implicit wait
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.ae/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPad") ; 
        // Example: Select from dropdown list
        // Replace 'dropdownId' with the actual id of your dropdown
        //Select dropdown = new Select(driver.findElement(By.cssSelector("dropdownId")));
        // dropdown.selectByVisibleText("OptionText");
        driver.quit() ; 
    }
    
    @Test
    public void getPageTitle() {
        // Setup ChromeDriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.amazon.ae/");
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        driver.quit();
    }
}

