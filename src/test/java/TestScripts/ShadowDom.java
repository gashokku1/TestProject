package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ShadowDom {
	WebDriver driver;
  @Test
  public void Download() throws InterruptedException {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://watir.com/examples/shadow_dom");
	  Thread.sleep(4000);
	  
	  WebElement host = driver.findElement(By.cssSelector("div#shadow_host"));
	  SearchContext context = host.getShadowRoot();
	  WebElement shadowContent = context.findElement(By.cssSelector("span#shadow_content"));
	  System.out.println("Content is accessible now "+shadowContent.getText());
	  Assert.assertEquals(shadowContent.getText(), "some text");
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(shadowContent.getText(), "some text");
	  
	  WebElement innerShadow = context.findElement(By.cssSelector("div#nested_shadow_host"));
	  SearchContext innerContext = innerShadow.getShadowRoot();
	  WebElement shadowContent2 = innerContext.findElement(By.cssSelector("div#nested_shadow_content"));
	  System.out.println("Inner Content is accessible now "+shadowContent2.getText());
	  Assert.assertEquals(shadowContent2.getText(), "nested text");	  
	  soft.assertEquals(shadowContent2.getText(), "nested text");
	  Thread.sleep(3000);
	 
	  System.out.println("Done");
	  
	  
	  
	  
	  
  }
}
