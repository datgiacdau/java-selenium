/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.java.selenuim;

import static com.datgiacdau.java.selenuim.Init.driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author DELL
 */
public class HandleRadio extends Init {
    public static void main(String[] args) throws InterruptedException {
        Setup();
        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        
        WebElement radio_male = driver.findElement(By.xpath("//label[normalize-space()=\"Male\"]//input[@name=\"optradio\"]"));
        if(radio_male.isSelected() == true){
            System.out.println("da dc chon");
        }else{
            radio_male.click();
            System.out.println("click r nen da chon");
        }
        Thread.sleep(1000);
        WebElement radio_female = driver.findElement(By.xpath("//label[normalize-space()=\"Female\"]//input[@name=\"optradio\"]"));
        if(radio_female.isSelected() == true){
            System.out.println("sai r");
        }else{
            System.out.println("dung r");
        }
        //nhieu radio button
        WebElement radio0_5 = driver.findElement(By.xpath("//input[@value=\"0 - 5\"]"));
        radio0_5.click();
        WebElement btn_getvalue = driver.findElement(By.xpath("//button[normalize-space()=\"Get values\"]"));
        btn_getvalue.click();
        WebElement text_value = driver.findElement(By.xpath("//p[@class=\"groupradiobutton\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",text_value );
        if(text_value.getText().contains("Age group: 0 - 5")){
            System.out.println("da chon tuoi 0-5");
        }else{
            System.out.println("chua chon r");
        }
            
        ShutDown();
    }
}
