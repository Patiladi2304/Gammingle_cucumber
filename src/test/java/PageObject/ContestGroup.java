package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContestGroup {
	
public WebDriver ldriver;

ContestGroup(WebDriver rdriver){
	ldriver=rdriver;
	PageFactory.initElements(rdriver,this);
}

//click on dfs
@FindBy(xpath = "//span[.='DFS']")
WebElement clickDFS;

@FindBy(xpath = "//span[.='Contest Group']")
WebElement clickOnContestgroup;

@FindBy(xpath = "//a[.=' Add Contest Group']")
WebElement clickonaddcg;



//how to upload a image in automation


}
