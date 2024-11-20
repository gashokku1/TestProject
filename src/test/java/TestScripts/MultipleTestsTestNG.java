package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleTestsTestNG {

	WebDriver driver;

	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.setBrowserVersion("120");
		driver = new ChromeDriver(opt);

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}

	
	@Test
	public void search() {
		
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Java Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		
		}
	

	@Test  (priority = 2)
	public void searchTestTwo() {
		
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Selenium Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.findElement(By.id("1234567890000"));
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		
		}
	
	@Test  (priority = -1)
	public void Javascript() {
		
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Javascript Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		
		}
	@Test (priority = 4)
	public void AppiumTest() {
		
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Appium Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		
		}
	
	@Test (priority = 1, alwaysRun = true,  dependsOnMethods = "searchTestTwo")
	public void PythonTest() {
		
		//WebElement element = driver.findElement(By.xpath("//*[@title='Search']"));
		WebElement element = driver.findElement(By.tagName("textarea"));
		element.sendKeys("Python Tutorial");
		element.sendKeys(Keys.ENTER);
		System.out.println("The title is " + driver.getTitle());
		driver.navigate().back();
		System.out.println("The title after navigate().back() is  " + driver.getTitle());
		driver.navigate().forward();
		System.out.println("The title is after navigate().forward() " + driver.getTitle());
		
		}
	@AfterTest
	public void finishExtent() {
		
	}
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}

}
