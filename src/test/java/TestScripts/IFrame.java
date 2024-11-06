package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IFrame {
	WebDriver driver;
  @Test
  public void frame() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/iframe");
	  Thread.sleep(4000);
	  	  
	  WebElement frame = driver.findElement(By.id("mce_0_ifr"));
	  
	  driver.switchTo().frame(frame);
	  System.out.println("Parent window title = "+driver.getTitle());
	  
	  WebElement inputText = driver.findElement(By.id("tinymce"));
	  
	  System.out.println("Text is = "+inputText.getText());

	  driver.switchTo().defaultContent();
	  
	  System.out.println("Parent window title = "+driver.getTitle());
	  WebElement link = driver.findElement(By.cssSelector("span.tox-statusbar__branding"));
	  link.click();
	  System.out.println("Parent window title = "+driver.getTitle());
	 System.out.println("Action done");
	  
	
	  driver.quit();
	  
  }
}
