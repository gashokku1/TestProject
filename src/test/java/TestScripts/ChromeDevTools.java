package TestScripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.DevToolsProvider;
//import org.openqa.selenium.devtools.v119.browser.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ChromeDevTools {
	ChromeDriver driver;
	DevTools tools;
	
	
	@BeforeMethod
	public void pageSetup() {
		driver = new ChromeDriver();
		//tools.createSession(driver.getWindowHandle());
		
	}
  @Test
  public void deviceModeTest() throws MalformedURLException, InterruptedException {
	  Map deviceMetrics = new HashMap() {{
		  put("width", 600);
		  put("height", 900);
		  put("deviceScaleFactor", 50);
		  put("mobile", true);
	  }
		  
	  };
	  driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", deviceMetrics);
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
  @Test
  public void geoLocationTest() throws MalformedURLException, InterruptedException {
	  Map deviceMetrics = new HashMap() {{
		  put("latitude", 37.780079);
		  put("longitude", -122.420174);
		  put("accuracy", 100);
		 
	  }
		  
	  };
	  driver.executeCdpCommand("Emulation.setGeolocationOverride", deviceMetrics);
	  driver.get("https://oldnavy.gap.com/stores");
	  Thread.sleep(4000);
  }
}
