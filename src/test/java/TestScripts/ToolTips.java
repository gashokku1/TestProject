package TestScripts;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ToolTips {
	WebDriver driver;
  @Test
  public void Tooltip() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://jqueryui.com/tooltip/");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	  WebElement tooltipInputBox = driver.findElement(By.cssSelector("input#age"));
	  tooltipInputBox.sendKeys(Keys.ARROW_DOWN);
	  act.moveToElement(tooltipInputBox);
	  
	  WebElement tooltip = driver.findElement(By.cssSelector("div.ui-tooltip-content"));
	  
	 
	  System.out.println("Tootip = "+tooltip.getText());
	  tooltipInputBox.sendKeys("500");
	  Thread.sleep(2000);
	  
	 
	  
	
	  driver.quit();
	  
  }
}
