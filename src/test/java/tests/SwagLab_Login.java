package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwagLab_Login {

	@Test
	public void SwagLab_Login() {
		// TODO Auto-generated method stub
		WebDriver Driver= new ChromeDriver();
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
