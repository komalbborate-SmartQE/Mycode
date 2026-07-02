package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class Login {

	@Test
	public void Login() {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.saucedemo.com/");
		Driver.manage().window().maximize();
		
		//System.out.println(Driver.getTitle());
		
		Driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Driver.findElement(By.id("login-button")).click();
		String Actualtext=Driver.findElement(By.className("title")).getText();
		if(Actualtext.equals("Products")) {
			System.out.print("login pass");
		}else {
			System.out.print("fail");
		}
		Driver.quit();

	}

}
