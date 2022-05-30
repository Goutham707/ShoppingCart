package pageObjects;

import junit.framework.Assert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	public WebDriver ldriver;
	
	By EmailAddress = By.id("email");
	
	By Password= By.id("passwd");
	
	By SignIn=By.xpath("//a[@class='login']");
	
	By SignInButton= By.id("SubmitLogin");
	
	By SignOut= By.xpath("//a[@class='logout']");
	
	By Autherror= By.xpath("//*[contains(text(),'Authentication failed.')]");
	
	By Women=By.xpath("//a[@title='Women']");
	
	By Summer_Dresses= By.xpath("//a[@title='Summer Dresses']");
	
	By Printed_Chiffon_Dress=By.xpath("//a[@title='Printed Chiffon Dress']");
	
	By Add_to_cart=By.xpath("//span[contains(text(),'Add to cart')]");
	
	By Checkout=By.xpath("//span[contains(text(),'checkout')]");
	
	By Checkout_Button=By.xpath("(//span[contains(text(),'checkout')])[2]");
	
	By Checkbox=By.xpath("//input[@type='checkbox']");
	
	By BankWire=By.className("bankwire");
	
    public void typeEmailId(String Id){
    	ldriver.findElement(SignIn).click();
    	ldriver.findElement(EmailAddress).sendKeys(Id);
    }
 
    public void typePassword(String PasswordValue){
    	ldriver.findElement(Password).sendKeys(PasswordValue);
    	ldriver.findElement(SignInButton).click();
    }
    
    public void SignOut(){
    	ldriver.findElement(SignOut).click();
    }
	
    public LoginPage(WebDriver driver)
    {
    	ldriver=driver;
    }
    
    public void AuthValidation() {
    	String str=ldriver.findElement(Autherror).getText();
    	Assert.assertEquals("Authentication failed.", str);
    	//assertSame(element,"Authentication failed.");
    }
    
    public void Order_Printed_Chiffon_Dress() throws InterruptedException {
    	Actions actions = new Actions(ldriver);
		WebElement womenLink = ldriver.findElement(Women);
		actions.moveToElement(womenLink).perform();
		ldriver.findElement(Summer_Dresses).click();
		ldriver.findElement(Printed_Chiffon_Dress).click();
		int size = ldriver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		if(size!=0)
		{
			ldriver.switchTo().frame(0);
		}
		ldriver.findElement(Add_to_cart).click();
		//ldriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		ldriver.findElement(Checkout).click();
		ldriver.findElement(Checkout_Button).click();
		ldriver.findElement(Checkout_Button).click();
		ldriver.findElement(Checkbox).click();
		ldriver.findElement(Checkout_Button).click();
		ldriver.findElement(BankWire).click();
		ldriver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
    }
}
