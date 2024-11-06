package TestScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	WebDriver driver;
  @Test
  public void Windows() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://stqatools.com/demo/Windows.php");
	  Thread.sleep(4000);
	  String parentWindow = driver.getWindowHandle();
	  System.out.println("Parent window id = "+parentWindow);
	  
	  WebElement tab = driver.findElement(By.xpath("//button[contains(text(),'new Tab')]"));
	  tab.click();
	  System.out.println("Parent window title = "+driver.getTitle());
	  Set <String> handles = driver.getWindowHandles();
	  System.out.println(" window size = "+handles.size());
	  
	  for (String child:handles) {
		  System.out.println("Windows.."+ child);
		  if (!child.equalsIgnoreCase(parentWindow)) {
			  driver.switchTo().window(child);
			  System.out.println(" Current window title "+driver.getTitle());

		  }
	  }
	  driver.close();
	  driver.switchTo().window(parentWindow);
	  System.out.println("Parent window title = "+driver.getTitle());

	  
	  WebElement tab2 = driver.findElement(By.xpath("//button[contains(text(),'new Window')]"));
	  tab2.click();
	  System.out.println("Parent window title = "+driver.getTitle());
	  Set <String> handles2 = driver.getWindowHandles();
	  System.out.println(" window size = "+handles2.size());
	  Thread.sleep(3000);
	  for (String newChild:handles2) {
		  System.out.println("Windows.."+ newChild);
		  if (!newChild.equalsIgnoreCase(parentWindow)) {
			  driver.switchTo().window(parentWindow);
			  System.out.println(" Current window title "+driver.getTitle());

		  }
	  }
	  
	
	  driver.quit();
	  
  }
}
