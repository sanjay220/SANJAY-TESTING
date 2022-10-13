package com.EditSearches;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

public class Editsearchstepdefinition extends BaseClass {
	
	  @Given("^user logins application ,and create new application$")
	    public void user_logins_application_and_create_new_application() throws Throwable {
		  login();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
		       Thread.sleep(3000);
		       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_EDIT_SEARCH");
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
			        driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_EDIT_SEARCH')]")).click();
			        Thread.sleep(3000);
	    }

	    @When("^user creates a new basic search$")
	    public void user_creates_a_new_basic_search() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Basic search')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@formcontrolname='searchName']")).sendKeys("basic search new");
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
	    }

	    @Then("^user edit the created basic search and save it$")
	    public void user_edit_the_created_basic_search_and_save_it() throws Throwable {
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-actions[1]/div[3]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Edit search')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[2]/div[1]/div[1]/mat-card[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[2]/mat-card[1]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/mat-icon[3]")).click();
	    	Thread.sleep(3000);
	    	Actions gy = new Actions(driver);
	    	gy.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='label']"))).doubleClick().sendKeys("EMPLID_NEW").build().perform();
	    	Thread.sleep(3000);
	    	gy.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='bindingName']"))).doubleClick().sendKeys("EMPLID_NEW").build().perform();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-search-edit-fields[1]/div[1]/div[1]/button[2]/span[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//div[contains(text(),'Result')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//*[@id=\"cdk-drop-list-1\"]/mat-header-row/mat-header-cell[2]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body[1]/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-form[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/app-result[1]/div[1]/div[2]/div[1]/mat-table[1]/mat-header-row[1]/mat-header-cell[2]/div[2]/mat-icon[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-tab-body/div[1]/div[1]/div[1]/div[3]/mat-slide-toggle[1]/label[1]/div[1]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//mat-select[@formcontrolname='maskOptions']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")).click();
	    	
	    	Thread.sleep(3000);
	    	WebElement findElement = driver.findElement(By.xpath("//input[@formcontrolname='maskCharacters']"));
	    	 for(int i=0;i<3;i++)
	          {
	    		 findElement.sendKeys(Keys.ARROW_UP);
	          }
	    	 Thread.sleep(3000);
	    	/*Actions yu = new Actions(driver);
	    	yu.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='maskCharacters']"))).doubleClick().sendKeys("3").build().perform();
	    	Thread.sleep(3000);*/
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/mat-dialog-container[1]/app-config-column-result[1]/section[1]/div[1]/button[2]/span[1]")).click();
	    	 Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[contains(text(),'Update')]")).click();
	    
	    	
	    	
	    	
	    	
	    }

	    @Then("^user import report search$")
	    public void user_import_report_search() throws Throwable {
	       
	    }

	    @And("^user edits the imported basic search and save it$")
	    public void user_edits_the_imported_basic_search_and_save_it() throws Throwable {
	        
	    }

}
