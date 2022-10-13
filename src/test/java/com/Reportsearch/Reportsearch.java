package com.Reportsearch;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Reportsearch extends BaseClass {
	
	 @Given("^user create an application$")
	    public void user_create_an_application() throws Throwable {
		 login();
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(3000);
	    }

	    @When("^user click on created application$")
	    public void user_click_on_created_application() throws Throwable {
	    	 
	        driver.findElement(By.xpath("//mat-card-title[contains(text(),'claims app test')]")).click();
	        Thread.sleep(3000);
	    }

	    @Then("^user creates a report search by giving query$")
	    public void user_creates_a_report_search_by_giving_query() throws Throwable {
	    	driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-search-listing[1]/div[1]/div[2]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
	        Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Report search')]")).click();
	        Thread.sleep(3000);
	       
	        driver.findElement(By.xpath("//input[@formcontrolname='searchName']")).sendKeys("NEW REPORT SEARCH");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//input[@formcontrolname='description']")).sendKeys("report search");
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
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("ADDR_TYPE");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("ADDR_TYPE");
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
	        driver.findElement(By.xpath("//input[@formcontrolname='label']")).sendKeys("ADDR_TYPE");
	        driver.findElement(By.xpath("//input[@formcontrolname='bindingName']")).sendKeys("ADDR_TYPE");
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
	        
	    }

	    @Then("^user perform the report search$")
	    public void user_perform_the_report_search() throws Throwable {
	        driver.findElement(By.xpath("//mat-card-title[contains(text(),'NEW REPORT SEARCH')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Generate report')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//body/app-root[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[1]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[contains(text(),'Close')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//mat-icon[contains(text(),'alarm_on')]")).click();
	        Thread.sleep(3000);
	        for(int i=0;i<20;i++)
	          {
	        	 driver.findElement(By.xpath("//mat-icon[contains(text(),'refresh')]")).click();
	          }
	        
	        
	          
	    }

}
