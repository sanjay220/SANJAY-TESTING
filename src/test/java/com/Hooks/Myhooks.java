package com.Hooks;

import com.Configuration.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;



public class Myhooks extends BaseClass{
	@Before
	public void setup() throws InterruptedException {
		launch("chrome");
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown(Scenario sc) {
		System.out.println(sc.getStatus());
		driver.close();
	}

}
