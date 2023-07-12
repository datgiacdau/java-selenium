/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.java.selenuim;

import java.awt.RenderingHints;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


/**
 *
 * @author DELL
 */
public class HandleDynamic extends Init {
    public static void main(String[] args) throws InterruptedException {
        Setup();
        driver.navigate().to("https://www.traveloka.com/vi-vn/flight?id=6880263542045238318&adloc=vi-vn&kw=6880263542045238318_%C4%91%E1%BA%B7t%20v%C3%A9%20m%C3%A1y%20bay&gmt=e&gn=g&gd=c&gdm=&gcid=483001571010&gdp=&gdt=&gap=&pc=0&cp=6880263542045238318_GEN-LOC-D-s_6880263542045238318_TK&aid=21921756021&wid=aud-270657531288:kwd-12787613462&fid=&gid=9074079&utm_id=Ul2A1ddD&ad_id=483001571010&target_id=aud-270657531288:kwd-12787613462&click_id=CjwKCAjw44mlBhAQEiwAqP3eVgbN7gD-LfeHWJDqKZ_toBFvBvPZL0LAJavi9i930xQE32t3RdTOTBoCKz0QAvD_BwE&group_id=21921756021&gclid=CjwKCAjw44mlBhAQEiwAqP3eVgbN7gD-LfeHWJDqKZ_toBFvBvPZL0LAJavi9i930xQE32t3RdTOTBoCKz0QAvD_BwE");
        WebElement  elementCountry = driver.findElement(By.xpath("//input[@value=\"Tokyo (TYOA)\"]"));
        elementCountry.click();
        Thread.sleep(1000);
        WebElement  inputelementCountry = driver.findElement(By.xpath("//input[@value=\"Tokyo (TYOA)\"]"));
        inputelementCountry.sendKeys("Hanoi");
        Thread.sleep(1000);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();
        
        ShutDown();
    }
}
