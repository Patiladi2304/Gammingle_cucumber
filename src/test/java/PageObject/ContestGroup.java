package PageObject;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContestGroup {
	
	public WebDriver ldriver;
	
	public ContestGroup(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

//click on dfs
@FindBy(xpath = "//span[.='DFS']")
WebElement clickDFS;

@FindBy(xpath = "//span[.='Contest Group']")
WebElement Contestgroup;

@FindBy(xpath = "//a[.=' Add Contest Group']")
WebElement clickonaddcg;

//Fill all the data of contest detail
@FindBy(id = "sequence")
WebElement seq;

@FindBy(xpath = "//input[@type='file']")
WebElement uploadfile;

@FindBy(xpath = "//a[.='English']")
WebElement english;

@FindBy(xpath ="name_en")
WebElement ename;

@FindBy(id="description_en")
WebElement edesc;

@FindBy(xpath = "//a[.='Hindi']")
WebElement hindi;

@FindBy(id = "name_hi")
WebElement hname;

@FindBy(id = "description_hi")
WebElement hdesc;

@FindBy(xpath = "//button[.='Submit']")
WebElement submit;

public void ClickOnDFS() {
	clickDFS.click();
}

public void clickOnContestGroup() {
	Contestgroup.click();
	
}

public void clickOnAddContest() {
	clickonaddcg.click();
}

public void Sequence() {
	seq.sendKeys("3");
	
}

public void uploadFile() {
	File f= new File("./testdata/promo1.jpg");
	String path = f.getAbsolutePath();
	uploadfile.sendKeys(path);
}

public void clickOnEnglish(String Ename ,String Edesc) {
	english.click();
	ename.sendKeys(Ename);
	edesc.sendKeys(Edesc);
}
public void clikcOnHindi(String name,String desc) {
	hindi.click();
	hname.sendKeys(name);
	hdesc.sendKeys(desc);
	
}
public void Submit() {
	submit.click();
}



//how to upload a image in automation


}
