package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoComplete {
	WebDriver driver;
  @Test
  public void List() {
	  driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		java.util.List<WebElement> element = driver.findElements(By.xpath("//td[text()='Learn Java']/following-sibling::td"));
		
		for (WebElement items: element) {
		System.out.println("The Total no of elements " + element.size());
		System.out.println("Element is " + items.getText());
		
		
		}
  }
}
