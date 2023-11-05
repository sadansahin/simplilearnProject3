package myProject3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartProjectSimpliLearn {
	
	
	@Test
	public void  project() {
	
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.turkishairlines.com/en-int/flights/booking/passenger-details/?cId=6e81293b-ac83-4c12-8507-c89d7635f727");
	driver.findElements(By.id("//*[@id=\"firstname_0\"]"));
	
	

	}
}
