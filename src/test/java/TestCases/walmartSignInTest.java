package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Pages.Homepage;

public class walmartSignInTest {
	WebDriver driver = new FirefoxDriver ();
	
	@Test
	public void toSignInTest (){
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Homepage hp = new Homepage(driver);
		hp.toSignIN();
		driver.close();
	}
	
	
	
	

	
}
