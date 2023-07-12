/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.pages;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 *
 * @author DELL
 */
public class SignInPage {

    WebDriver driver;

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    By username = By.id("email");
    By pass = By.id("password");
    By btnLogin = By.xpath("//button[@type=\"submit\"]");

    public void enterUsername(String username) {
        driver.findElement(this.username).sendKeys(username);
    }

    public void enterPass(String pass) {
        driver.findElement(this.pass).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(this.btnLogin).click();
    }
    
    public void signin(String username, String pass){
        enterUsername(username);
        enterPass(pass);
        clickLogin();
    }
}
