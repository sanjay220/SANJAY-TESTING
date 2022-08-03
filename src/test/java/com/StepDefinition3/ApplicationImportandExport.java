package com.StepDefinition3;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.junit.BeforeClass;
import org.openqa.selenium.By;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplicationImportandExport extends BaseClass {
	
	
	 @Given("^user is on application home page$")
	    public void user_is_on_application_home_page() throws Throwable {
		
		 System.out.println("home page is displayed");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
	        
	    }
	  @When("^user delete the exisisting application$")
	    public void user_delete_the_exisisting_application() throws Throwable {
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[7]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[5]")).click();
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-generic-confirm-dialog[1]/mat-dialog-actions[1]/button[2]")).click();
	       Thread.sleep(20000);
	    }

	    @Then("^user click on import icon and import the application$")
	    public void user_click_on_import_icon_and_import_the_application() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[1]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\APPLICATION_CS1_APPLICATION_EXPORT.zip");
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
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'account_circle')]")).click();
		     Thread.sleep(2000);
		     driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[4]")).click();
		     Thread.sleep(3000);
		     driver.close();
	       
	      
	    	
	        
	    }
	    
	    @Given("^user is on home page$")
	    public void user_is_on_home_page() throws Throwable {
	    	launch("chrome");
	    	System.out.println("home page displayed again");
	    	
	    	driver.manage().window().maximize();
	    	Thread.sleep(2000);
	        
	    }

	    @When("^user select the application and export it$")
	    public void user_select_the_application_and_export_it() throws Throwable {
	    	driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[3]/div/div/div/div[7]/mat-card/mat-card-actions/div[3]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/a[3]")).click();
	        Thread.sleep(3000);
	    }
	    

	    @Then("^user clicks on background jobs$")
	    public void user_clicks_on_background_jobs() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'alarm_on')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	Thread.sleep(10000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	Thread.sleep(10000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	Thread.sleep(10000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	    	Thread.sleep(2000);
	    	
	    	
	       
	    }

	    @Then("^user download the application$")
	    public void user_download_the_application() throws Throwable {
	    	driver.findElement(By.xpath("//tbody/tr[1]/td[8]/button[3]")).click();
	    	Thread.sleep(2000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-bottom-sheet-container[1]/app-background-jobs[1]/div[1]/div[1]/mat-toolbar[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
	        Thread.sleep(3000);
	        
	    }
	    
	    @Then("^user logout the application$")
	    public void user_logout_the_application() throws Throwable {
	     driver.findElement(By.xpath("//mat-icon[contains(text(),'account_circle')]")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/a[4]")).click();
	     Thread.sleep(3000);
	     driver.close();
	    }



}
