/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.testcases;

/**
 *
 * @author DELL
 */
import com.datgiacdau.pages.SignInPage;
import com.datgiacdau.pages.SignInPageFactory;
import com.datgiacdau.base.BaseSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SignlnTest extends BaseSetup{
    private WebDriver driver;
    public SignInPage signInPage;
    public SignInPageFactory signInPageFactory;
    
    @BeforeClass
    public void setUp(){
        driver = getDriver();
    }
    
    //Pom 
//    @Test
//    public void signIn(){
//        System.out.println(driver);
//        driver.get("https://crm.anhtester.com/admin/authentication");
//        signInPage = new SignInPage(driver);
//        signInPage.signin("admin@example.com", "123456");
//    }
    
    //Page Factory Pom
    @Test
    public void signIn2() throws Exception{
        driver.get("https://crm.anhtester.com/admin/authentication");
        signInPageFactory = new SignInPageFactory(driver);
        signInPageFactory.signin("admin@example.com", "123456");
    }
}
