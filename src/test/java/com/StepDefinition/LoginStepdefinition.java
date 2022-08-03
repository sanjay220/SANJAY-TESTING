package com.StepDefinition;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Configuration.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends BaseClass  {
	
	  @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
		  launch("chrome");
		System.out.println("LANDING PAGE");
	
	        
	    }

	    @When("^user login into the application with (.+) and (.+)$")
	    public void user_login_into_the_application_with_and(String username, String password) throws Throwable {
	        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(username);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(password);
	        Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	       Thread.sleep(2000);
	       
	    }


	



}
