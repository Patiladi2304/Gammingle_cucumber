package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MarketingCategory {
	public WebDriver ldriver;
	
	public MarketingCategory(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}

	
	By clickOnMaster=By.xpath("//span[.='Master']");
	By clickonMarkCat=By.xpath("//a[.='Marketing Category']");
	By clickOnaddMarcat=By.xpath("//a[.=' Add Marketing Category']");
	By enterName =By.xpath("//*[@id=\"name\"]");
    By clickOnSubmitButn=By.xpath("//button[@class='btn btn-success']");
    
    
    //Action method 
    
    
    public String getpageTitle() {
      return	ldriver.getTitle();
    }
    
    public void clickOnMaster() {
		ldriver.findElement(clickOnMaster).click();
	}
    public void clickOnMarketingCat() {
    	ldriver.findElement(clickonMarkCat).click();
		
	}
    public void clickonaddMarcat() {
		ldriver.findElement(clickOnaddMarcat).click();
		
	}
    public void enterName(String name) {
    	ldriver.findElement(enterName).sendKeys(name);
		
	}
    public void clicksumbit() {
		ldriver.findElement(clickOnSubmitButn).click();
	}
}
