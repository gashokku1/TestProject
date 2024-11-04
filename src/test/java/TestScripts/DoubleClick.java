package TestScripts;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick {

	WebDriver driver;

	@Test
	public void search() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--blink-settings=imagesEnabled=false");
		driver = new ChromeDriver(opt);

		driver.get("https://stqatools.com/demo/DoubleClick.php");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		/*
		 * WebElement ele = driver.findElement(By.xpath("//*[@name='search']"));
		 * act.contextClick(ele).perform(); Thread.sleep(3000);
		 */
		System.out.println("right click done");
		WebElement doubleClick = driver.findElement(By.xpath("//*[@class='col-lg-6']//button"));
		//act.moveToElement(mouseHover).perform();
		/*
		 * WebElement click =
		 * driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li[2]/div//a)[1]"
		 * )); //act.click(click).perform();
		 */		act.doubleClick(doubleClick).doubleClick(doubleClick).perform();
		Thread.sleep(4000);
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement scroll = driver.findElement(By.xpath("//*[text()='Customer Service']"));
		
		 act.scrollToElement(scroll).doubleClick(scroll).perform();
		 Thread.sleep(4000);
		 
		 driver.get("https://stqatools.com/demo/Drag&Drop.php");
			driver.manage().window().maximize();
			Thread.sleep(4000);
			WebElement source = driver.findElement(By.xpath("//*[@id='dragA']"));
			WebElement target = driver.findElement(By.xpath("//*[@id='dropBox']"));
			
			 act.dragAndDrop(source,target).perform();
			 Thread.sleep(4000);
		
		driver.close();
		}

}
