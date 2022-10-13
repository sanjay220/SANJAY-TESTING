package com.Compliance;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Compliance extends BaseClass{
	
	 @Given("^user is on system settings$")
	    public void user_is_on_system_settings() throws Throwable {
		 login();
		  Thread.sleep(3000);
		 driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
	       Thread.sleep(3000);
	      
	    }

	    @When("^user clicks on compliance$")
	    public void user_clicks_on_compliance() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'policy')]")).click();
	    	 Thread.sleep(3000);
	        
	    }

	    @Then("^user creates a retention policy and save it$")
	    public void user_creates_a_retention_policy_and_save_it() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//input[@id='mat-input-5']")).sendKeys("policy creation 1");
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-compliance-retention-creation[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]")).click();
	    	 
		    	Thread.sleep(3000);Robot e = new Robot();
		    	e.keyPress(KeyEvent.VK_ENTER);
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		    	Thread.sleep(3000);
		    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-compliance-retention-creation[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//div[contains(text(),'30')]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-compliance-retention-creation[1]/div[1]/div[1]/button[2]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
		    	Thread.sleep(2000);
		    	driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		    	Thread.sleep(3000);
		    	driver.close();
		    	Thread.sleep(3000);
	      
	    }
	    //*********************************************************************************************
	    @Given("^user login and navigate to system settings$")
	    public void user_login_and_navigate_to_system_settings() throws Throwable {
	    	 login();
			  Thread.sleep(3000);
			 driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
		       Thread.sleep(3000);
	    }

	    @When("^user select compliance tab$")
	    public void user_select_compliance_tab() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'policy')]")).click();
	    	 Thread.sleep(3000);
	    }



	    @Then("^user will create a hold and save$")
	    public void user_will_create_a_hold_and_save() throws Throwable {
	       driver.findElement(By.xpath("//div[contains(text(),'Hold')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//input[@formcontrolname='holdName']")).sendKeys("hold new");
	       
	       driver.findElement(By.xpath("//mat-select[@formcontrolname='holdType']")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-compliance-hold-creation[1]/div[1]/div[1]/button[2]/span[1]")).click();
	       Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	        
	    }
	    
	    
	    //**********************************
	    
	   
	    @Given("^user creates an application with metadata$")
	    public void user_creates_an_application_with_metadata() throws Throwable {
	    	login();
			 
			 Thread.sleep(3000);
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_AUTOMATION_RET1");
			    Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
			    Thread.sleep(3000);
			    Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/mat-card/app-application-basic-details/div[2]/button[1]/span[1]")).click();
			    	Thread.sleep(3000);
			    	System.out.println("HDFS-STORAGE TYPE");
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/mat-card/app-application-storage-details/div[2]/button[2]/span[1]")).click();
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[2]/div[3]/button")).click();
			    	Thread.sleep(3000);
			        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Metadata\\Blob-data.json");
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
			        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[4]/button[3]/span[1]")).click();
			        Thread.sleep(3000);

	        
	    }

	    @When("^user click on metadata and go inside one table$")
	    public void user_click_on_metadata_and_go_inside_one_table() throws Throwable {
	       driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_AUTOMATION_RET1')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer/div/mat-nav-list/mat-list-item[2]/div/mat-icon")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//a[contains(text(),'PS_PY_SS_USA_GDE')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//div[contains(text(),'Retention')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	       Thread.sleep(3000);
	       
	      
	       
	       
	    }
	    
	    @And("^click on retention tab$")
	    public void click_on_retention_tab() throws Throwable {
	    	
	    	 driver.findElement(By.xpath("//input[@formcontrolname='retentionSetName']")).sendKeys("retention new");	       
		       Thread.sleep(2000);
		      driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
		      driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'policy666')]")).click();
		       Thread.sleep(3000);
		      
	        
	    }

	    @Then("^user apply table level retention$")
	    public void user_apply_table_level_retention() throws Throwable {
	    	 driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    }
   
	     //*********************************************************************
	    
	    @Given("^creating a app with metadata$")
	    public void creating_a_app_with_metadata() throws Throwable {
	    	
	    	login();
			 
			 Thread.sleep(3000);
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_AUTOMATION1");
			    Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
			    Thread.sleep(3000);
			    Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/mat-card/app-application-basic-details/div[2]/button[1]/span[1]")).click();
			    	Thread.sleep(3000);
			    	System.out.println("HDFS-STORAGE TYPE");
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/mat-card/app-application-storage-details/div[2]/button[2]/span[1]")).click();
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[2]/div[3]/button")).click();
			    	Thread.sleep(3000);
			        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Metadata\\Blob-data.json");
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
			        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[4]/button[3]/span[1]")).click();
				   
	    	
	    	
	        
	    }

	    @When("^user clicks on app and app info button$")
	    public void user_clicks_on_app_and_app_info_button() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_AUTOMATION1')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer[1]/div[1]/mat-nav-list[1]/mat-list-item[4]/div[1]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	
	    	
	    	
	       
	    }

	    @Then("^go to app compliance tab$")
	    public void go_to_app_compliance_tab() throws Throwable {
	    	driver.findElement(By.xpath("//div[contains(text(),'Application compliance')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	    	Thread.sleep(3000);
	    }

	    @Then("^create a new app level retention set$")
	    public void create_a_new_app_level_retention_set() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//input[@formcontrolname='retentionSetName']")).sendKeys("new app ret");
	    	Thread.sleep(3000);
	    	
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
		      driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'policy666')]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		    	 
	       
	    }
	    //*****************************************************************
	    
	    @Given("^create new app along with meta data$")
	    public void create_new_app_along_with_meta_data() throws Throwable {
	    	
	    	login();
			 
			 Thread.sleep(3000);
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_AUTOMATION3");
			    Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
			    Thread.sleep(3000);
			    Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/mat-card/app-application-basic-details/div[2]/button[1]/span[1]")).click();
			    	Thread.sleep(3000);
			    	System.out.println("HDFS-STORAGE TYPE");
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/mat-card/app-application-storage-details/div[2]/button[2]/span[1]")).click();
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[2]/div[3]/button")).click();
			    	Thread.sleep(3000);
			        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Metadata\\Blob-data.json");
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
			        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[4]/button[3]/span[1]")).click();
				   
	       
	    }

	    @When("^user clicks on the created app and app info and app compliance$")
	    public void user_clicks_on_the_created_app_and_app_info_and_app_compliance() throws Throwable {
	        driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_AUTOMATION3')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer[1]/div[1]/mat-nav-list[1]/mat-list-item[4]/div[1]/mat-icon[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[contains(text(),'Application compliance')]")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.xpath("//div[contains(text(),'Hold')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        
	    }


	    @Then("^create a new HOLD set and delete it from application level$")
	    public void create_a_new_retention_set_and_delete_it_from_application_level() throws Throwable {
	        driver.findElement(By.xpath("//input[@formcontrolname='holdSetName']")).sendKeys("new hold");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'hold1')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	    	 Thread.sleep(3000);
	    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    	 
	        
	        
	    }
	    
	    //************************************************************************************
	    
	    @Given("^new application create with blob data$")
	    public void new_application_create_with_blob_data() throws Throwable {
	    	login();
			 
			 Thread.sleep(3000);
			  driver.manage().window().maximize();
			  Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_AUTOMATION4");
			    Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
			    Thread.sleep(3000);
			    Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/mat-card/app-application-basic-details/div[2]/button[1]/span[1]")).click();
			    	Thread.sleep(3000);
			    	System.out.println("HDFS-STORAGE TYPE");
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/mat-card/app-application-storage-details/div[2]/button[2]/span[1]")).click();
			    	Thread.sleep(3000);
			    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[2]/div[3]/button")).click();
			    	Thread.sleep(3000);
			        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Metadata\\Blob-data.json");
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
			        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[3]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[4]/button[3]/span[1]")).click();
				   
	    }

	    @Then("^go to the application and go to metadata tab and go inside a table$")
	    public void go_to_the_application_and_go_to_metadata_tab_and_go_inside_a_table() throws Throwable {
	      driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_AUTOMATION4')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//mat-icon[contains(text(),'account_tree')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//a[contains(text(),'PS_PY_SS_USA_GDE')]")).click();
	      Thread.sleep(3000);
	      driver.findElement(By.xpath("//div[contains(text(),'Hold')]")).click();
	      Thread.sleep(3000);
	      
	    }

	    @And("^click on hold tab and create a new hold$")
	    public void click_on_hold_tab_and_create_a_new_hold() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@formcontrolname='holdSetName']")).sendKeys("table hold");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Legal')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-hold[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'hold1')]")).click();
	    	 Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[8]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
		    	 Thread.sleep(3000);
		    	 driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		    	 
	    }

		        
		        //**********************************************************************************
	    
	  

		        
	    	
	    	
	        
	    



	   



}
