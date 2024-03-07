Feature: Amazonproject  Feature Test


Scenario Outline: Amazon login Feature_Test

Given User is already on login page 
When Title of login page is Amazon.com 
Then User enters "<username>"
And User clicks on Continue button 
Then User enter the "<password>"
And User click on signin Button 

 Examples:

    |username | password |    
    |9975674668  | Ravikant@25|
    
