package TestScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns {
	WebDriver driver;
  @Test
  public void RadioBtn() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://stqatools.com/demo/Multiselect.php");
	  Thread.sleep(4000);
	  
	  Select sel = new Select(driver.findElement(By.cssSelector("select.date_s")));
	  sel.selectByVisibleText("1985");
	  Select sel1 = new Select(driver.findElement(By.cssSelector("select.name_s")));
	  sel1.selectByVisibleText("Jonny Wayne");
	  sel1.selectByIndex(2);
	  sel1.selectByValue("Martina");
	  sel1.getAllSelectedOptions();
	  List<WebElement> ele = driver.findElements(By.xpath("//select[@class='name_s']/option"));
	  int i = 1;
	  WebElement ele1 =  driver.findElement(By.xpath("//select[@class='name_s']/option["+i+"]"));
	  int size = ele.size();
	  for (i=1;i<=size;i++) {
		  System.out.println(ele1.getText());
	  }

	  driver.quit();
	  
  }
}
