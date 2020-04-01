package com.cts.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

public static WebDriver driver;
	
	public static void launch(String browser) {
		if(browser.equals("ch")) {
			System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.setProperty("webdriver.ie.driver", "src\\test\\resources\\drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.kohls.com/");
	}	
}
