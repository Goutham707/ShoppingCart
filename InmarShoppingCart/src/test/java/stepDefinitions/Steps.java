package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	
	public LoginPage lp;	

	@Given("User Launch Chrome Browser")
	public void User_Launch_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\InmarShoppingCart\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	    lp=new LoginPage(driver);
	}
	
	@When("User Opens URL \\\"([^\\\"]*)\\\"")
	public void User_Opens_URL (String url) {
	driver.get(url);	
	driver.manage().window().maximize();
	}
	
	@And("User Enters Email as \\\"([^\\\"]*)\\\" and Password as \\\"([^\\\"]*)\\\"")
	public void User_Enters_Email_as_and_Password_as(String email, String password) {	
	lp.typeEmailId(email);
	lp.typePassword(password);
	}
	
	@Then("Click on Signout")
	public void Click_on_Signout() {
	lp.SignOut();
	}
	
	@And("Close the browser")
	public void Close_the_browser()
	{
		driver.quit();
	}
	
	@And("Verify authentication is displayed")
	public void Verify_authentication_is_displayed()
	{
		lp.AuthValidation();
	}
	
	@And("Place order for Women Printed Chiffon Dress from Summer Dresses")
	public void Place_order_for_Women_Printed_Chiffon_Dress_from_Summer_Dresses() throws InterruptedException
	{
		lp.Order_Printed_Chiffon_Dress();
	}
	
	
}
