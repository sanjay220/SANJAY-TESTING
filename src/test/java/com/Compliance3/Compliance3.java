package com.Compliance3;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Compliance3 extends BaseClass{
	
	 @Given("^user on home page$")
	    public void user_on_home_page() throws Throwable {
		 login();
			Thread.sleep(3000);

	    }

	    @When("^user lands on home page and click on created app and clicks on record level search$")
	    public void user_lands_on_home_page_and_click_on_created_app_and_clicks_on_record_level_search() throws Throwable {
	    	
			driver.findElement(By.xpath("//mat-card-title[contains(text(),'HDFS_ CLAIMSYS')]")).click();
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
			
			driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-card-title[contains(text(),'RECORD LEVEL RETENTION CHECK')]")).click();
			Thread.sleep(3000);
	    }

	    @Then("^user enters search field$")
	    public void user_enters_search_field() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
			Thread.sleep(7000);
	    }

	    @Then("^apply hold for record level$")
	    public void apply_hold_for_record_level() throws Throwable {
	    	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")).click();
	    	Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-perform-result[1]/div[2]/div[1]/div[2]/button[2]")).click();
			
			driver.findElement(By.xpath("//mat-select[@formcontrolname='holdType']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-select[@formcontrolname='holdType']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-select[@formcontrolname='holdName']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Create hold policy')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@formcontrolname='holdName']")).sendKeys("hold new1");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-select[@formcontrolname='holdType']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[contains(text(),'hold new1')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/div[1]/div[1]/button[2]/span[1]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
			
			
			
			

	    }

//***********************************************************************

@Given("^user logins app and go to system setting$")
public void user_logins_app_and_go_to_system_setting() throws Throwable {
	login();

	driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
	Thread.sleep(3000);
}

@When("^user click on job button$")
public void user_click_on_job_button() throws Throwable {
	driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	Thread.sleep(3000);

}

@Then("^user start adding a hold via table job by clicking add icon$")
public void user_start_adding_a_hold_via_table_job_by_clicking_add_icon() throws Throwable {
	driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("record hold1");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
	driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Apply Hold Policy')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]")).click();
			
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'HDFS_ CLAIMSYS')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(
			"//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]"))
			.click();
	// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='selectHold']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='hold']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'hold new1')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Apply to Table')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='typeInput']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[1]/div[1]/div[1]/mat-option[2]/span[1]/div[1]")).click();
	Thread.sleep(3000);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()",
			driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]")).click();
	Thread.sleep(3000);
}

@Then("^user creates a hold job and navigate to job page$")
public void user_creates_a_hold_job_and_navigate_to_job_page() throws Throwable {
	//driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath("//header/mat-toolbar[1]/div[1]/div[2]/button[3]/span[1]/mat-icon[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
	Thread.sleep(3000);
	for (int i = 0; i < 10; i++) {
		driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	}
}

//*****************************************************

@Given("^user login the application  and navigate to system setting$")
public void user_login_the_application_and_navigate_to_system_setting() throws Throwable {
	login();

	driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
	Thread.sleep(3000);
}

@When("^user select job tab to create a hold$")
public void user_select_job_tab_to_create_a_hold() throws Throwable {
	driver.findElement(By.xpath("//mat-icon[contains(text(),'schedule')]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	Thread.sleep(3000);
}

@Then("^user start adding a hold via search job by clicking add icon$")
public void user_start_adding_a_hold_via_search_job_by_clicking_add_icon() throws Throwable {
	driver.findElement(By.xpath("//input[@formcontrolname='jobName']")).sendKeys("record hold2");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
	driver.findElement(By.xpath("//mat-select[@formcontrolname='jobDefinitionId']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Apply Hold Policy')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/button[1]")).click();
			
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'HDFS_ CLAIMSYS')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
	// driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/button[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='selectHold']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='hold']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'hold new1')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='applyType']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Apply through Search')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//mat-select[@formcontrolname='selectSearch']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'RECORD LEVEL RETENTION CHECK')]")).click();
	Thread.sleep(3000);

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView()",
			driver.findElement(By.xpath("//div[contains(text(),'Scheduling details')]")));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-job-instance-definition[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/button[2]/span[1]")).click();
	Thread.sleep(3000);
}

@Then("^user click on creates and navigate to job page in application$")
public void user_click_on_creates_and_navigate_to_job_page_in_application() throws Throwable {
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

