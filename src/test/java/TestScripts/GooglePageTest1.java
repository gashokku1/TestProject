package TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class GooglePageTest1 {

	WebDriver driver;

	@Test
	public void search() {
		ChromeOptions opt = new ChromeOptions();
		opt.setBrowserVersion("120");
		driver = new ChromeDriver(opt);

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
		
		driver.close();
		}

}
