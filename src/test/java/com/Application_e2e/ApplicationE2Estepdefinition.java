package com.Application_e2e;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Configuration.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class ApplicationE2Estepdefinition extends BaseClass{
	
	
	
	
	 @Given("^user should able to click the ADD APPLICATION icon$")
	    public void user_should_able_to_click_the_add_application_icon() throws Throwable {
		 
login();
		 
		 Thread.sleep(3000);
		  driver.manage().window().maximize();
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//span[contains(text(),'close')]")).click();
		  Thread.sleep(5000);
		  
	       driver.findElement(By.xpath("//*[@id=\"allow-custom-scroll\"]/mat-drawer-content/div/app-application-listing/div/div[2]/div/div[1]/button[1]/span[1]/mat-icon")).click();
	       Thread.sleep(5000);
	       
	        
	    }
	  @When("^user fills the application info with application type active archiving$")
	    public void user_fills_the_application_info_with_application_type_active_archiving() throws Throwable {
		  driver.findElement(By.xpath("//*[@id=\"mat-input-4\"]")).sendKeys("APPLICATION_END");
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
	    
	    

	    @Then("^clicks on BROWSE FILE and upload the metadata and create an new application$")
	    public void clicks_on_browse_file_and_upload_the_metadata_and_create_an_new_application() throws Throwable {
	    	
	    	driver.findElement(By.xpath("//*[@id=\"cdk-step-content-0-2\"]/div/mat-card/div/div[2]/div[3]/button")).click();
	    	Thread.sleep(3000);
	        StringSelection ss = new StringSelection("C:\\Users\\Admin\\Downloads\\Metadata\\BLOB DATA NEW.json");
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

	    @Then("^user clicks on created application$")
	    public void user_clicks_on_created_application() throws Throwable {
	    	
	    	//JavascriptExecutor jss=(JavascriptExecutor)driver;
	    	//jss.executeScript("arguments[0].scrollIntoView()",driver.findElement( By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[11]/mat-card[1]/mat-card-content[1]")));
	    	//jss.executeScript("window.scrollBy(0,1000)", "");
	       // Thread.sleep(3000);
	    	//driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_E2E1')]")).click();
	    	  //Thread.sleep(3000);
	    	  
	    	  driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/button[1]/span[1]/mat-icon[1]")).click();
		    	Thread.sleep(3000);
		    	Actions ny2=new Actions(driver);
		    	ny2.moveToElement(driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/span[1]"))).click().keyDown(Keys.SHIFT).sendKeys("APPLICATION_END").build().perform();
		    	
		    	//driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-core[1]/div[1]/mat-drawer-container[1]/mat-drawer-content[1]/div[1]/app-application-listing[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]")).sendKeys("APPLICATION_AUTOMATION");
		    	 Thread.sleep(3000);
		    	driver.findElement(By.xpath("//mat-card-title[contains(text(),'APPLICATION_END')]")).click();
		    	 Thread.sleep(3000);
	    }

	    @Then("^in created application go to metadata page and click$")
	    public void in_created_application_go_to_metadata_page_and_click() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'account_tree')]")).click();
	    	 Thread.sleep(8000);
	    }
	    
	    @And("^user click on ingest data icon$")
	    public void user_click_on_ingest_data_icon() throws Throwable {
	    	driver.findElement(By.xpath("//mat-icon[contains(text(),'drive_folder_upload')]")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("//span[contains(text(),'Ingest Data')]")).click();
	    	
	    	
	    }

	    @Then("^user ingest the data with proper creds$")
	    public void user_ingest_the_data_with_proper_creds() throws Throwable {
	    	//USED JS EXECUTOR AND ROBOT CLASS
	    	//
	    	
	    	
	    
	    	
	       WebElement script =driver.findElement(By.xpath("//input[@formcontrolname='filesCountPerSet']"));
	          
	          for(int i=0;i<5;i++)
	          {
	        	  script.sendKeys(Keys.ARROW_UP);
	          }
	          
		    	
		    	
		    	
		    	//JavascriptExecutor  executor = (JavascriptExecutor) driver;
		    	
		    	//driver.findElement(By.xpath("//span[contains(text(),'Ingest')]")).click();
		    	
	    	//
	    	//nu.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='filesCountPerSet']"))).click().keyDown(Keys.ARROW_UP).perform();
	    	//nu.moveToElement(driver.findElement(By.xpath("//input[@formcontrolname='filesCountPerSet']"))).click().keyDown(Keys.ARROW_UP).perform();
	       	
	        
	    	
	    	 driver.findElement(By.xpath("//input[@formcontrolname='source']")).sendKeys("/home/ads-test/TEST_DATA/BLOB DATA_NEW/DATA/DBO");
	    
	    
	    	//
	
	    }
	    

	    @Then("^user enter source path to ingest data and click ingest$")
	    public void user_enter_source_path_to_ingest_data_and_click_ingest() throws Throwable {
	    	
	    	//USED JS EXECUTER
	    	
	    	//  Thread.sleep(2000);
		    	//Robot ro = new Robot();
		    	//ro.keyPress(KeyEvent.VK_O);
		    	//ro.keyRelease(KeyEvent.VK_);
	    	
	    	
	    	
	    	/*exe = (JavascriptExecutor) driver;
	    	  WebElement pass =driver.findElement(By.xpath("//input[@formcontrolname='source']"));
	    	 
	    	  exe.executeScript("arguments[0].value='/home/ubuntu/DATA/BLOB_DATA/DBO'",pass);
	    	  //Actions nu = new Actions(driver);
		    	//nu.moveToElement(pass) .click().build().perform();*/
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  Thread.sleep(2000);
	    	
		    	 
		    	//rob.keyPress(KeyEvent.VK_O);
		    	//rob.keyRelease(KeyEvent.VK_O);
		    	//Thread.sleep(2000);
		    	//driver.findElement(By.xpath("//span[contains(text(),'Ingest')]")).click();
		    	/*Duration du = Duration.ofMinutes(20);
		    	By by = By.xpath("//tbody/tr[1]/td[5]/mat-chip-list[1]/div[1]/mat-chip[1]");
		    	WebDriverWait wait = new WebDriverWait(driver, du);
		    	Boolean until = wait.until(ExpectedConditions.l(by, " Succeeded "));*/
		    	
		    	//driver.manage().timeouts().implicitlyWait(20,TimeUnit.MINUTES);
		    	
		    	//driver.findElement(By.xpath("//mat-icon[contains(text(),'laptop_chromebook')]")).click();
	    	
	    	
	    }

	  

}
