package StepDefination;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Contest;
import PageObject.ContestGroup;
import PageObject.Loginpage;
import PageObject.MarketingCategory;
import PageObject.video;
import io.cucumber.java.en.*;

public class Loginsteps extends BaseClass {
	
//public 	WebDriver driver;
//public Loginpage 	;


	@Given("user launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	   loginlp =new Loginpage(driver);
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
		
		if (driver.getPageSource().contains("Admin")) {
			//driver.close();
			Assert.assertTrue(true); //false
			
		} else {
              Assert.assertEquals(title, driver.getTitle());
		}
		 Thread.sleep(2000);
//		
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
	  //driver.quit();
	}
	
//marketing Category	
	
	
	@Then("user can view Dashboard")
	public void user_can_view_dashboard() {
		addmc=new MarketingCategory(driver);
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
		addmc.enterName("Automation");
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
	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
		   Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Data Added Successfully"));
		   //pending
	}
	
	//upload a video 
	@When("click on videos")
	public void click_on_videos() throws InterruptedException {
		vp=new video(driver);
		vp.clickVideo();
		Thread.sleep(3000);
	   
	}
	@When("click on the add video")
	public void click_on_the_add_video() throws InterruptedException {
		vp.clickOnAddVideo();
		Thread.sleep(3000);
	  
	}
	@Then("user can view add video page")
	public void user_can_view_add_video_page() {
	  Assert.assertEquals("Admin", vp.getpageTitle());
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
	cg=new ContestGroup(driver);
	cg.ClickOnDFS();
	 
	}
	@When("click on the Contest Group")
	public void click_on_the_contest_group() {
	   
	}
	@When("Click on the Add contest group")
	public void click_on_the_add_contest_group() {
	
	}
	@Then("user can view add contest group page")
	public void user_can_view_add_contest_group_page() {
	    
	}
	@When("user Enter Contest group details")
	public void user_enter_contest_group_details() {
	
	}
	//Contest page 
	@When("click on the Contest")
	public void click_on_the_contest() throws InterruptedException {
	  c=new  Contest(driver);
	  Thread.sleep(2000);
	  
	//  org.openqa.selenium.ElementNotInteractableException  : When get this error use thread .sleep 
	  c.clickOnContest();
	}
	@When("Click on the Add contest")
	public void click_on_the_add_contest() {
		c.clickOnAddContest();
		
	   
	}
	@Then("user can view add contest page")
	public void user_can_view_add_contest_page() {
	    
	}
	@When("user Enter Contest  details")
	public void user_enter_contest_details() {
	  
	}
	@When("click on the sumbit button")
	public void click_on_the_sumbit_button() {
	   
	}
	//@Then("user can view Confirmation message {string}")
//	public void user_can_view_confirmation_message(String string) {
//	    
//	}
	




}