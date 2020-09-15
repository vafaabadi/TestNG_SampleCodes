package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_day4 {
	
	@Test
	public void WebLogInHOMELoan()
	{
		//web login by Selenium
		System.out.println("Web Log In HOME");
	}
	
	@Test(groups={"Smoke"})
	public void MobileLogInHOME()
	{
		//Appium
		System.out.println("Mobile Log In HOME");
	}
	
	
	@Parameters({"URL","APIKey/username"})
	@Test
	public void LogInAPIHOMELoan(String urlname,String key)
	{
		//Rest API automation
		//driver.get(urlname);
		System.out.println("API Log In HOME");
		System.out.println(urlname);
		System.out.println(key);
	}
	
	@Test
	public void LogInDBHOMELoan()
	{
		//Rest API automation
		System.out.println("DB Log In HOME");
	}
	
	
	
	
	
}
