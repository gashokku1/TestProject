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

public class MouseActions {

	WebDriver driver;

	@Test
	public void search() throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--blink-settings=imagesEnabled=false");
		driver = new ChromeDriver(opt);

		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//*[@name='search']"));
		act.contextClick(ele).perform();
		Thread.sleep(3000);
		System.out.println("right click done");
		WebElement mouseHover = driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[2]/a"));
		//act.moveToElement(mouseHover).perform();
		WebElement click = driver.findElement(By.xpath("(//ul[@class='nav navbar-nav']/li[2]/div//a)[1]"));
		//act.click(click).perform();
		act.moveToElement(mouseHover).click(click).perform();
		Thread.sleep(4000);
		driver.close();
		}

}
