package com.Compliance2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Compliance2 extends BaseClass {

	@Given("user on home page")
	public void user_on_home_page() throws InterruptedException {
		login();
		Thread.sleep(2000);

	}

	@When("user lands on home page and click on created app and clicks on record level search")
	public void user_lands_on_home_page_and_click_on_created_app_and_clicks_on_record_level_search()
			throws InterruptedException, AWTException {

		/*
		 * Actions as = new Actions(driver); WebElement search =
		 * driver.findElement(By.xpath("//label[@id='mat-form-field-label-125']"));
		 * as.moveToElement(search).sendKeys("search").build().perform();
		 */

		// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]")).sendKeys("APPLICATION_ARCHON_1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_ARCHON1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[1]/mat-icon[1]"))
				.click();
		Thread.sleep(3000);
		StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\RECORD LEVEL RETENTION CHECK (1).yml");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot robot = new Robot();
		robot.delay(250);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(90);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-card-title[contains(text(),'RECORD LEVEL RETENTION CHECK Copy')]")).click();
		Thread.sleep(3000);
	}

	@Then("^user enters search field$")
	public void user_enters_search_field() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
		Thread.sleep(7000);
	}

	@Then("^apply retention for record level$")
	public void apply_retention_for_record_level() throws Throwable {
		driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'mode_standby')]")).click();
		driver.findElement(By.xpath("//mat-select[@formcontrolname='policyAgingType']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='policyName']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'policy666')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/div[1]/div[1]/button[2]"))
				.click();
		Thread.sleep(30000);
		driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();

	}

	// *******************************************************************************************

	@Given("^user logins and go to system settings$")
	public void user_logins_and_go_to_system_settings() throws Throwable {

		login();

		driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
		Thread.sleep(3000);

	}

	@When("^user click on job tab$")
	public void user_click_on_job_tab() throws Throwable {

		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
		Thread.sleep(3000);

	}

	@Then("^user start adding a retention via table job by clicking add icon$")
	public void user_start_adding_a_retention_via_table_job_by_clicking_add_icon() throws Throwable {
		driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("automation job1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply Retention Policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='appId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'APPLICATION_ARCHON_1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]"))
				.click();
		// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='selectRetetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='retetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'policy666')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply to Table')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='typeInput']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-option[10]/span[1]/div[1]"))
				.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]"))
				.click();
		Thread.sleep(3000);

	}

	@Then("^user creates a retention job and navigate to job page$")
	public void user_creates_a_retention_job_and_navigate_to_job_page() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 10; i++) {
			driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
		}

		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-management[1]/div[1]/div[1]/div[1]/div[3]/div[1]/mat-table[1]/mat-row[1]/mat-cell[11]/mat-icon[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
		Thread.sleep(3000);
		driver.close();
	}

	// *****************************************************************************************

	@Given("^user logins the application  and navigate to system settings$")
	public void user_logins_the_applicatio_and_navigate_to_system_settings() throws Throwable {
		login();

		driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
		Thread.sleep(3000);
	}

	@When("^user select job tab to create a retention$")
	public void user_select_job_tab_to_create_a_retention() throws Throwable {
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
		Thread.sleep(3000);

	}

	@Then("^user start adding a retention via search job by clicking add icon$")
	public void user_start_adding_a_retention_via_search_job_by_clicking_add_icon() throws Throwable {
		driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("automation job2");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply Retention Policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='appId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'APPLICATION_ARCHON_1')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]"))
				.click();
		// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='selectRetetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='retetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'policy666')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//span[contains(text(),'RECORD LEVEL RETENTION CHECK')]"))
				.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]"))
				.click();
		Thread.sleep(3000);

	}

	@Then("^user clicks on creates and navigate to job page$")
	public void user_clicks_on_creates_and_navigate_to_job_page() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 10; i++) {
			driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
		}

		driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-management[1]/div[1]/div[1]/div[1]/div[3]/div[1]/mat-table[1]/mat-row[1]/mat-cell[11]/mat-icon[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
		Thread.sleep(3000);
		driver.close();
	}
	
	//**************************************************************************************************
	

    @Given("^user logins the application$")
    public void user_logins_the_application() throws Throwable {
    	login();
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("//mat-card-title[contains(text(),'HDFS_ CLAIMSYS')]")).click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//span[contains(text(),'Import search')]")).click();
    	Thread.sleep(3000);
    	
    	StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\GROUP LEVEL query check (5).yml");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
        Robot robot = new Robot();
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(90);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
        
     
    }

    @When("^user  click on exisiting app and clicks on group level search$")
    public void user_click_on_exisiting_app_and_clicks_on_group_level_search() throws Throwable {
       driver.findElement(By.xpath("//mat-card-title[contains(text(),'GROUP LEVEL query check')]")).click();
       Thread.sleep(3000);
       
    }

    @Then("^user clicks search field$")
    public void user_clicks_search_field() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
        Thread.sleep(7000);
    }

    @Then("^apply retention for group level$")
    public void apply_retention_for_group_level() throws Throwable {
       driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-perform-result[1]/div[2]/div[1]/div[2]/button[1]/span[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-select[@formcontrolname='policyAgingType']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-select[@formcontrolname='policyName']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Create retention policy')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@formcontrolname='policyName']")).sendKeys("new policy");
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-select[@formcontrolname='agingStrategy']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-select[@formcontrolname='agingStrategy']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//div[contains(text(),'30')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-select[@formcontrolname='policyName']")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//span[contains(text(),'new policy')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/div[1]/div[1]/button[2]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
       
       
       
       
       
       
    }
    
    //***************************************************************
    
    
    @Given("^user logins in the app and go to system settings$")
    public void user_logins_in_the_app_and_go_to_system_settings() throws Throwable {
    	login();

		driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
		Thread.sleep(3000);

    }

    @When("^user click on job tab of the application$")
    public void user_click_on_job_tab_of_the_application() throws Throwable {
    	driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("automation job50");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply Retention Policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='appId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'HDFS_ CLAIMSYS')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]"))
				.click();
		// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='selectRetetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='retetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'new policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
		Thread.sleep(3000);
		
    }

    @Then("^user add group level retention via table$")
    public void user_add_group_level_retention_via_table() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Apply to Table')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='typeInput']")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-option[2]/span[1]/div[1]")).click();
				
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]"))
				.click();
		Thread.sleep(3000);
    }

    @Then("^group level retention is created by the user$")
    public void group_level_retention_is_created_by_the_user() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);
		for (int i = 0; i < 10; i++) {
			driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
		}
      
    }
    
    
    //*******************************************************************************
    @Given("^when user navigates to the home page and job page$")
    public void when_user_navigates_to_the_home_page_and_job_page() throws Throwable {
    	login();

		driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
		Thread.sleep(3000);

    }

    @When("^user start creating a job by clicking add circle$")
    public void user_start_creating_a_job_by_clicking_add_circle() throws Throwable {
    	driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("automation job52");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Apply Retention Policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='appId']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'HDFS_ CLAIMSYS')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]"))
				.click();
		// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='selectRetetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='retetion']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'new policy')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
		Thread.sleep(3000);
    }

    @Then("^user start creating group level retention for the specified application$")
    public void user_start_creating_group_level_retention_for_the_specified_application() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Apply through Search')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[1]")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'GROUP LEVEL query check')]")).click();
		
		
		Thread.sleep(3000);
	
		

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",
				driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]"))
				.click();
		Thread.sleep(3000);
    }

    @Then("^user creates group level retention$")
    public void user_creates_group_level_retention() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
    			Thread.sleep(7000);
    			driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
    			Thread.sleep(3000);
    			driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
    			Thread.sleep(3000);
    			for (int i = 0; i < 10; i++) {
    				driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
    	    }
    }
    
    
    
  


}

