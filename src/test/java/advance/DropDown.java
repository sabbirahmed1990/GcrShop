package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		
		Select s = new Select(dropdown);
		s.selectByIndex(2);
		s.selectByVisibleText("Option 1");
		
		
		
		
	}

}
