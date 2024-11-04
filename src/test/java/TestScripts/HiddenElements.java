package TestScripts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import net.bytebuddy.asm.MemberSubstitution.Current;

public class HiddenElements {
	WebDriver driver;
  @Test
  public void Hidden() throws InterruptedException, IOException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://automationbookstore.dev/");
	  Thread.sleep(2000);
	  
	  WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchBar']"));
	  searchBox.sendKeys("Test");
	  TakesScreenshot screenShot = (TakesScreenshot) driver ;
	  File img = screenShot.getScreenshotAs(OutputType.FILE);
	  String path = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
	  
	  FileUtils.copyFile(img, new File(path));
	  WebElement closeBtn = driver.findElement(By.xpath("//*[@title='Clear text']"));
	  System.out.println("Navigated to the page sucessfully"+ driver.getTitle());
	  System.out.println(closeBtn.isDisplayed());
	  
	  File img1 = closeBtn.getScreenshotAs(OutputType.FILE);
	  String path1 = System.getProperty("user.dir")+"/screenshots/"+System.currentTimeMillis()+".png";
	  
	  FileUtils.copyFile(img1, new File(path1));
	  if (closeBtn.isDisplayed()) {
		closeBtn.click();
	}
	  else {
		  System.out.println("Not displayed");
	}
	  
	  driver.quit();
  }
}
