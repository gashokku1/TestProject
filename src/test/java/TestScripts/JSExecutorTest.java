package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JSExecutorTest {
	WebDriver driver;
  @Test (enabled =  true)
  public void PageLoad() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	  driver.get("https://demo.opencart.com/");
	  Thread.sleep(2000);
	  JavascriptExecutor js =  (JavascriptExecutor) driver;
	  String title = (String) js.executeScript("return document.title");
	  System.out.println(title);
	  WebElement search = (WebElement) js.executeScript("return document.getElementsByName('search')[0]");
	  search.sendKeys("Phone");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
	  
	  js.executeScript("history.go(-1)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(10,700)");
	  Thread.sleep(2000);
	  js.executeScript("window.scrollBy(10,document.body.scrollHeight)");
	  Thread.sleep(2000);
	  //WebElement element = driver.findElement(By.id("ajaxButton")).click();
	 

	  driver.quit();
	  
  }
 
}
