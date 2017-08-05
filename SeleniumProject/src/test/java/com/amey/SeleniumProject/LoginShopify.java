package com.amey.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * Hello world!
 *
 */
public class LoginShopify 
{
	private static WebDriver driver;
    
	@Given("^Go to shopify$")
    public void gotoShopify(){
    	System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "F:/IIHT/Selenium/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
    }
    
	@When("^I enter username password$")
    public void enterUsername(){
		System.out.println("^I enter username as$");
		//driver.findElement(By.xpath("//*[@id='_email']")).click();
    	driver.findElement(By.xpath("//*[@id='login1']")).sendKeys("ameyamuley");
    	System.out.println("^I enter password as$");
		//driver.findElement(By.xpath("//*[@id='_password']")).click();
    	driver.findElement(By.xpath("//*[@id='password']")).sendKeys("password\n");
    }
    
	/*@When("^I enter password as$")
    public void enterPassword(){
		System.out.println("^I enter password as$");
		driver.findElement(By.xpath("//*[@id='_password']")).click();
    	driver.findElement(By.xpath("//*[@id='_password']")).sendKeys("password\n");
    	
    }*/
    
	@Then("^Login should fail$")
    protected static void checkFail() throws InterruptedException{
		if(driver.getCurrentUrl().equalsIgnoreCase(
		         "https://mail.rediff.com/cgi-bin/login.cgi")){ 
		            System.out.println("Test1 Pass"); 
		      } else { 
		         System.out.println("Test1 Failed"); 
		      } 
		      driver.close();
    }
}
