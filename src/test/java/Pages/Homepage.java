package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	public WebDriver driver;
	
	public Homepage (WebDriver driver){
		this.driver = driver;
	}
public SignIn toSignIN (){
	driver.findElement(By.xpath("html/body/div[1]/div/div/div/header/div/div[2]/div/div/div/div/div/div[6]/div/div/div/div[1]/a")).click();
   return new SignIn(driver);

}




}
