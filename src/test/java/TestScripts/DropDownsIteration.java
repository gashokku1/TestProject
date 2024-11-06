package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownsIteration {
	WebDriver driver;
  @Test
  public void IterationConcept() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.opencart.com/");
	  Thread.sleep(4000);
	  Actions act = new Actions(driver);
	  WebElement mouseHover = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[3]"));
		act.moveToElement(mouseHover).perform();
		List <WebElement> items = driver.findElements(By.xpath("(//ul[@class='nav navbar-nav']/li[2]/div//a)"));
		//act.click(click).perform();
		int num = items.size();
		for (int i=0;i<num;i++ ) {
			WebElement item = items.get(i);
			if (item.getText().equalsIgnoreCase("Monitors (2)")) {
				item.click();
				break;
				
			}
			Thread.sleep(3000);
		}

	  driver.quit();
	  
  }
}
