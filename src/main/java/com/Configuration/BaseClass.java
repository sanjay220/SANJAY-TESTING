package com.Configuration;










import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class BaseClass {
public static WebDriver driver;

	
	
	public static WebDriver launch(String browser) throws InterruptedException {
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\ArchonLWS\\driver\\chromedriver.exe");
			driver=new ChromeDriver(options);
			//driver.get("http://192.168.1.188:4081/login");
			driver.get("http://192.168.1.188:4081/applications");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
		/*	driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("sysadmin");
			Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("sysadmin");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"app\"]/app-login/div/mat-card/div/button/span[1]")).click();*/
			
			//driver.get("https://www.youtube.com/");
		}
		else {
			System.out.println("INVALID BROWSER");
		}

		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		//DesiredCapabilities cap=new DesiredCapabilities();
		//cap.setCapability(ChromeOptions.CAPABILITY, options);
		//options.merge(cap);			
		//driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
				
		return driver;
}
	
	public static void login() throws InterruptedException {
		 driver.findElement(By.xpath("//*[@id=\"mat-input-0\"]")).sendKeys("sysadmin");
			Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"mat-input-1\"]")).sendKeys("sysadmin");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//*[@id=\"app\"]/app-login/div/mat-card/div/button/span[1]")).click();
			
	}

}
	
	

	
	
		
	
	