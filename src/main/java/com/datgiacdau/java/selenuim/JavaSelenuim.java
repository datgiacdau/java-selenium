/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.datgiacdau.java.selenuim;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author DELL
 */
public class JavaSelenuim {

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        WebDriver myBrowser;
        myBrowser = new ChromeDriver(opt);
        myBrowser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myBrowser.manage().window().maximize();

        String userName = "mngr510990";
        String pass = "EtYbujY";
        myBrowser.get("https://demo.guru99.com/v4/");
        
        //tìm thẻ user và pass qua css seclector, name , jquery,... tùy
        //là 1 dạng câu sql áp dụng cho html/css
        //đưa câu query này cho myBrowser để tìm
        //nếu tìm thấy thẻ thì đó là  1 object đc trả về thuộc class WebElement
        WebElement userTag = myBrowser.findElement(By.xpath("(//input[@name='uid'])[1]"));
        userTag.sendKeys(userName); //gõ vào text nếu thấy
        WebElement passTag = myBrowser.findElement(By.cssSelector("input[name=\"password\"]"));
        passTag.sendKeys(pass);
        WebElement loginTag = myBrowser.findElement(By.xpath("(//input[@name='btnLogin'])[1]"));
        loginTag.click();
        
        //Thread.sleep(3000); //cần chờ chuyển trang do mạng hoặc front end
                                   // cần đợi để ra trang mới vì nó đag ở trang cũ
                                   //còn trang mới chưa kịp lên nên cần wait
        
//        WebElement helloTag = myBrowser.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
//        
//        String actualHelloMsg = helloTag.getText();
//        System.out.println(actualHelloMsg);
//        boolean status = helloTag.isDisplayed();
//        if(status == true){
//            System.out.println("co roi");
//        }        
        boolean nut = myBrowser.findElement(By.xpath("//a[normalize-space()=\"New Customer\"]")).isEnabled();
        if(nut == true){
            myBrowser.findElement(By.xpath("//a[normalize-space()=\"New Customer\"]")).click();
            System.out.println("an duoc");
            
        } else{
            System.out.println("ko dc");
        }
        WebElement statusSelect = myBrowser.findElement(By.xpath("//input[@value=\"f\"]"));
        if(statusSelect.isSelected() == true){
            System.out.println("dang chon");
        } else{
            statusSelect.click();
        }
        List<WebElement> statusCus = myBrowser.findElements(By.xpath("//input"));
//        for (int i = 0; i < statusCus.size(); i++) {
//            System.out.println(statusCus.get(i).getText());
//        }
        System.out.println(statusCus.size());
        
        
       
              
        Thread.sleep(3000);
        myBrowser.quit();

        
    }
}
