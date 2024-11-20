package TestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputFilter.Status;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.opentelemetry.api.logs.Logger;

public class LogiinTest {
	WebDriver driver;
	Properties prop;
	
	
	@BeforeTest
	public void readProperty() throws IOException   {
		String path = System.getProperty("user.dir")+"\\src\\test\\resources\\configFiles\\config.properties";
		FileInputStream fin = new FileInputStream(path);
		prop = new Properties();
		prop.load(fin);
	}
	
	@BeforeMethod
	public void Before() throws InterruptedException {
		String strBrowser = prop.getProperty("browser");
		if (strBrowser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (strBrowser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
		Thread.sleep(2000);
	}
	@AfterTest
	  public void Quit()  {
		  driver.quit();
	  }
  @Test
  public void LaunchPage() throws InterruptedException {
	  
	  WebElement uName = driver.findElement(By.id("username"));
	  uName.sendKeys("tomsmith");
	  WebElement pWord = driver.findElement(By.id("password"));
	  pWord.sendKeys("SuperSecretPassword!");
	  WebElement login = driver.findElement(By.xpath("//*[text()=' Login']"));
	  login.submit();
	  System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	 
	  
  }
  
  @Test
  public void LaunchPageSecondTime() throws InterruptedException {
	  
	  Thread.sleep(2000);
	  WebElement uName = driver.findElement(By.id("username"));
	  uName.sendKeys("tomsmith");
	  WebElement pWord = driver.findElement(By.id("password"));
	  pWord.sendKeys("SuperSecretPassword!");
	  WebElement login = driver.findElement(By.xpath("//*[text()=' Login']"));
	  login.submit();
	  System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	 
	  
  }
  
}
