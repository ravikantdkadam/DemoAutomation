package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase1 {
	


public static Properties prop;

FileInputStream fis;

	public TestBase1()    {          // constructor of Base Class

		try {
		Properties 	prop =new Properties();			
			 
			 FileInputStream fis = new FileInputStream("D:\\C drive Data 26_06_23\\eclipse-workspace\\AmazonFeatureTest\\src\\main\\java\\Config\\configuration.properties");
			  
			 prop.load(fis);
			
		} catch (IOException e) {
			e.getMessage();
		}
		
		
	
		}
	public static void initilization() { 
		
		
		String browsername = prop.getProperty("browser");		
		if (browsername.equals("Chrome")) {
			
			System.setProperty("webdriver.Chrome.driver", "D:\\Testing\\Automation Testing\\chromedriver.exe");

			WebDriver driver = new ChromeDriver(); 
			 
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();

	      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      
	      
	      driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			
		}
		
	}}


