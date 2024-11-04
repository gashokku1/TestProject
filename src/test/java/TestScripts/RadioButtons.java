package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButtons {
	WebDriver driver;
  @Test
  public void RadioBtn() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/checkboxes");
	  Thread.sleep(4000);
	  
	  WebElement radioBtn = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
			  radioBtn.click();
			  boolean  radioBtn2 = driver.findElement(By.xpath("//input[@type='checkbox'][1]")).isSelected();
	  System.out.println(radioBtn.isSelected());
	  if (radioBtn2) {
		  
		System.out.println("checked");
		radioBtn.click();
	}
	  else {
		  radioBtn.click();
		  System.out.println("chekced");
	}
	  driver.quit();
	  
  }
}
