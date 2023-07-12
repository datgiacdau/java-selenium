/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.java.selenuim;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author DELL
 */
public class HandleDropdown extends Init {
    public static void main(String[] args) throws InterruptedException {
        Setup();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        //handle dropdown tinh
        WebElement element = driver.findElement(By.xpath("//select[@id=\"select-demo\"]"));
        Select selectSimple = new Select(element);
        
        //neu lay theo index vi tri bat dau tu 0
        selectSimple.selectByIndex(1);
        Thread.sleep(1000);
        selectSimple.selectByVisibleText("Saturday");
        System.out.println("thu 7");
        Thread.sleep(1000);
        selectSimple.selectByValue("Thursday");
        System.out.println("thu 5");
        
        if(selectSimple.isMultiple() == true){
            System.out.println("la dang multi");
        }else{
            System.out.println("ko phai multi");
        }
        //so luong option
        System.out.println(selectSimple.getOptions().size());
        System.out.println(selectSimple.getFirstSelectedOption().getText());
        if(selectSimple.getFirstSelectedOption().getText().equals("Thursday")){
            System.out.println("dung");
        }else{
            System.out.println("sai");
        }
        List<WebElement> getAllOption = selectSimple.getOptions();
        for (int i = 0; i < getAllOption.size(); i++) {
            System.out.println(getAllOption.get(i).getText());
        }
        
        ShutDown();
    }
}
