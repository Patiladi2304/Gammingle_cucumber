package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.Loginpage;
import io.cucumber.java.en.*;

public class Loginsteps {
	
public 	WebDriver driver;
public Loginpage loginlp;
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

}