package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileDownload {
	WebDriver driver;
  @Test
  public void Download() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://watir.com/examples/shadow_dom");
	  Thread.sleep(4000);
	  
	  WebElement download = driver.findElement(By.cssSelector("//*[text()='chromedriver_win32.zip']"));
	  
	  Thread.sleep(3000);
	  download.click();
	  Thread.sleep(3000);
	  System.out.println("Uploaded");
	  
	  
	  
  }
}
