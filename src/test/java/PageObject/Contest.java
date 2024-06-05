package PageObject;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contest {

public	WebDriver ldriver;
	
	public Contest(WebDriver rdriver) {
		ldriver=rdriver;
	
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath = "//a[.='Contest']")
	WebElement contest;
	
	@FindBy(xpath = "//a[.=' Add Contest']")
	WebElement AddContest;
	
	public void clickOnContest() {
	
	   contest.click();
	}
	
	public void clickOnAddContest() {
		AddContest.click();
	}
	
	

	
}
