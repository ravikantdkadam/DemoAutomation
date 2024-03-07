package pages;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class loginpage { 
		
		// @FindBy annotation used from pagefatcory class 
		
		
		@FindBy (id="email")  WebElement username;	
		@FindBy (id="password")  WebElement Password;
		@FindBy (name="signInSubmit")  WebElement loginbutton;
		@FindBy (id="continue") WebElement Continuebutton;


		// To initialize the element we use initElements() method of PageFactory class. It takes two arguments ---or Constructor


		public loginpage(WebDriver driver) {
		
			PageFactory.initElements(driver, this);
		}

		public void enterusername(String un) {
			
		username.sendKeys(un);                        // Sendkeys action perform 
			
		}
		
		public void enterpassword(String pwd) {
			
			Password.sendKeys(pwd);                  // Sendkeys action perform 
			
		}
		
		public void clicklogin() {
			
			loginbutton.click();                  // click action perform 
			
		}
		
		public void ClickContinuebutton() {
			
			Continuebutton.click();
		}

	}



