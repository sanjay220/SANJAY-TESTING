package com.AdvancedSearch;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Advancedsearch extends BaseClass {
	 @Given("^user creates an application$")
	    public void user_creates_an_application() throws Throwable {
		 login();
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_ADVANCE_SEARCH");
		    Thread.sleep(3000);
		     driver.findElement(By.xpath("//*[@id=\"mat-input-5\"]")).sendKeys("TESTING-SA");
		    Thread.sleep(3000);
		    Actions a = new Actions(driver);
	    	a.moveToElement(driver.findElement(By.xpath("//*[@id=\"mat-chip-list-input-0\"]"))).click().keyDown(Keys.SHIFT).sendKeys("adptesting").doubleClick().build().perform();
	    	 Robot r = new Robot();
	    	 r.keyPress(KeyEvent.VK_ENTER); 
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
		        Thread.sleep(3000);
	    }

	    @When("^user clicks on created application$")
	    public void user_clicks_on_created_application() throws Throwable {
	    	
	    	 
	        driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_ADVANCE_SEARCH')]")).click();
	        Thread.sleep(3000);
	    	 
	    }

	    @Then("^user creates a advance search by giving query$")
	    public void user_creates_a_basic_search_by_giving_query() throws Throwable {
	    	driver.findElement(By.xpath("//span[contains(text(),'Advance search')]")).click();
	        Thread.sleep(3000);
	       
	        driver.findElement(By.xpath("//input[@formcontrolname='searchName']")).sendKeys("NEW ADVANCE SEARCH");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("advance search");
	        Thread.sleep(3000);
	        Actions ay = new Actions(driver);
	    	ay.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-creation[1]/div[1]/div[1]/mat-card[1]/div[1]/form[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]"))).click().keyDown(Keys.SHIFT).sendKeys("advance search").doubleClick().build().perform();
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
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("EMPLID1");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("EMPLID1");
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
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("EMPLID");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("EMPLID");
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
	        driver.findElement(By.xpath("//mat-tab-header/div[2]/div[1]/div[1]/div[4]/div[1]")).click();
	        Thread.sleep(3000);
	       // JavascriptExecutor  executor1 = (JavascriptExecutor) driver;
	       // WebElement query = driver.findElement(By.xpath("//mat-tab-body/div[1]/app-query[1]/div[1]/div[1]/div[2]/div[1]"));
	       // executor1.executeScript("argument[0].value='select EMPLID,PY_TAX_YEAR from APPLICATION_ADVANCE_SEARCH_DBO.PS_PY_SS_USA_GDE'");
	        Actions abb = new Actions(driver);
	    	abb.moveToElement(driver.findElement(By.xpath("//mat-tab-body/div[1]/app-query[1]/div[1]/div[1]/div[2]/div[1]"))).click().sendKeys("SELECT EMPLID  from APPLICATION_ADVANCE_SEARCH_DBO  PS_PY_SS_USA_GDE").build().perform();
	    	  Thread.sleep(3000);
	    
	    	driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();
	    	  Thread.sleep(5000);
	     
	    }

	    @Then("^user perform the search$")
	    public void user_perform_the_search() throws Throwable {
	     driver.findElement(By.xpath("//mat-card-title[contains(text(),'NEW ADVANCE SEARCH')]")).click();
	     Thread.sleep(3000);
	     //driver.findElement(By.xpath("//span[contains(text(),'Search')]")).click();
	    }


}
