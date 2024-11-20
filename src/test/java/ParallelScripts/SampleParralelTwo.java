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

public class SampleParralelTwo {
		
	@Test(groups = "FeatureThree")
	public void SampleOne() {
		
		
		System.out.println("SampleOne Two got executed...." );
		long threadid = Thread.currentThread().getId();
		System.out.println("SampleOne Two got executed...." +threadid);
		}
	

	@Test(groups = "FeatureTwo")
	public void SampleTwo() {
		
		
		System.out.println(" SampleTwo Two got executed...." );
		long threadid = Thread.currentThread().getId();
		System.out.println(" SampleTwo Two got executed...." +threadid);
		}
	
	@Test
	public void SampleThree() {
		
		
		System.out.println(" SampleThree Two got executed...." );
		long threadid = Thread.currentThread().getId();
		System.out.println(" SampleThree Two got executed...." +threadid);
		}
	
	@Test(groups = "FeatureOne")
	public void SampleFour() {
		
		long threadid = Thread.currentThread().getId();
		System.out.println("SampleFour got executed...." +threadid);
		System.out.println("SampleFour got executed...." );
		
		}


}
