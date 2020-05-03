package mavenJava;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PositiveTest {
	@Test
	public void TestNg() throws InterruptedException 
	{//System.out.println("Positive");
		
		  System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
		  
		  WebDriver driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  
		  driver.get("https://itassetmanagement.in/travel_triangle/login");
		  
		  driver.manage().window().maximize();
		  
		  // to check the succesful login with correct password
		  
		  driver.findElement(By.id("username")).click();
		  driver.findElement(By.id("username")).sendKeys("shadab");
		  
		  driver.findElement(By.id("password")).click();
		  driver.findElement(By.id("password")).sendKeys("2810");
		  
		  System.out.println(driver.findElement(By.xpath("//label[@for='remember_me']")).isSelected());
		  driver.findElement(By.xpath("//label[@for='remember_me']")).click();
		  System.out.println(driver.findElement(By.xpath("//label[@for='remember_me']")).isSelected());
		  
		  
		  //to click to submit button
		  
		  driver.findElement(By.id("btnSubmit")).click();
		  
		  System.out.println(driver.getTitle());
		  
		  //verfication
		  
		  //to check if it is landed to correct url
		  
		  String expectedUrl="https://itassetmanagement.in/travel_triangle/dashboard";
		  String actualUrl= driver.getCurrentUrl(); Assert.assertEquals(actualUrl,expectedUrl, "The url is not the same as expected");
		  
		  String successmessage=driver.findElement(By.xpath("//span[text()='Welcome, You have logged in successfully!']")).getText();
if(successmessage.contains("You have logged in successfully"))
{
		  System.out.println("Login succesfull");
		  
		  }
else {
		  System.out.println("failled to login"); }
driver.quit();
		  
	}



	
                         @Test
                        public void ItmLinkTest()
                      {System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            		  
            		  WebDriver driver = new ChromeDriver();
            		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            		  
            		  driver.get("https://itassetmanagement.in/travel_triangle/login");
            		  driver.findElement(By.id("username")).click();
            		  driver.findElement(By.id("username")).sendKeys("shadab");
            		  
            		  driver.findElement(By.id("password")).click();
            		  driver.findElement(By.id("password")).sendKeys("2810");
            		  driver.findElement(By.id("btnSubmit")).click();
	

		  
		  //to check navigation panel if they are having proper modules //#mainnav-menu  all module
		
		  
		  WebElement navigation = driver.findElement(By.cssSelector("#mainnav"));
		  System.out.println(navigation.findElements(By.tagName("li")).size());
		  
		  driver.findElement(By.xpath("//a[text()='itassetmanagement.in']")).click();
		  Set<String> ids=driver.getWindowHandles();Iterator<String> it=ids.iterator();
		  
		  
		  
		  String parent= it.next(); String child = it.next();
		  
		  
		  driver.switchTo().window(child); System.out.println(driver.getTitle());
		  System.out.println(driver.getCurrentUrl());
		  
		  driver.quit();
                      }


                    @Test
                    public void LogoutTest()

{
                    	System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
              		  
              		  WebDriver driver = new ChromeDriver();
              		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
              		driver.get("https://itassetmanagement.in/travel_triangle/login");
              		  
              		driver.findElement(By.id("username")).click();
          		  driver.findElement(By.id("username")).sendKeys("shadab");
          		  
          		  driver.findElement(By.id("password")).click();
          		  driver.findElement(By.id("password")).sendKeys("2810");
          		driver.findElement(By.id("btnSubmit")).click();
          		  
          		  driver.findElement(By.xpath("//i[@class='dropdown-caret dropdownicon']")).click();
          		  driver.findElement(By.xpath("//div[@class='dropdown-menu dropdown-menu-md dropdown-menu-right panel-default']/ul/li[4]")).click();
          		  
          		
          		
          		String logouttext=driver.findElement(By.xpath("//span[text()='You have logged out successfully']")).getText();
          		
          		if(logouttext.contains("You have logged out successfully"))
          		{
          			System.out.println("Succesfully logout");
          		}
          		else
          		{
          			System.out.println("Logged failled");
              		  
              		  
	
}
		 
	
          		driver.quit();
		
		
		
		
	}

}
