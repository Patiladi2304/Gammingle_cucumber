package PageObject;

import org.apache.commons.lang.RandomStringUtils;
import org.checkerframework.checker.nullness.qual.AssertNonNullIfNonNull;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.This;

public class addStaff {

	WebDriver ldriver;
	public addStaff(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements( rdriver,this);
	}
	
	@FindBy(xpath = "//span[text()='Staff']")
  WebElement staff;
	
	@FindBy(xpath = "//a[.='Manage Staff']")
	WebElement managestaff;
	
	@FindBy(xpath = "//a[.=' Add Staff']")
	WebElement addstaff;
	//fill staff user details 
	@FindBy(id = "role")
	WebElement selectrole;
	
	@FindBy(id = "first_name")
	WebElement fname;
	
	@FindBy(id = "last_name")
	WebElement lname;
	
	@FindBy(id = "email")
	WebElement  enteremail;
	
	@FindBy(id = "phone")
	WebElement  phone;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement  password;
	
	@FindBy(xpath = "//button[.='Submit']")
	WebElement submitbtn;
	
	
	public void clickonStaff() {
		staff.click();
		}
	
	public void clickOnManageStaff() {
		//method js										
		managestaff.click();
	}
	public void clickOnAddStaff() {
		addstaff.click();
	}
	
	public void selectRole() {
		Select s=new Select(selectrole);
		s.selectByVisibleText("Data");
	}
	
	public void firstName() {
		String firstname =RandomStringUtils.randomAlphanumeric(7).toLowerCase();
		
		fname.sendKeys(firstname);
	}
	
	public void lastName() {
		String lastname=RandomStringUtils.randomAlphabetic(3).toLowerCase();
		lname.sendKeys(lastname);
	}
	public void EnterEmailId() {
		//Random keyword: 
		String  email = RandomStringUtils.randomAlphabetic(10).toLowerCase()+"@gmail.com";
		enteremail.sendKeys(email);
	}
	public void phone() {
		String number =RandomStringUtils.randomNumeric(10);
		phone.sendKeys(number);	
	}
	
	public void enterpwd(String pwd) {
	  password.sendKeys(pwd);
	}
	
	public void clickOnsumbitButton() {
	   submitbtn.click();
	}
	
}
