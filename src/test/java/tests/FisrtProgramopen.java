package tests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FisrtProgramopen {

	@Test
	public void FisrtProgramopen() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		WebElement search= driver.findElement(By.name("q"));
		search.sendKeys("which is best coffee shop");
		driver.quit();

	}

}
