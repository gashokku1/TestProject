package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	WebDriver driver;
  @Test
  public void UploadFile() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://blueimp.github.io/jQuery-File-Upload/");
	  Thread.sleep(4000);
	  
	  WebElement addFile = driver.findElement(By.xpath("//input[@type='file']"));
	  String path = System.getProperty("user.dir")+"//Test.jpg";
	  addFile.sendKeys(path);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//span[text()='Start upload']")).click();
	  Thread.sleep(3000);
	  System.out.println("Uploaded");
	  
	  driver.quit();
	  
  }
}
