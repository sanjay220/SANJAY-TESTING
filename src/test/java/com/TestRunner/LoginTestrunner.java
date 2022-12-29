package com.TestRunner;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Configuration.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\archon\\feature\\Login.feature", 
glue = "com.StepDefinition",plugin= {"pretty","html:target/myreports.html"}
)
public class LoginTestrunner {
	/*public static WebDriver driver;
	@BeforeClass
	public  static void sample() throws InterruptedException {
		driver=BaseClass.launch("chrome");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
}*/
}




	
	
	

