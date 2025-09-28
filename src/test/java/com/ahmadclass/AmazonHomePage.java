package com.ahmadclass;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePage {

    //this change has been done on git main repo through git is it showing
    private WebDriver driver;
    @Test
    public void testAmazonSearch() {
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
/*
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.cssSelector("[href=\"https://www.google.com/setprefs?sig=0_G7A_IeZnO37jU2sSZKY7jzAKaCs%3D&hl=en&source=homepage&sa=X&ved=0ahUKEwj8mqyArtaPAxURWUEAHTtnAO8Q2ZgBCBY\"]")).click() ; 
        driver.findElement(By.cssSelector("[title=\"Search\"]")).sendKeys("Ahmad") ; 
        driver.findElement(By.cssSelector("div>center>[aria-label=\"Google Search\"][role=\"button\"]")).click() ; 
        
        

        System.out.println("Page title is: " + driver.getTitle());

        driver.quit(); 
       */
