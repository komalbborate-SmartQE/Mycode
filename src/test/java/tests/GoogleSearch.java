package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GoogleSearch {

    @Test
    public void GoogleSearch() {

    	 ChromeOptions options = new ChromeOptions();
         options.addArguments("--headless=new");
         options.addArguments("--no-sandbox");
         options.addArguments("--disable-dev-shm-usage");

         WebDriver Driver = new ChromeDriver(options);
        Driver.get("https://www.google.com");

        WebElement searchBox = Driver.findElement(By.name("q"));

        searchBox.sendKeys("Selenium");

        searchBox.submit();

    }
}