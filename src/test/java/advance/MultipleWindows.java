package advance;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();	
		
		
		WebElement clickhere = driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		clickhere.click();
		clickhere.click();
		
		String parent = driver.getWindowHandle();
		System.out.println("***********************");
		System.out.println(parent);
		System.out.println("************************");
		
		
		Set<String> childs = driver.getWindowHandles();
		System.out.println("***************************");
		System.out.println(childs);
		System.out.println("****************************");
		
		
		//driver.switchTo().window(parent);
	}

}
