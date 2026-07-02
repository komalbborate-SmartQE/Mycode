package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Title {

	@Test
	public void Title() {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver Driver = new ChromeDriver(options);
		
		Driver.manage().window().maximize();
		Driver.get("https://www.saucedemo.com/");
		System.out.print(Driver.getTitle());
		Driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Driver.findElement(By.id("login-button")).click();
		String Actualtext= Driver.findElement(By.className("title")).getText();
		if(Actualtext.equals("Products")) {
			System.out.print("test case pass");
		}else {
			System.out.print("fail");
		}
		Driver.quit();

	}

}
