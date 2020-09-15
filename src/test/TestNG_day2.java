package test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class TestNG_day2 {
	
	@Test(groups={"Smoke"})
	public void Demo_03()
	{
		
		System.out.println("good");
		
	}

	@Test
	public void Bad()
	{
		
		System.out.println("Bad");
		
	}
	
	@Test
	public void Short()
	{
		
		System.out.println("Short");
		
	}
	
	@BeforeTest   							//To get this test case execute FIRST! --->>> @BestTest
	public void prerquistes() 
	{
	
		System.out.println("I will execute first!!!");
		
	}
	
	
	@AfterTest  							//this will be executed at last in Personal Loan only because it belongs to Personal Loan only test suite in testng.xml file. (it is not global @AfterTest)
	public void LastCase() 
	{
	
		System.out.println("I will execute last!!!");
		
	}
	
	
	
}
