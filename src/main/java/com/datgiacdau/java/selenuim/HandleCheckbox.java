/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datgiacdau.java.selenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

/**
 *
 * @author DELL
 */

public class HandleCheckbox extends Init {
    
    public static void main(String[] args) throws InterruptedException {
        Setup();
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");        
        Thread.sleep(2000);
        
        Boolean check = driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]")).isSelected(); 
        if(check == false){
            System.out.println("chua kick");
            driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]")).click();            
        }else{
            System.out.println("dc kick");
        }
        Thread.sleep(2000);
        
        Boolean mes = driver.findElement(By.xpath("//div[@id=\"txtAge\"]")).isDisplayed();
        if(mes == true){
            System.out.println("hien r");
            System.out.println(driver.findElement(By.xpath("//div[@id=\"txtAge\"]")).getText());
        }else{
            System.out.println("chua hien");
        }
        
        //check nhieu cai mot luc
        WebElement checkall= driver.findElement(By.xpath("//input[@id=\"check1\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkall);
        Thread.sleep(500);
        if( checkall.getAttribute("value").equals("Check All")){
            checkall.click();
        }else{
            System.out.println("ckeck all ko co");
        }
        Thread.sleep(1000);
        //cach 1
//        WebElement check1 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/label[1]/input[1]"));
//        WebElement check2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[2]/label[1]/input[1]"));
//        WebElement check3 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/label[1]/input[1]"));
//        WebElement check4 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[4]/label[1]/input[1]"));
//        if(check1.isSelected() == true && check2.isSelected() == true && check3.isSelected() == true && check4.isSelected() == true ){
//            System.out.println("da dc chon het");
//        }else{
//            System.out.println("check 1 ko dc chon");
//        }

        //cach2
        var listcheckbox = driver.findElements(By.xpath("//body/div[@id=\"easycont\"]/div[@class=\"row\"]/div[@class=\"col-md-6 text-left\"]/div[2]/div[2]/div[@class='checkbox']"));
        System.out.println(listcheckbox.size());
        for (int i = 1; i <= listcheckbox.size() ; i++) {
            WebElement boxCheck = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div["+ i +"]/label[1]/input[1]"));
            if (boxCheck.isSelected()==true){
                System.out.println("check box thu" +i+ "da dc chon");
            }else{
                System.out.println("chua dc chon het");
            }
            
        }
        // kieem tra da thanh un check all chua
        WebElement uncheckall= driver.findElement(By.xpath("//input[@id=\"check1\"]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", uncheckall);
        Thread.sleep(1000);
        if( uncheckall.getAttribute("value").equals("Uncheck All")){
            System.out.println("da thanh uncheck all");
        }else{
            System.out.println("sai r");
        }
        
        ShutDown();
    }
    
}
