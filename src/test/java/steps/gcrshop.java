package steps;

import common.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;

public class gcrshop extends Baseclass {
	
	Homepage h1;
	
	@Given("i am on gcrshop administrator page")
	public void i_am_on_gcrshop_administrator_page() {
		
		launchbrowser();
	    
	}

	@When("i enter username on username box")
	public void i_enter_username_on_username_box() {

		
		h1 = new Homepage(driver);
		
		h1.entersearch();
	    
	}

	@When("i enter password on password box")
	public void i_enter_password_on_password_box() {
		
		h1.entersearch2();
	    
	}

	@When("i click on login button")
	public void i_click_on_login_button() {
		
		h1.clickbutton();
		
		closebrowser();
	    
	}

	@Then("i loged in gcrshop admin page")
	public void i_loged_in_gcrshop_admin_page() {
	    
	}

}
