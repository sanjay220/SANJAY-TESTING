package com.StepDefinition4;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	    	Thread.sleep(10000);
	     
	    }

	    @When("^user creates an application with all description$")
	    public void user_creates_an_application_with_all_description() throws Throwable {
	    	driver.findElement(By.cssSelector("div.app.blue-dark app-core.ng-tns-c274-160.ng-star-inserted:nth-child(2) div.ng-tns-c274-160:nth-child(1) mat-drawer-container.mat-drawer-container.page-wrapper.ng-tns-c274-160 mat-drawer-content.mat-drawer-content:nth-child(4) div.p-20.mb-3 app-application-listing.ng-star-inserted div.search-header div.search-header-top.ng-star-inserted div:nth-child(1) button.mat-focus-indicator.mat-tooltip-trigger.mt-2.icon-position-fix-end.mat-icon-button.mat-button-base.mat-primary.ng-star-inserted:nth-child(2) span.mat-button-wrapper > mat-icon.mat-icon.notranslate.material-icons.mat-icon-no-color")).click();
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
			       Thread.sleep(4000);
	       
	    }
	    
	    
	    @And("^user re-edit the  description and save it$")
	    public void user_reedit_the_description_and_save_it() throws Throwable {
	       
	    }

	    @Then("^user deletes the application$")
	    public void user_deletes_the_application() throws Throwable {
	       
	    }

	  


}
