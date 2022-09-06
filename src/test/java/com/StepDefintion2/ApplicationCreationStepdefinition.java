package com.StepDefintion2;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ApplicationCreationStepdefinition extends BaseClass{

   

	
	 @Given("^user should able to click the ADD APPLICATION icon$")
	    public void user_should_able_to_click_the_add_application_icon() throws Throwable {
		login();
		 
		 Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(3000);
	       
	    }

	    @When("^user fills the application info with application type active archiving$")
	    public void user_fills_the_application_info_with_application_type_active_archiving() throws Throwable {
	    driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_AUTOMATION");
	    Thread.sleep(3000);
	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
	    Thread.sleep(3000);
	    }

	    @When("^user fills the application info with category with ADPTESTING$")
	    public void user_fills_the_application_info_with_category_with_adptesting() throws Throwable {
	    	Actions a = new Actions(driver);
	    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);  
	    	
	    	
	    	 Thread.sleep(3000);
	    }

	    @Then("^user should proceed to storage tier$")
	    public void user_should_proceed_to_storage_tier() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-0\"]/div/mat-card/app-application-basic-details/div[2]/button[1]/span[1]")).click();
	    	Thread.sleep(3000);
	       
	    }
	  //user should able to proceed to METADATA upload with HDFS storage type
		  //  **********************************************************************
	    
	    @Given("^storage type with HDFS$")
	    public void storage_type_with_hdfs() throws Throwable {
	    	System.out.println("HDFS-STORAGE TYPE");
	    	Thread.sleep(3000);
	       
	    }

	    @When("^user clicks the proceed to metadata upload$")
	    public void user_clicks_the_proceed_to_metadata_upload() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-1\"]/div/mat-card/app-application-storage-details/div[2]/button[2]/span[1]")).click();
	    	Thread.sleep(3000);
	    }

	    @Then("^upload metadata page should navigated$")
	    public void upload_metadata_page_should_navigated() throws Throwable {
	    	System.out.println("METADATA upload page is displayed");
	    	Thread.sleep(3000);
	    	
	       
	    }
	    @Then("^clicks on BROWSE FILE and upload the metadata$")
	    public void clicks_on_browse_file_and_upload_the_metadata() throws Throwable {
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
	      
	    }
	    
	    @Then("^click on proceed to application compliance$")
	    public void click_on_proceed_to_application_compliance() throws Throwable {
	     driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[4]/button[2]")).click();
	    }
	    
	   // ************************************************************************
	    

	    @Given("^user is on APPLICATION COMPLIANCE$")
	    public void user_is_on_application_compliance() throws Throwable {
	    	System.out.println("APPLICATION COMPLIANCE IS DISPLAYED");
	    	Thread.sleep(3000);
	      
	    }

	    @When("^user clicks on add icon to create a new retention set$")
	    public void user_clicks_on_add_icon_to_create_a_new_retention_set() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"mat-tab-content-1-0\"]/div/app-retention-list/div/div[1]/div/button")).click();
	       Thread.sleep(4000);
	    }
	    
	    @Then("^apply retention box should displayed$")
	    public void apply_retention_box_should_displayed() throws Throwable {
	    	System.out.println("APPLY RETENTION BOX IS DISPLAYED");
	      
	    }
	    @Then("^user enters retention set name$")
	    public void user_enters_retention_set_name() throws Throwable {
	       driver.findElement(By.xpath("//input[@formcontrolname='retentionSetName']")).sendKeys("sanjay_policy");
	       Thread.sleep(2000);
	    }

	   
	    

	    @Then("^user selects policy aging type FIXED$")
	    public void user_selects_policy_aging_type_fixed() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"mat-select-value-9\"]/span")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Fixed Date')]")).click();
	    	Thread.sleep(3000);
	    	
	        
	    }

	    
	    @Then("^user should able to create a new retention policy$")
	    public void user_should_able_to_create_a_new_retention_policy() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"mat-select-value-11\"]/span")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Create retention policy')]")).click();
	    	
	        
	    }
	    

	    @Then("^create retention policy box should displayed$")
	    public void create_retention_policy_box_should_displayed() throws Throwable {
	    	System.out.println("CREATE RETENTION POLICY BOX IS DISPLAYED");
	    	Thread.sleep(3000);
	       
	    }
	    

	    @Then("^user enters policy name \"([^\"]*)\" and description \"([^\"]*)\"$")
	    public void user_enters_policy_name_something_and_description_something(String strArg1, String strArg2) throws Throwable {
	       driver.findElement(By.xpath("//input[@formcontrolname='policyName']")).sendKeys(strArg1);
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys(strArg2);
	       Thread.sleep(3000);
	    }

	    @When("^user selects aging strategy as FIXED DATE$")
	    public void user_selects_aging_strategy_as_fixed_date() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"mat-select-value-13\"]/span")).click();
	    	Thread.sleep(3000);
	    	Robot e = new Robot();
	    	e.keyPress(KeyEvent.VK_ENTER);
	    	Thread.sleep(3000);
	    	//driver.findElement(By.xpath("//*[@id=\"mat-option-197\"]")).click();
	    	//driver.findElement(By.xpath("//*[@id=\"mat-input-35\"]")).click();
	    	
	    }

	    @Then("^user selects retention date$")
	    public void user_selects_retention_date() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/mat-form-field[4]/div[1]/div[1]/div[2]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//div[contains(text(),'30')]")).click();
	       
	    }

	    @When("^user clicks on create$")
	    public void user_clicks_on_create() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/div[1]/div[1]/button[2]")).click();
	      
	    }
	    

	    @Then("^success pop up message will displayed$")
	    public void success_pop_up_message_will_displayed() throws Throwable {
	    	System.out.println("SUCCESSFULLY CREATED");
	    	Thread.sleep(4000);
	    
	    }

	  

	
	    @Then("^user should able to view the created policy on RETENTION POLICY  and select it$")
	    public void user_should_able_to_view_the_created_policy_on_retention_policy_and_select_it() throws Throwable {
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-apply-retention[1]/mat-dialog-content[1]/div[1]/form[1]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'TESTING_POLICY29')]")).click();
	        Thread.sleep(3000);
	    }

	    @Then("^user clicks on apply button$")
	    public void user_clicks_on_apply_button() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Apply')]")).click();
	    	Thread.sleep(3000);
	    	
	    }
	    @Then("^user should able to create anapplication end to end$")
	    public void user_should_able_to_create_anapplication_end_to_end() throws Throwable {
	    	JavascriptExecutor js=(JavascriptExecutor)driver;
	    	js.executeScript("arguments[0].scrollIntoView()",driver.findElement( By.xpath("//div[@id='custom-mat-tab']/div/button[2]")));
	    	Thread.sleep(3000);
	       driver.findElement( By.xpath("//div[@id='custom-mat-tab']/div/button[2]")).click();
	       Thread.sleep(8000);
	    }
	    //************************************************************************************
	    
	    @Then("^user clicks on created application$")
	    public void user_clicks_on_created_application() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/mat-card[1]/mat-card-content[1]")).click();
	       Thread.sleep(3000);
	    }

	    @Then("^user clicks on app info$")
	    public void user_clicks_on_app_info() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer/div/mat-nav-list/mat-list-item[4]/div/mat-icon")).click();
	        Thread.sleep(3000);
	    }

	    @Then("^user clicks on application compliance$")
	    public void user_clicks_on_application_compliance() throws Throwable {
	    	driver.findElement(By.xpath("//div[contains(text(),'Application compliance')]")).click();
	    	Thread.sleep(3000);
	        
	    }

	    @Then("^user delete the RETENTION SET$")
	    public void user_delete_the_retention_set() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
	    	Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	        Thread.sleep(10000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	        Thread.sleep(3000);
	    }

	    @Then("^go back to application page and delete the created application$")
	    public void go_back_to_application_page_and_delete_the_created_application() throws Throwable {
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	       Thread.sleep(5000);
	    }
	    
	    @Then("^go to system settings$")
	    public void go_to_system_settings() throws Throwable {
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'settings')]")).click();
	       Thread.sleep(3000);
	    }

	    @Then("^click on compliance tab$")
	    public void click_on_compliance_tab() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer[1]/div[1]/mat-nav-list[1]/mat-list-item[2]/div[1]")).click();
	    	Thread.sleep(3000);
	       
	    }

	    @Then("^delete the created policy$")
	    public void delete_the_created_policy() throws Throwable {
	    	driver.findElement(By.xpath("//td[contains(text(),'TESTING_POLICY29')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'delete')]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	    	
	      
	    }
	    //********************************************************************************
	    @Given("^user login the application$")
	    public void user_login_the_application() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	       
	    }

	    @When("^user clicks on add application$")
	    public void user_clicks_on_add_application() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(2000);
	       
	    }

	    @Then("^user enters application name \"([^\"]*)\" and description \"([^\"]*)\"$")
	    public void user_enters_application_name_something_and_description_something(String strArg1, String strArg2) throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys( strArg1);
	 	    Thread.sleep(3000);
	 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys( strArg2);
	 	     Thread.sleep(2000);
	    }

	    @Then("^user selects category as ADPTESTING$")
	    public void user_selects_category_as_adptesting() throws Throwable {
	    	Actions a = new Actions(driver);
	    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);  
	    	 Thread.sleep(3000);
	        
	    }
	    @Then("^create an application and successful message should get display and delete the application$")
	    public void create_an_application_and_successful_message_should_get_display_and_delete_the_application() throws Throwable {
	    	 driver.findElement( By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/app-application-basic-details[1]/div[2]/button[2]")).click();
		       Thread.sleep(4000);
		       System.out.println("APPLICATION CREATED SUCCESSFULLY");
		       Thread.sleep(4000);
		       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	    }
	    //***************************************************************************************
	    

	    @Given("^user logins in the app$")
	    public void user_logins_in_the_app() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	       
	       
	    }
	 
	       
	    @When("^user click on add application$")
	    public void user_click_on_add_application() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(2000);
	    }

	    @Then("^user enter application name \"([^\"]*)\" and description \"([^\"]*)\"$")
	    public void user_enter_application_name_something_and_description_something(String strArg1, String strArg2) throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys( strArg1);
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys( strArg2);
		 	     Thread.sleep(2000);
	    }

	    @Then("^user select ADPTESTING$")
	    public void user_select_adptesting() throws Throwable {
	    	Actions a = new Actions(driver);
	    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);  
	    	 Thread.sleep(3000);
	   
	    }

	    @Then("^user select HDFS storage tier and create the application and finally delete it$")
	    public void user_select_hdfs_storage_tier_and_create_the_application_and_finally_delete_it() throws Throwable {
	       driver.findElement(By.xpath("//span[contains(text(),'Proceed to storage tier')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[2]/div[1]/div[1]/div[1]/mat-card[1]/app-application-storage-details[1]/div[2]/button[3]/span[1]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	       
	    }
	    
	    //*************************************************************************************************
	    
	    @Given("^user on application page$")
	    public void user_on_application_page() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	       
	    }

	    @When("^user click on add application button on the application$")
	    public void user_click_on_add_application_button_on_the_application() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(2000);
	    }

	    @Then("^user enters name \"([^\"]*)\" and descri \"([^\"]*)\"$")
	    public void user_enters_name_something_and_descri_something(String strArg1, String strArg2) throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys( strArg1);
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys( strArg2);
		 	     Thread.sleep(2000);
	    }

	    @Then("^select adptesting as category$")
	    public void select_adptesting_as_category() throws Throwable {
	    	Actions a = new Actions(driver);
	    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);  
	    	 Thread.sleep(3000);
	    }

	    @Then("^select HDFS tier as a storage type$")
	    public void select_hdfs_tier_as_a_storage_type() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Proceed to storage tier')]")).click();
		       Thread.sleep(3000);
	    }

	    @Then("^proceed to metadata upload and create application and finally delete it$")
	    public void proceed_to_metadata_upload_and_create_application_and_finally_delete_it() throws Throwable {
	        driver.findElement(By.xpath("//span[contains(text(),'Proceed to metadata upload')]")).click();
	        Thread.sleep(2000);
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
	      driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[5]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	      Thread.sleep(2000);
	      driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	       
	        
	    }
	    
	    //******************************************************************************************************
	    //NEGATIVE CASES
	    
	    @Given("^user login the application with valid creds$")
	    public void user_login_the_application_with_valid_creds() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	    }

	    @When("^cliks add button on home page$")
	    public void cliks_add_button_on_home_page() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(2000);
	        
	    }

	    @Then("^user enters exsisting name \"([^\"]*)\" and description as \"([^\"]*)\"$")
	    public void user_enters_exsisting_name_something_and_description_as_something(String strArg1, String strArg2) throws Throwable {
	    	 driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys( strArg1);
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys( strArg2);
		 	     Thread.sleep(2000);
	    }

	    @Then("^ERROR message should appears and create application button should be disabled$")
	    public void error_message_should_appears_and_create_application_button_should_be_disabled() throws Throwable {
	        System.out.println("Provided name is unavailable or taken please try a different name");
	        System.out.println("CREATE APPLICATION button is disabled");
	        
	        
	    }
	    
	    //************************************************************************************************
	    
	    @Given("^user is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	      
	    }

	    @When("^user creates a basic application$")
	    public void user_creates_a_basic_application() throws Throwable {
	    	 driver.manage().window().maximize();
			  Thread.sleep(5000);
		       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_VALIDATION");
			    Thread.sleep(3000);
			     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
			    Thread.sleep(3000);
			    driver.findElement( By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/app-application-basic-details[1]/div[2]/button[2]")).click();
			       Thread.sleep(4000);
			    
			    		
	       
	    }

	    @Then("^user validates created application details are same in application info$")
	    public void user_validates_created_application_details_are_same_in_application_info() throws Throwable {
	    	String validate = driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_VALIDATION')]")).getText();
	    	 Thread.sleep(3000);
	    Assert.assertEquals("APPLICATION_VALIDATION", validate);
	    	 //Assert.assertEquals(true, validate.isDisplayed());
	    	System.out.println(validate);
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[21]/mat-card[1]/mat-card-content[1]")).click();
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer[1]/div[1]/mat-nav-list[1]/mat-list-item[4]/div[1]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	String validate2=driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]/div[1]/div[1]/p[1]")).getText();
	    	Thread.sleep(2000);
	    	System.out.println(validate2);
	    	Thread.sleep(3000);
	    	  Assert.assertEquals(validate2, validate);
	    	 
	    }
	    //*******************************************************************************************************
	    

	    @Given("^user log in the application home page$")
	    public void user_log_in_the_application_home_page() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	      
	    }
	    @When("^user click add button in home page and creates application without giving name$")
	    public void user_click_add_button_in_home_page_and_creates_application_without_giving_name() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		      // driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys();
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
		 	    Thread.sleep(3000);
	        
	    }

	   

	  

	   

	    @Then("^user should not able to create application$")
	    public void user_should_not_able_to_create_application() throws Throwable {
	    	System.out.println("application not created");
	      
	    }
	    
	    //******************************************************************************

	    @Given("^user is on home page of app$")
	    public void user_is_on_home_page_of_app() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	       
	    }

	    @When("^user clicks add button and gives below three character in application name$")
	    public void user_clicks_add_button_and_gives_below_three_character_in_application_name() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("HP");
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
		 	    Thread.sleep(3000);
	        
	    }
	    
	    @And("^user validates the error message$")
	    public void user_validates_the_error_message() throws Throwable {
	    	String gttxt=driver.findElement(By.xpath("//span[contains(text(),'Min 3 chars required')]")).getText();
	    	Assert.assertEquals("Min 3 chars required", gttxt);
	    	System.out.println(gttxt);
	       
	    }

	    @Then("^user cannot able to create an application$")
	    public void user_cannot_able_to_create_an_application() throws Throwable {
	    	
	    	System.out.println("application not created");
	    
	    }
	    //****************************************************************************************************
	    
	    @Given("^user is on home page and clicks add button and creates an basic app$")
	    public void user_is_on_home_page_and_clicks_add_button_and_creates_an_basic_app() throws Throwable {
	    	launch("chrome");
	    	Thread.sleep(3000);
	    	login();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("SEARCH_DELETE");
		 	    Thread.sleep(3000);
		 	     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
		 	    Thread.sleep(3000);
		 	   Actions a = new Actions(driver);
		    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
		    	 Robot r = new Robot();
		    	 r.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
		    	 driver.findElement( By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-creat-application[1]/div[1]/mat-vertical-stepper[1]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/app-application-basic-details[1]/div[2]/button[2]")).click();
			       Thread.sleep(6000);
	    }

	    @When("^user searches the application on search tab it should display$")
	    public void user_searches_the_application_on_search_tab_it_should_display() throws Throwable {
	    	//Actions ab=new Actions(driver);
	    //	ab.moveToElement( driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]"))).click().sendKeys("SEARCH_DELETE").doubleClick().build().perform();
	      driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("SEARCH_DELETE");
	       Thread.sleep(2000);
	       System.out.println("DISPLAYED");
	       Thread.sleep(3000);
	       driver.navigate().back();
	       driver.navigate().back();
	     //  driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	       Thread.sleep(5000);
	       
	      // JavascriptExecutor Ajs=(JavascriptExecutor)driver;
	    	//Ajs.executeScript("arguments[0].scrollIntoView()",driver.findElement( By.xpath("//mat-card-title[contains(text(),'SEARCH_DELETE')]")));
	    	//Thread.sleep(3000);
	    	((JavascriptExecutor)driver).executeScript("scroll(0,400)");
	    }

	    @Then("^user delete the same application$")
	    public void user_delete_the_same_application() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	    	Thread.sleep(6000);
	    	
	     
	    }

	    @And("^searches again the application ,it should not display$")
	    public void searches_again_the_application_it_should_not_display() throws Throwable {
	    	  driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("SEARCH_DELETE");
		       Thread.sleep(2000);
		       System.out.println("NOT DISPLAYED");
	    	
	       
	    }







	  }




