package com.TestRunner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Configuration.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\archon\\feature\\Advancedsearch.feature"
,glue = "com.AdvancedSearch",tags="@smoke1", plugin= {"pretty","html:target/myreports.html"}
)
public class Advancedsearchtestrunner {
	public static WebDriver driver;
	@BeforeClass
	public  static void sample() throws InterruptedException {
		driver=BaseClass.launch("chrome");

}

}
