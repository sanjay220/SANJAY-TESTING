package com.ExportandImportSearches;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Exportandimportsearches extends BaseClass{
	
	 @Given("^user on home page$")
	    public void user_on_home_page() throws Throwable {
	        login();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_EXPORT_IMPORT");
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
			        Thread.sleep(20000);
			        driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_EXPORT_IMPORT')]")).click();
			        Thread.sleep(3000);
			      
	    }

	    @When("^user navigate to search page$")
	    public void user_navigate_to_search_page() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Basic search')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@formcontrolname='searchName']")).sendKeys("basic search");
	    	Thread.sleep(8000);
	    	driver.findElement(By.xpath("//input[@id='typeInput']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//div[contains(text(),'USA_YEAREND')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("new search");
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/mat-checkbox[1]/label[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//div[contains(text(),'Result')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//tbody/tr[1]/td[1]/mat-checkbox[1]/label[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//tbody/tr[2]/td[1]/mat-checkbox[1]/label[1]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Export search')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Delete search')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[2]/div[1]/div[1]/div[1]/div[5]/button[1]")).click();
	     	Thread.sleep(3000);
	     	 
	    	
	       
	    }
	    @When("^user imports and export basic search in the application and delete it$")
	    public void user_imports_and_export_basic_search_in_the_application_and_delete_it() throws Throwable {
	    	StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\BASIC SEARCH (1).yml");
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
	        Thread.sleep(5000);
	    }

	    @SuppressWarnings("deprecation")
		@Then("^user imports and export the advance search and deletes it$")
	    public void user_imports_and_export_the_advance_search_and_deletes_it() throws Throwable {
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[1]/mat-icon[1]")).click();
	        Thread.sleep(3000);
	        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\NEW ADVANCE SEARCH.yml");
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
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Export search')]")).click();
	        Thread.sleep(3000);
	   // boolean displayed = driver.findElement(By.xpath("//div[contains(text(),'NEW ADVANCE SEARCH exported successfully')]")).isDisplayed();  
	   
	   
	    }

	    @Then("^report search is imported and exported and finally deleted$")
	    public void report_search_is_imported_and_exported_and_finally_deleted() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Report search')]")).click();
	    	Thread.sleep(3000);
	    	
	        driver.findElement(By.xpath("//input[@formcontrolname='searchName']")).sendKeys("NEW REPORT SEARCH1");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("report search");
	        Thread.sleep(3000);
	        Actions ay = new Actions(driver);
	    	ay.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-creation[1]/div[1]/div[1]/mat-card[1]/div[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]"))).click().keyDown(Keys.SHIFT).sendKeys("report search").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER);  
	        driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("heading");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[2]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("EMPLID");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("EMPLID");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='minCharacters']")).sendKeys("0");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='maxCharacters']")).sendKeys("100");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='toolTip']")).sendKeys("tool tip");
	        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[3]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("ADDR_ID1");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("ADDR_ID1");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//textarea[@formcontrolname='options']")).sendKeys("combo box");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[contains(text(),'Result')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("EMPLID1");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("EMPLID1");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("PY_TAX_YEAR");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("PY_TAX_YEAR");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[2]/mat-form-field[2]/div[1]/div[1]/div[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'INTEGER')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Create')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-tab-header/div[2]/div[1]/div[1]/div[3]/div[1]")).click();
	        Thread.sleep(3000);
	       // JavascriptExecutor  executor1 = (JavascriptExecutor) driver;
	       // WebElement query = driver.findElement(By.xpath("//mat-tab-body/div[1]/app-query[1]/div[1]/div[1]/div[2]/div[1]"));
	       // executor1.executeScript("argument[0].value='select EMPLID,PY_TAX_YEAR from APPLICATION_ADVANCE_SEARCH_DBO.PS_PY_SS_USA_GDE'");
	        Actions abb = new Actions(driver);
	    	abb.moveToElement(driver.findElement(By.xpath("//mat-tab-body/div[1]/app-query[1]/div[1]/div[1]/div[2]/div[1]"))).click().sendKeys("select ADDR_TYPE from CLAIMS_APP_TEST_DBO ADDRESS").build().perform();
	    	  Thread.sleep(3000);
	    
	    	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	    	  Thread.sleep(5000);
	    	  
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//span[contains(text(),'Export search')]")).click();
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//span[contains(text(),'Delete search')]")).click();
	    	  Thread.sleep(3000);
	    	  driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    	  Thread.sleep(5000);
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[1]/mat-icon[1]")).click();
	    	  Thread.sleep(3000);
	    	  StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\NEW REPORT SEARCH1.yml");
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
		        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Delete search')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Delete search')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Delete search')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
		        Thread.sleep(3000);
		        driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
		        Thread.sleep(3000);
		        Actions at = new Actions(driver);
		    	at.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]"))).click().keyDown(Keys.SHIFT).sendKeys("APPLICATION_EXPORT_IMPORT").doubleClick().build().perform();
		    	 Robot r1 = new Robot();
		    	 r1.keyPress(KeyEvent.VK_ENTER);  
		    	 Thread.sleep(3000);
driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/div[3]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Delete application')]")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
	    }


	   




}
