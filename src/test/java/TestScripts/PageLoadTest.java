package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class PageLoadTest {
	WebDriver driver;
  @Test (enabled =  true)
  public void PageLoad() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("http://uitestingplayground.com/");
	  driver.findElement(By.linkText("Load Delay")).click();
	  driver.findElement(By.cssSelector("button.btn btn-primary")).click();
	  //WebElement element = driver.findElement(By.id("ajaxButton")).click();
	 

	  driver.quit();
	  
  }
 
}
