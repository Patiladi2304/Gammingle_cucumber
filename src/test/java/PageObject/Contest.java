package PageObject;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Contest {

	public WebDriver ldriver;

	public Contest(WebDriver rdriver) {
		ldriver = rdriver;
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//a[.='Contest']")
	WebElement contest;

	@FindBy(xpath = "//a[.=' Add Contest']")
	WebElement AddContest;

	// fill all the contest details
	@FindBy(xpath = "//*[@id=\"contest_group\"]")
	WebElement ContestGroup;

	@FindBy(xpath = "//*[@id=\"participant_min\"]")
	WebElement minparticipant;

	@FindBy(id = "participant_max")
	WebElement maxparticipant;

	@FindBy(id = "entry_fee")
	WebElement enteryfee;

	@FindBy(id = "entry_allowed")
	WebElement allowed;

	// to click on the Contes type : Auto
	@FindBy(id = "type_auto")
	WebElement contestType;

	// to click on the Fixed value
	@FindBy(id = "type_fixed_value")
	WebElement prizedisteibution;

	// Fill payout data

	@FindBy(id = "rank_max")
	WebElement maxrank;

	@FindBy(id = "distribution_amount")
	WebElement distribution;

	// fill english data
	@FindBy(xpath = "//a[.='English']")
	WebElement English;

	@FindBy(id = "contest_template_name_en")
	WebElement etname;

	@FindBy(id = "contest_header_name_en")
	WebElement ehname;

	// fill hindi data

	@FindBy(xpath = "//a[.='Hindi']")
	WebElement Hindi;

	@FindBy(id = "contest_template_name_hi")
	WebElement htname;

	@FindBy(id = "contest_header_name_hi")
	WebElement hHname;

	@FindBy(xpath = "//button[.='Submit']")
	WebElement Sumbit;
	// ============

	// to get tittle of page
	public String getpageTitle() {
		return ldriver.getTitle();
	}

	public void clickOnContest() {

		contest.click();
	}

	public void clickOnAddContest() {
		AddContest.click();
	}

	public void selctContestgroup() {
		Select s = new Select(ContestGroup);
		s.selectByVisibleText("Head To Head");
		// s.selectByIndex(70);

	}

	public void minPar(String val) {
		minparticipant.sendKeys(val);
	}

	public void maxPar() {
		maxparticipant.sendKeys("10");

	}

	public void enteryFee() {
		enteryfee.sendKeys("100");
	}

	public void enteryAllowed() {
		Select s = new Select(allowed);
		s.selectByVisibleText("3");
	}

	public void contestType() {
		contestType.click();
	}

	public void prizeDistribution() {
		prizedisteibution.click();
	}

	// payout data
	public void maxRankk() {
		maxrank.sendKeys("5");
	}

	public void Distribution() {
		distribution.sendKeys("100");
	}

	public void ClickOnEnglish(String etemplatename, String eheadername) {
		English.click();
		etname.sendKeys(etemplatename);
		ehname.sendKeys(eheadername);
	}

	public void clickOnHindi(String hname, String hheadername) {
		Hindi.click();
		htname.sendKeys(hname);
		hHname.sendKeys(hheadername);

	}

	public void clickOnSumbit() {
		Sumbit.click();
	}
}
