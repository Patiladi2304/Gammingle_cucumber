package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefination.BaseClass;

public class video extends BaseClass {
public WebDriver ldriver;
	
	public video(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	
	 
//click on video 	
	@FindBy(xpath ="//span[.='Videos']")
	WebElement clickonVideo;
	//Click on add video 
	@FindBy(xpath = "//a[.=' Add Video']")
	WebElement clickonaddvideo;
	//enter information about video
	@FindBy(id = "title")
	WebElement enterTitle;
	
	@FindBy (id = "url")
   WebElement enterUrl;
	
	@FindBy (id ="description")
	WebElement enterDesc;
	
	
	
	
	
	
	
	
	
	//page title 
	  public String getpageTitle() {
	      return	ldriver.getTitle();
	    }
	  
	public void clickVideo() {
		clickonVideo.click();
		
	}
	
	public void clickOnAddVideo() {
		clickonaddvideo.click();
	}
	public void enterTitle(String title) {
		enterTitle.sendKeys(title);
		
	}
	public void UploadURL(String url) {
	enterUrl.sendKeys(url);
	}
	public void enterDESC(String desc) {
	enterDesc.sendKeys(desc);
	}
	

}
