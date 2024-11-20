package TestScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait {
	WebDriver driver;
  @Test (enabled =  true)
  public void ExplicitlyWait() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://uitestingplayground.com/ajax");
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(16));
	  //Thread.sleep(4000);
	  driver.findElement(By.id("ajaxButton")).click();
	  //WebElement element = driver.findElement(By.id("ajaxButton")).click();
	  wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("content")), "Data loaded with AJAX get request."));
	  System.out.println(driver.findElement(By.id("content")).getText());

	  driver.quit();
	  
  }
  @Test(enabled =  true)
  public void ThreadWait() throws InterruptedException {
	  driver = new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
  @Test(enabled =  true)
  public void WithoutWait() throws InterruptedException {
	  driver = new ChromeDriver();
	  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

	  driver.manage().window().maximize();
	  driver.get("https://stqatools.com/demo/Multiselect.php");
	  //Thread.sleep(4000);
	  
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
