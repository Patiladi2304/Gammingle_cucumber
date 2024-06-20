package StepDefination;

import static org.junit.Assert.assertArrayEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import PageObject.Contest;
import PageObject.ContestGroup;
import PageObject.Login;
import PageObject.MarketingCategory;
import PageObject.addStaff;
import PageObject.searchContest;
import PageObject.video;
import io.cucumber.java.en.*;

public class Loginsteps extends BaseClass {

	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		loginlp = new Login(driver);
	}

	@When("user open URL {string}")
	public void user_open_url(String url) {
		driver.navigate().to(url);
	}

	@When("user enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {

		loginlp.enterEmail(email);
		loginlp.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException {
		loginlp.clickOnLoginButton();
		Thread.sleep(4000);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
		String url = driver.getCurrentUrl();
		if (url.contains("http://skyonliners.com/demo/gammingle-web/webadmin/dashboard")) {
			System.out.println("url match");
		} else {
			System.out.println("url is not match");
		}
		Thread.sleep(2000);

//		String url=driver.getCurrentUrl();
//		Assert.assertEquals(url, "http://skyonliners.com/demo/gammingle-web/webadmin/dashboard");

	}

	@When("click on user Logout link")

	public void click_on_user_logout_link() throws InterruptedException {
		Thread.sleep(3000);
		loginlp.clcikOnlogutButton();

	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
		// driver.quit();
	}

//marketing Category	

	@Then("user can view Dashboard")
	public void user_can_view_dashboard() {
		addmc = new MarketingCategory(driver);
		Assert.assertEquals("Admin", addmc.getpageTitle());

	}

	@When("click on Master")
	public void click_on_master() throws InterruptedException {
		Thread.sleep(3000);
		addmc.clickOnMaster();
	}

	@When("click on the Marketing category")
	public void click_on_the_marketing_category() throws InterruptedException {
		addmc.clickOnMarketingCat();
		Thread.sleep(3000);

	}

	@When("click on the add Marketing category")
	public void click_on_the_add_marketing_category() throws InterruptedException {

		addmc.clickonaddMarcat();
		Thread.sleep(3000);

	}

	@Then("user can view add Marketing category page")
	public void user_can_view_add_marketing_category_page() {
		Assert.assertEquals("Admin", addmc.getpageTitle());
	}

	@When("user enter Marketing name")
	public void user_enter_marketing_name() throws InterruptedException {
		addmc.enterName("Automationmnnn");
		Thread.sleep(2000);

	}

	@When("click on the Submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		addmc.clicksumbit();
		Thread.sleep(3000);
	}

//	public void user_can_view_confirmation_message(String string) {
//		   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Data Added Successfully"));  
//	    
//	}
	
//	@Then("user can view Confirmation message "([^"]*)"$")
//	public void user_can_view_confirmation_message(String string) {
//		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Data Updated Successfully']")).getText().contains("Data Added Successfully"));
//	}  //ask js
	
//	@Then("user can view confirmation message {string}")
//	public void user_can_view_confirmation_message(String string) {
//		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Data Updated Successfully']")).getText().contains("Data Added Successfully"));
//		// pending
//
//	}

	// upload a video
	@When("click on videos")
	public void click_on_videos() throws InterruptedException {
		vp = new video(driver);
		Thread.sleep(1000);
		vp.clickVideo();

	}

	@When("click on the add video")
	public void click_on_the_add_video() throws InterruptedException {
		vp.clickOnAddVideo();
		Thread.sleep(2000);

	}

	@Then("user can view add video page")
	public void user_can_view_add_video_page() {
		Assert.assertEquals("Admin", vp.getpageTitle()); // change this code
	}

	@When("user Enter Video information and upload url")
	public void user_enter_video_information_and_upload_url() throws InterruptedException {
		vp.enterTitle("Text title");
		Thread.sleep(1000);
		vp.UploadURL("http://skyonliners.com/demo/gammingle-web/webadmin/video");
		Thread.sleep(1000);
		vp.enterDESC("DEmooooooooooooooo");
	}

//Contest Group 
	@When("click on the DFS")
	public void click_on_the_dfs() {
		cg = new ContestGroup(driver);
		cg.ClickOnDFS();

	}

	@When("click on the Contest Group")
	public void click_on_the_contest_group() throws InterruptedException {
		Thread.sleep(2000);
		cg.clickOnContestGroup();

	}

	@When("Click on the Add contest group")
	public void click_on_the_add_contest_group() {
		cg.clickOnAddContest();
	}

	@Then("user can view add contest group page")
	public void user_can_view_add_contest_group_page() {

	}

	@When("user Enter Contest group details")
	public void user_enter_contest_group_details() throws InterruptedException {
		Thread.sleep(1000);
		cg.Sequence();
		cg.uploadFile();
		Thread.sleep(2000);
		// cg.clickOnEnglish("demoo", "demoo");
		Thread.sleep(2000);
		cg.clikcOnHindi("hindi demo", "demo");
		cg.Submit();

	}

	// Contest page
	@When("click on the Contest")
	public void click_on_the_contest() throws InterruptedException {
		c = new Contest(driver);
		Thread.sleep(2000);

		// org.openqa.selenium.ElementNotInteractableException : When get this error use
		// thread .sleep
		c.clickOnContest();
	}

	@When("Click on the Add contest")
	public void click_on_the_add_contest() {
		c.clickOnAddContest();

	}

	@Then("user can view add contest page")
	public void user_can_view_add_contest_page() {
		Assert.assertEquals("Admin", c.getpageTitle());

	}

	@When("user Enter Contest  details")
	public void user_enter_contest_details() throws InterruptedException {
		Thread.sleep(3000);
		c.selctContestgroup();
		c.minPar("3");
		c.maxPar();
		c.enteryFee();
		c.enteryAllowed();
		c.contestType();
		c.prizeDistribution();
		c.maxRankk();
		c.Distribution();

		c.ClickOnEnglish("Auto Contestee", "Auto contesee");

		c.clickOnHindi("auto hindi", "auto hindii");

	}

	@When("click on the sumbit button")
	public void click_on_the_sumbit_button() {
		c.clickOnSumbit();

	}
	// @Then("user can view Confirmation message {string}")
//	public void user_can_view_confirmation_message(String string) {
//	    
//	}

	// add staff stepdefination

	@When("click on the staff")
	public void click_on_the_staff() throws InterruptedException {
		staff = new addStaff(driver);
		staff.clickonStaff();
		Thread.sleep(3000);

	}

	@When("click on the manage staff")
	public void click_on_the_manage_staff() throws InterruptedException {
		staff.clickOnManageStaff();
		Thread.sleep(3000);

	}

	@When("click on the add staff")
	public void click_on_the_add_staff() throws InterruptedException {
		staff.clickOnAddStaff();
		// Thread.sleep(3000);

	}

	@Then("user can view add staff page")
	public void user_can_view_add_staff_page() {

		String url = driver.getCurrentUrl();
		if (url.contains("http://skyonliners.com/demo/gammingle-web/webadmin/staff")) {
			System.out.println("url match");
		} else {
			System.out.println("url is not match");
		}
	}

	@Then("user fill all the details")
	public void user_fill_all_the_details() {
		staff.selectRole();
		staff.firstName("autoo");
		staff.lastName("lname");
		staff.EnterEmailId("test@gmail.comm");
		staff.phone("9090909090");
		staff.enterpwd("Test@123");
	}

	@Then("click on the Sumbit button")
	public void click_on_the_sumbit_button1() {
		staff.clickOnsumbitButton();
		// ask janvi mam

	}

	// search customer step defination file

	@When("click on the Filter button")
	public void click_on_the_filter_button() throws InterruptedException {
		sc = new searchContest(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		sc.clickOnFilterButton();
		// Thread.sleep(2000);
	}

	@When("enter contest name")
	public void enter_contest_name() {
		sc.enterContestName("Live Final");
	}

	@Then("user should found contest in table")
	public void user_should_found_contest_in_table() {
		boolean status = sc.searchContest("Live Final");
		Assert.assertEquals(true, status);
		System.out.println("data ");

	}

}