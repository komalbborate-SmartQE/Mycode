package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {

	@Test
	public void Logout() {
		// TODO Auto-generated method stub
		WebDriver Driver =  new ChromeDriver();
		
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
		Driver.findElement(By.id("react-burger-menu-btn")).click();
		Driver.findElement(By.className("bm-item menu-item")).click();
		
		
	
		Driver.quit();

	}

}
