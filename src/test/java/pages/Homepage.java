package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name ="username")
	WebElement username;
	
	
	public void entersearch() {
		username.sendKeys("gcreddy");
		
	}
	
	@FindBy(name ="password")
	WebElement password;
	
	public void entersearch2() {
		password.sendKeys("Temp@2020");
		
	}
	
	
	@FindBy(id ="tdb1")
	WebElement button;
	
	public void clickbutton() {
		button.click();
	}

}
