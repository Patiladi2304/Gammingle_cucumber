package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchContest {
	WebDriver ldriver;
public searchContest(WebDriver rdriver) {
	ldriver=rdriver;
	PageFactory.initElements( rdriver,this);
}

@FindBy(xpath = "//button[@id='listing-filter-toggle']")
WebElement filterbtn;

@FindBy(id = "search_name")
WebElement contestname;

@FindBy(xpath = "//table[@class='table table-bordered table-striped']")
WebElement table;

@FindBy(xpath = "//table[@class='table table-bordered table-striped']/tbody/tr")
List<WebElement>  trow;

@FindBy(xpath = "")
List<WebElement>  tcolumn;

public void clickOnFilterButton() {
   filterbtn.click();	
}

public void enterContestName(String name) {
	contestname.sendKeys(name);
	
}
public int noOfrows() {
	return (trow.size());
	
}
public int noOfColumns() {
	return (tcolumn.size());
	
}

public  boolean searchContest(String Con) {
	boolean flag=false;
	
	for (int i = 0; i <noOfrows(); i++) {
		
		String contest = table.findElement(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr"+i+"/td[2]")).getText();
		
		System.out.println(contest);
		
		if (contest.equals(Con)) {
			flag =true;
		}
		
}
	return flag;

}
}
