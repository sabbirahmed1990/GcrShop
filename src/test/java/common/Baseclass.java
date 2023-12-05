package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	public WebDriver driver;
	
	public void launchbrowser() {
		
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		
		driver.get("http://gcreddy.com/project/admin/login.php");
		driver.manage().window().maximize();
	}	
		
	public void closebrowser() {
		driver.close();
		
	}
		
}
	

