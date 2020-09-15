package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test; 

public class TestNg_day3 {
	
	
	@org.testng.annotations.BeforeClass
	public void BeforeClass()
	{
		
		System.out.println("Before Executing Any Methods in the TestNg_day3 Class");
	}
	
	
	@Test(groups= {"Smoke"})
	public void WebLogInCarLoan()
	{
		//web login by Selenium
		System.out.println("Web Log In Car");
	}
	
	@Test(dependsOnMethods={"MobileSignUpCarLoan","MobileSignOutCarLoan"})   //executes "MobileSignUpCarLoan" and "MobileSignOutCarLoan" first and then executes:
	public void MobileLogInCarLoan()
	{
		//Appium
		System.out.println("Mobile Log In Car");
	}
	
	@org.testng.annotations.BeforeSuite
	public void BeforeSuite() 
	{
	
		System.out.println("I am first of all!!!");
		
	}
	
	@org.testng.annotations.AfterSuite
	public void AfterSuite() 
	{
	
		System.out.println("I am last of all!!!");
		
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		//Appium
		System.out.println("After Method!!!!!");
	}
	
	@Parameters({"URL"})								//to use parameter URL for test case:
	@Test
	public void MobileSignUpCarLoan(String urlname)
	{
		//Appium
		//driver.get(urlname);
		System.out.println("Mobile Sign Up Car");
		System.out.println(urlname);
	}
	
	
	@Test(enabled=false)								//SKIP the test case because it has got an UNFIXED bug.
	public void SkipThisTestCase()
	{
		System.out.println("asfasffgskhaskhdasdhasjdh");
	}
	
	
	@Test(timeOut=40000, dataProvider="getData")								//time out of 40 seconds. in case it takes longer than 40 seconds, the XMl move forward but failing the entire test suite.
	public void MobileSignOutCarLoan(String username, String password)
	{
		//Appium
		System.out.println("Mobile Sign Out Car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test
	public void APICarLoan()
	{
		//Rest API automation
		System.out.println("API Log In Car");
	}
	
	@Test
	public void LogInDBCarLoan()
	{
		//Rest API automation
		System.out.println("DB Log In Car");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		//Appium
		System.out.println("Before Method!!!!!!");
	}
	
	
	@org.testng.annotations.AfterClass
	public void AfterClass()
	{
		System.out.println("AFTER Executing all Methods in the TestNg_day3 Class");
	}
	
	
	
	@DataProvider								// 3 data test sets 
	public Object[][] getData() 
	{
		//1st combination - username and password
		//2nd combination - another username and passport
		//3nd combination - fraud credit history
		Object[][] data = new Object[3][2];		// 3 combinations. passing 2 values for each combinations
		//1st set data
		data[0][0] = "1st username";
		data[0][1] = "1st password";
		//2nd set data
		data[1][0] = "2st username";
		data[1][1] = "2st password";
		//3nd set data
		data[2][0] = "3st username";
		data[2][1] = "3st password";
		return data;
		
	}
	




}
