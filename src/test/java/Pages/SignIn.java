package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
public WebDriver driver;
	
	public SignIn (WebDriver driver){
		this.driver = driver;
}
	
	
	public Search toSearch (){
		driver.findElement(By.xpath(".//*[@id='global-search-input']")).sendKeys("Furniture");
		driver.findElement(By.xpath(".//*[@id='global-search-form']/div/div[3]/button")).click();
		return new Search(driver);
	}
}