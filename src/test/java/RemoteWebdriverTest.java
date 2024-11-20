

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.devtools.v119.browser.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class RemoteWebdriverTest {
	WebDriver driver;
  @Test
  public void VMDriver() throws MalformedURLException, InterruptedException {
	  ChromeOptions options = new ChromeOptions();
	  options.setCapability(CapabilityType.PLATFORM_NAME, Platform.WINDOWS);
	  //options.setCapability(CapabilityType.BROWSER_VERSION, "130");
	  String url = "http://10.0.12.2:4444";
	  driver = new RemoteWebDriver(new URL(url), options);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Java Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		Thread.sleep(4000);
		driver.close();
  }
}
