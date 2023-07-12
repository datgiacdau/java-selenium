/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.base;

import com.beust.jcommander.Parameters;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

/**
 *
 * @author DELL
 */
public class BaseSetup {
    WebDriver driver = null;
    	public WebDriver getDriver() {
		return driver;
	}
    
    @BeforeTest
    public void setup(){
        ChromeDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
    }
    @AfterTest
    public void shutdown() throws InterruptedException{
        Thread.sleep(1000);
        driver.quit();
    }
}
