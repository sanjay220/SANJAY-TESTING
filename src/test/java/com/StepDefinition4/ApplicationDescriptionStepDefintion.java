package com.StepDefinition4;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationDescriptionStepDefintion extends BaseClass {
	  @Given("^user on landing page$")
	    public void user_on_landing_page() throws Throwable {
		  launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	     
	    }

	    @When("^user creates an application with all description$")
	    public void user_creates_an_application_with_all_description() throws Throwable {
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
		       Thread.sleep(2000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys( "APPLICATION_DESCRIPTION");
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys( "TESTING-SA");
		 	     Thread.sleep(2000);
		 	    Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement( By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/app-application-basic-details[1]/div[2]/button[2]")).click();
			       Thread.sleep(6000);
	       
	    }
	    
	    
	    @And("^user re-edit the  description and save it$")
	    public void user_reedit_the_description_and_save_it() throws Throwable {
	    	  driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("APPLICATION_DESCRIPTION");
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer[1]/div[1]/mat-nav-list[1]/mat-list-item[4]/div[1]/mat-icon[1]")).click();
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("fhh");
	    // WebElement ele=  driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c98-61']"));
	       //driver.findElement(By.xpath("//div[@class='mat-form-field-infix ng-tns-c98-61']")).clear();
	   //  Actions act = new Actions(driver);
	   //  act.moveToElement(ele).click().build().perform();
	    Thread.sleep(3000);
	    // act.sendKeys("safhg");
	    	//.drive.findElement(By.xpath("//*[@id=\"mat-input-28\"]")).sendKeys("adptesting");
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'save')]")).click();
	       
	    }

	    @Then("^user deletes the application$")
	    public void user_deletes_the_application() throws Throwable {
	       
	    }

	  


}
