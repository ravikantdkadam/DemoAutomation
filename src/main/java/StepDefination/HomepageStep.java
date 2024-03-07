package StepDefination;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginpage;
import utils.TestBase;

public class HomepageStep extends TestBase  {
	WebDriver driver;
	
	loginpage lp=new loginpage(driver);

@Given("User is already on login page")
public void user_is_already_on_login_page() {
   TestBase.initilization();
}

@When("Title of login page is Amazon.com")
public void title_of_login_page_is_amazon_com() {
	
	
   
}

@Then("User enters {string}")
public void user_enters(String username) {
	
	lp.enterusername(username);
    
}

@Then("User clicks on Continue button")
public void user_clicks_on_continue_button() {
	
	lp.ClickContinuebutton();
    
}

@Then("User enter the {string}")
public void user_enter_the(String password) {
	
	lp.enterpassword(password);
   
}

@Then("User click on signin Button")
public void user_click_on_signin_button() {
	
	lp.clicklogin();
   
}




}
