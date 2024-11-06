package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Alerts {
	WebDriver driver;
  @Test
  public void Alert() throws InterruptedException {
	  driver = new EdgeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demoqa.com/alerts");
	  Thread.sleep(7000);
	  Actions act = new Actions(driver);
	  WebElement ele4 = driver.findElement(By.cssSelector("button#promtButton"));
	  act.moveToElement(ele4);
	  
	  
	  WebElement ele1 = driver.findElement(By.cssSelector("button#alertButton"));
	 
	  //act.moveToElement(ele1);
	  ele1.click();
	  Thread.sleep(2000);
	  org.openqa.selenium.Alert btn = driver.switchTo().alert();
	  System.out.println(btn.getText());
	  btn.accept();
	  WebElement widgetPath =driver.findElement(By.xpath("//*[text()='Widgets']"));
	  act.moveToElement(widgetPath);
	  WebElement ele2 =driver.findElement(By.cssSelector("button#timerAlertButton"));
	  Thread.sleep(5000);
	  //act.moveToElement(ele2);
	  ele2.click();
	  Thread.sleep(5000);
	  org.openqa.selenium.Alert btn1 = driver.switchTo().alert();
	  System.out.println(btn1.getText());
	  btn1.accept();
	  
	  WebElement ele3 =driver.findElement(By.cssSelector("button#confirmButton"));
	  Thread.sleep(5000);
	  //act.moveToElement(ele3);
	  ele3.click();
	  org.openqa.selenium.Alert btn2 = driver.switchTo().alert();

	  System.out.println(btn2.getText());
	  btn2.dismiss();

	  
	  Thread.sleep(5000);
	  org.openqa.selenium.Alert btn3 = driver.switchTo().alert();
	  act.moveToElement(ele4);
	  ele4.click();
	  System.out.println(btn.getText());
	  btn3.sendKeys("Name");
	  btn3.accept();
	  
	  
	 
	  System.out.println("Done");
	  
	  driver.quit();
	  
	  
	  
  }
}
