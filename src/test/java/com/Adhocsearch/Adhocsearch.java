package com.Adhocsearch;

import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import com.Configuration.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adhocsearch extends BaseClass{
	
	@Given("^user create an application$")
    public void user_create_an_application() throws Throwable {
		login();
		Thread.sleep(3000);
		
       
    }

    @When("^user click on created application$")
    public void user_click_on_created_application() throws Throwable {
       driver.findElement(By.xpath("//mat-card-title[contains(text(),'claims app test')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//mat-icon[contains(text(),'manage_search')]")).click();
       Thread.sleep(3000);
    }

    @Then("^user creates a adhoc search by passing conditions$")
    public void user_creates_a_adhoc_search_by_passing_conditions() throws Throwable {
        driver.findElement(By.xpath("//mat-icon[contains(text(),'add_circle')]")).click();
        Thread.sleep(3000);
        Actions aj = new Actions(driver);
    	aj.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-adhoc-search[1]/mat-card[1]/div[1]/div[3]/div[1]/app-adhoc-search-filter[1]/query-builder[1]/div[2]/ul[1]/li[1]/mat-form-field[3]/div[1]/div[1]/div[1]"))).click().sendKeys("90001").build().perform();
    	 Robot r = new Robot();
        //driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-adhoc-search[1]/mat-card[1]/div[1]/div[3]/div[1]/app-adhoc-search-filter[1]/query-builder[1]/div[2]/ul[1]/li[1]/mat-form-field[3]/div[1]/div[1]/div[1]")).sendKeys("90001");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Preview Query')]")).click();
        Thread.sleep(3000);
        
    }

    @Then("^user perform the adhoc search$")
    public void user_perform_the_adhoc_search() throws Throwable {
    	driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//mat-icon[contains(text(),'edit')]")).click();
    	 Thread.sleep(3000);
    	 
    	 Actions aj = new Actions(driver);
     	aj.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-adhoc-search[1]/mat-card[1]/div[1]/div[3]/div[1]/app-adhoc-search-filter[1]/query-builder[1]/div[2]/ul[1]/li[1]/mat-form-field[3]/div[1]/div[1]/div[1]"))).clickAndHold().keyDown(Keys.ARROW_UP).build().perform();
    	 //driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-adhoc-search[1]/mat-card[1]/div[1]/div[3]/div[1]/app-adhoc-search-filter[1]/query-builder[1]/div[2]/ul[1]/li[1]/mat-form-field[3]/div[1]/div[1]/div[1]")).clear();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
    	 Thread.sleep(3000);
    	 driver.findElement(By.xpath("//tbody/tr[1]/td[1]/span[1]/span[1]")).click();
    	 
    }

}
