package stepDefination;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.math.RandomUtils;
import org.openqa.selenium.WebDriver;

import pageObject.Loginnp;
import pageObject.addCustomer;

public class BaseClass {
	public WebDriver driver;
	public	Loginnp  np;
	public addCustomer  ac;
	
	//do tracing : creating for random generating email 
	public static String randomString() {
		String generatestring = RandomStringUtils.randomAlphabetic(5);
		return generatestring;
		
	}
}
