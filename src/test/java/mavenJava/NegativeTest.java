package mavenJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
	@Test
	public void negativetest()
	{
		//System.out.println("Negative");
		
		  System.setProperty("webdriver.chrome.driver",
		  "src/main/resources/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  
		  driver.get("https://itassetmanagement.in/travel_triangle/login");
		  
		  driver.manage().window().maximize();
		  
		  // to check the succesful login with correct password
		  
		  driver.findElement(By.id("username")).click();
		  driver.findElement(By.id("username")).sendKeys("shadab");
		  
		  driver.findElement(By.id("password")).click();
		  driver.findElement(By.id("password")).sendKeys("281a0");
		  
		  System.out.println(driver.findElement(By.xpath("//label[@for='remember_me']")
		  ).isSelected());
		  driver.findElement(By.xpath("//label[@for='remember_me']")).click();
		  System.out.println(driver.findElement(By.xpath("//label[@for='remember_me']")
		  ).isSelected());
		  
		  
		  //to click to submit button
		  
		  driver.findElement(By.id("btnSubmit")).click();
		  
		  
		  
		  //verfication
		  
		  
		  
		  String successmessage=driver.findElement(By.xpath("//span[text()='Username and Password are invalid']")).getText();
		  if(successmessage.contains("Username and Password are invalid"))
		  {
		  System.out.println("UnSuccesfull Login"); 
		  }
		  else
		  {
		  System.out.println("Login succesfull"); }
		  
		 
		  driver.quit();
	
		
		
	}

}
