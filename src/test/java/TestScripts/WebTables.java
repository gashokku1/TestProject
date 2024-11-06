package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTables {
	WebDriver driver;
  @Test
  public void AutoCompleteTest() throws InterruptedException {
	  driver = new ChromeDriver();

		driver.get("https://jqueryui.com/autocomplete/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement element = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(element);
		WebElement input = driver.findElement(By.cssSelector("input#tags"));
		input.sendKeys("a");
		Thread.sleep(2000);
		java.util.List<WebElement> Elementslist = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		int list = Elementslist.size();
		
		for (WebElement singleElement: Elementslist) {
			String item = singleElement.getText();
			if(item.equalsIgnoreCase("Asp")) {
				System.out.println("Item selected"+ item);
				singleElement.click();
			}
		
		}
  }
}
