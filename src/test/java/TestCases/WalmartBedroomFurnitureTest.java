package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


import Pages.Search;
import Pages.SignIn;

public class WalmartBedroomFurnitureTest {
	WebDriver driver = new FirefoxDriver ();	
	@Test
	public void tobedroomfurniture  (){
	
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		SignIn s = new SignIn(driver);
		Search se = new Search (driver);
	
		s.toSearch();
		se.tobedroomfurniture();
		//driver.close();
	}


}
