package com.tmb.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static WebDriver driver;
	ChromeOptions co= new ChromeOptions();
	
	public WebDriver getdriver(){
		WebDriverManager.chromedriver().setup();
		co.addArguments("--remote-origin-policy=.*");
		driver =new ChromeDriver(co);
		driver.get("https://www.google.co.in");
		return driver;
		
		
	}
}
