package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver ldriver;
	
	public Login(WebDriver rdriver) {  //constructor 
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"login\"]/div/div/div/div[2]/div/div/div/form/div[2]/input")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"password\"]")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button[.='Login']")
	@CacheLookup
	WebElement loginbutton;
	
	@FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/div/div/a[3]/i")
	@CacheLookup
	WebElement logoutbutton;
	
	public void enterEmail(String un)
	{
		email.clear();
	email.sendKeys(un);	
	}
	
	public void enterPassword(String pwd) 
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton() {
		loginbutton.click();
	}
	public void clcikOnlogutButton() {
		logoutbutton.click();
	}
	
	
	
}
