/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author DELL
 */
public class SignInPageFactory {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id=\"email\"]")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@id=\"password\"]")
    private WebElement passInput;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement btnLogin;

    // Khởi tạo class khi được gọi và truyền driver vào để các thành phần trong
    // Và khởi tạo initElements
    public SignInPageFactory(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        PageFactory.initElements(this.driver, this);
    }

    // Chúng ta viết hàm signin không cần dùng các hàm bổ trợ enter hay click nữa
    public void signin(String username, String password) throws Exception {
        setText(emailInput, username);//emailInput.sendKeys(username);
        setText(passInput, password);//passwordInput.sendKeys(password);
        clickElement(btnLogin);//signinBtn.click();
        Thread.sleep(1000);
    }

    private void setText(WebElement element, String valueText) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(valueText);
    }

    private void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
