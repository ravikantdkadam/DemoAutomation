package RunnerClass;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(      
		features = "D:\\C drive Data 26_06_23\\eclipse-workspace\\AmazonFeatureTest\\src\\main\\java\\AmazonFeature",    // The path to the feature file is specified by feature options 
		
		glue={"StepDefination"},   // This argument used to provide step defination file location
		
		dryRun=false ,          //dryRun compile the feature file and Step Defination 
		
		
		monochrome =true,    // Display the console outout in readable format 
		
	
		
		
		//tags="@SmokeTest",  // We can mention tags to scenario in featureFile for grouping 
		   

		plugin = {"pretty", "html:target/cucumber-reports.html",
				"pretty", "json:target/cucumber-reports.json" ,
				"pretty",  "junit:target/cucumber-reports.xml"}


		)


public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}



