package TestScripts;

import java.io.ObjectInputFilter.Status;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;

public class LocatorClass {
	WebDriver driver;
  @Test
  public void LaunchPage() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/login");
	  Thread.sleep(2000);
	  WebElement uName = driver.findElement(By.id("username"));
	  uName.sendKeys("tomsmith");
	  WebElement pWord = driver.findElement(By.id("password"));
	  pWord.sendKeys("SuperSecretPassword!");
	  WebElement login = driver.findElement(By.xpath("//*[text()=' Login']"));
	  login.click();
	  System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	  driver.quit();
	  
  }
}
