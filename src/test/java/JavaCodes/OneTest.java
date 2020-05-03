package JavaCodes;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OneTest {
	@Test
	public void JavaOneTest()
	{
		System.out.println("JavaOneTest");
	}

	
	@Test
	public void JavaSixTest()
	{
		System.out.println("JavaSixTest");
	}
	
	@Test
	public void JavaTwoTest()
	{
		System.out.println("JavaTwoTest");
	}
	
	@BeforeTest
	public void JavaThreeTest()
	{
		System.out.println("JavaThreeTest");
	}
	
	@Test
	public void JavaFourTest()
	{
		System.out.println("JavaFourTest");
	}
	
	@AfterTest
	public void JavaFiveTest()
	{
		System.out.println("JavaFiveTest");
	}
	
}
