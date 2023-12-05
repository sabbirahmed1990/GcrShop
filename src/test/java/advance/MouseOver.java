package advance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args) {


		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();	
		
		
		WebElement img1 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[1]"));
		
		WebElement p1 = driver.findElement(By.xpath("(//a[text()='View profile'])[1]"));
		
		
		Actions act = new Actions(driver);
		act.moveToElement(img1).click().moveToElement(p1).click().build().perform();
		
		
	}

}
