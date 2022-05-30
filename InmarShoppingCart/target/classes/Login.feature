Feature: Login

@sample
Scenario: Successful Login with Valid Credentials
Given User Launch Chrome Browser
When User Opens URL "http://automationpractice.com/index.php"
And User Enters Email as "gouthamvegesna14@gmail.com" and Password as "Q!2w3" 
Then Click on Signout
And Close the browser

@sample1
Scenario: Unsuccessful Login with Invalid Credentials
Given User Launch Chrome Browser
When User Opens URL "http://automationpractice.com/index.php"
And User Enters Email as "gouthamvegesna14@gmail.com" and Password as "12345" 
And Verify authentication is displayed
And Close the browser

@sample2
Scenario: Successful order placement
Given User Launch Chrome Browser
When User Opens URL "http://automationpractice.com/index.php"
And User Enters Email as "gouthamvegesna14@gmail.com" and Password as "Q!2w3" 
And Place order for Women Printed Chiffon Dress from Summer Dresses 
Then Click on Signout
And Close the browser


   

