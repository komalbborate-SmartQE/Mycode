package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class SwagLab_Login {

	@Test
	public void SwagLab_Login() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver Driver = new ChromeDriver(options);
		Driver.get("https://www.saucedemo.com");
		System.out.println(Driver.getTitle());
		
		WebElement username= Driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password= Driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login= Driver.findElement(By.id("login-button"));
		login.click();
		Driver.quit();
		
		
		

	}

}
