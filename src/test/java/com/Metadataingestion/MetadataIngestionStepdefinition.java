package com.Metadataingestion;

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

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MetadataIngestionStepdefinition extends BaseClass{
	
	@Given("^user login and creates a application$")
    public void user_login_and_creates_a_application() throws Throwable {
		login();
		 
		 Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(7000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_INGESTION");
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
	 @Then("^in created application go to metadata page and click$")
	    public void in_created_application_go_to_metadata_page_and_click() throws Throwable {
		  driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("APPLICATION_INGESTION");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/mat-card-content[1]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'account_tree')]")).click();
	       Thread.sleep(10000);
	      
	    }
	 @And("^user click on ingest data icon$")
	    public void user_click_on_ingest_data_icon() throws Throwable {
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'drive_folder_upload')]")).click();
	       
	       Thread.sleep(3000);
		 driver.findElement(By.xpath("//span[contains(text(),'Ingest Data')]")).click();
		 Thread.sleep(3000);
		
	    	JavascriptExecutor executor = (JavascriptExecutor) driver;
	    	driver.switchTo().activeElement();
	    	Robot rob = new Robot();
	    	rob.keyPress(KeyEvent.VK_5);
	    	rob.keyRelease(KeyEvent.VK_5);
	    	  Thread.sleep(3000);	
	    
	        
	    }

   

   

    @Then("^user ingest the data with proper creds$")
    public void user_ingest_the_data_with_proper_creds() throws Throwable {
    	
    	WebElement script =driver.findElement(By.xpath("//input[@formcontrolname='source']"));
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].value='/home/ubuntu/DATA/BLOB_DATA/DBO'",script);
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//span[contains(text(),'Ingest')]")).click();
    	
        
    }
//******************************************
    @Given("^user login and creates a application with different name$")
    public void user_login_and_creates_a_application_with_different_name() throws Throwable {
    	login();
		 
		 Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(7000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_INGESTION1");
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

    @Then("^user navigate to metadata page in created app$")
    public void user_navigate_to_metadata_page_in_created_app() throws Throwable {
    	 driver.findElement(By.xpath("//*[@id=\"mat-input-8\"]")).sendKeys("APPLICATION_INGESTION1");
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_INGESTION1')]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//mat-icon[contains(text(),'account_tree')]")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//a[contains(text(),'USA_YEAREND')]")).click();
	       Thread.sleep(10000);
        
    }
    @And("^user click on any table$")
    public void user_click_on_any_table() throws Throwable {
    	// driver.findElement(By.xpath("//a[contains(text(),'USA_YEAREND')]")).click();
	      // Thread.sleep(3000);
	       driver.findElement(By.xpath("//mat-icon[@mattooltip='Table level ingestion']")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Ingest Data')]")).click();
	    	 Thread.sleep(3000);
	    	JavascriptExecutor executor = (JavascriptExecutor) driver;
	    	driver.switchTo().activeElement();
	    	Robot rob = new Robot();
	    	rob.keyPress(KeyEvent.VK_5);
	    	rob.keyRelease(KeyEvent.VK_5);
	    	Thread.sleep(3000);
    }



    @Then("^user ingest the data with proper creds in table level$")
    public void user_ingest_the_data_with_proper_creds_in_table_level() throws Throwable {
    	
    	WebElement script =driver.findElement(By.xpath("//input[@formcontrolname='source']"));
    	JavascriptExecutor executor = (JavascriptExecutor) driver;
    	executor.executeScript("arguments[0].value='/home/ubuntu/DATA/BLOB_DATA/DBO/USA_YEAREND'",script);
    	Thread.sleep(2000);
    	//driver.findElement(By.xpath("//span[contains(text(),'Ingest')]")).click();
        
    }
    
    //**************************************
    @Given("^user in login page and creates a application$")
    public void user_in_login_page_and_creates_a_application() throws Throwable {
    	
    	login();
		 
		 Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(7000);
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(3000);
	       driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_INGESTION2");
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
		       // driver.findElement(By.xpath("//bo
       
    }

    @Then("^in created application click on metadata icon$")
    public void in_created_application_click_on_metadata_icon() throws Throwable {
       
    }
    

    @And("^user click upload ingest data icon in the page$")
    public void user_click_upload_ingest_data_icon_in_the_page() throws Throwable {
       
    }


    @Then("^user try to ingest metadata with wrong source path$")
    public void user_try_to_ingest_metadata_with_wrong_source_path() throws Throwable {
       
    }

   

   


}
