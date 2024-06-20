package StepDefination;

import org.openqa.selenium.WebDriver;

import PageObject.Contest;
import PageObject.ContestGroup;
import PageObject.Login;
import PageObject.MarketingCategory;
import PageObject.addStaff;
import PageObject.searchContest;
import PageObject.video;


public class BaseClass {

	public WebDriver driver;
	public Login loginlp;
	public MarketingCategory addmc;
	public video vp;
	public ContestGroup cg;
	public Contest c;
	public addStaff staff;
	public searchContest sc;
}
