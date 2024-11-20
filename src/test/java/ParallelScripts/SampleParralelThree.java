package ParallelScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleParralelThree {
		
	@Test
	public void SampleOne() {
		
		
		System.out.println("Sample one Three got executed...." );
		
		}
	

	@Test
	public void SampleTwo() {
		
		
		System.out.println("Sample SampleTwo  Three got executed...." );
		
		}
	
	@Test (groups = "FeatureThree")
	public void SampleThree() {
		
		
		System.out.println("Sample SampleThree Three got executed...." );
		
		}
	
	@Test(groups = "FeatureOne")
	public void SampleFour() {
		
		
		System.out.println("SampleFour Three got executed...." );
		
		}


}
