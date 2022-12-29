package com.StepDefinition;






import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.Configuration.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepdefinition extends BaseClass  {
	
	  @Given("^user is on landing page$")
	    public void user_is_on_landing_page() throws Throwable {
		  launch("chrome");
		System.out.println("LANDING PAGE");
	
	        
	    }

	    /*@When("^user login into the application with (.+) and (.+)$")
	    public void user_login_into_the_application_with_and(String username, String password) throws Throwable {
	        driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(username);
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(password);
	        Thread.sleep(3000);
	       driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	       Thread.sleep(2000);
	       
	    }*/
	  @When("^user login into the application with user_Id and Password$")
	    public void user_login_into_the_application_with_userid_and_password(DataTable data) throws Throwable {
	    	List<List<String>> obj=data.asLists(String.class);
	    	for(int i=0;i<obj.size();i++) {
	    		for(int j=0;j<obj.size();j++) {
	    			System.out.println(obj.get(i).get(j));
	    			if(obj.get(i).get(j).contains("user")) {
	    				driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).clear();
	    				driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys(defaultStpeDefinition.dataRead(obj.get(i).get(j)));
	    				Thread.sleep(3000);
	    			}else if(obj.get(i).get(j).contains("Password")){
	    				driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).clear();
	    				driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys(defaultStpeDefinition.dataRead(obj.get(i).get(j)));
	    		        Thread.sleep(3000);
	    			}
	    		}
	    		driver.findElement(By.xpath("//span[contains(text(),'Sign In')]")).click();
	 	       Thread.sleep(2000); 
	 	       if(driver.findElements(By.xpath("//span[contains(text(),'Ok')]")).size()>0) {
	 	    	  driver.findElement(By.xpath("//span[contains(text(),'Ok')]")).click();
	 	       }
	    	}
	        
	    }

	



}
