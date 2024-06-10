package stepDefination;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObject.Loginnp;
import pageObject.addCustomer;

public class stepdefination extends BaseClass {
	
	


@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	
	driver=new ChromeDriver();
	np=new Loginnp(driver);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
   
}

@When("user open the url {string}")
public void user_open_the_url(String url) throws InterruptedException {
	driver.navigate().to(url);
	 Thread.sleep(3000);
   }

@When("user enters emails as {string} and password as {string}")
public void user_enters_emails_as_and_password_as(String Email, String Password) {
	np.enterEmail(Email);
np.enterpwd(Password);	
   
}

@When("click on the Login button")
public void click_on_the_login_button() throws InterruptedException {
	np.ClickOnLogin();
	 Thread.sleep(3000);
  
}

@Then("page title should be {string}")
public void page_title_should_be(String title) throws InterruptedException {
//	String title = driver.getTitle();
//	if (title.equals("Dashboard / nopCommerce administration")) {
//		System.out.println("title match ");
//	} else {
//            System.out.println("title not matched");
//	}
	
	if (driver.getPageSource().contains("Login was unsuccessful.")) {
		driver.close();
		Assert.assertTrue(false);
		
	} else {
		Assert.assertEquals(title, driver.getTitle());

	}
	 Thread.sleep(3000);
	
  
}

@When("user click on the logut link")
public void user_click_on_the_logut_link() throws InterruptedException {
	Thread.sleep(3000);
    np.clickOnLogout();
    Thread.sleep(3000);
}

@Then("close the browser")
public void close_the_browser() {
   driver.close();
}

// AddCustomer 

@When("click on the customer menu")
public void click_on_the_customer_menu() {
  ac=new addCustomer(driver);
  ac.clickOnCustomer();
}

@When("click on the Customers menu item")
public void click_on_the_customers_menu_item() {
   ac.clickOnCustomerNav();
}

@When("click on the Add new button")
public void click_on_the_add_new_button() throws InterruptedException {
    ac.clickOnAddButn();
    Thread.sleep(4000);
}

@Then("user can view Add new customer page")
public void user_can_view_add_new_customer_page() {
	Assert.assertEquals("Add a new customer / nopCommerce administration", driver.getTitle());
}

@When("user enter customer info")
public void user_enter_customer_info() {
	String email = randomString()+"gmail.com";
	ac.enterEmail(email);
	ac.enterPassword("Test@123");
	ac.firstName("Fname");
	ac.lastName("Lname");
	ac.clickgender();
	ac.dateOfBirth("11022023");
	ac.cName("zzxxcc");
	ac.NLetter();
	ac.customerRoles();
	ac.selectVendor();
    ac.addcomm("comment Added");
    
}

@When("click on the save button")
public void click_on_the_save_button() {
	ac.clickOnSubmitButton();
}

@Then("user can view confirmation message {string}.")
public void user_can_view_confirmation_message(String string) {
	
  
}

}
