package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {

public WebDriver driver;
	
	public Search (WebDriver driver){
		this.driver = driver;
	}
	
	public bedroomFurniture tobedroomfurniture (){
		
		driver.findElement(By.xpath(".//*[@id='BedroomFurniture-menu-button']/span[1]")).click();
		//driver.findElement(By.xpath(".//*[@id='global-search-form']/div/div[3]/button")).click();
		return new bedroomFurniture (driver);
	}
}
