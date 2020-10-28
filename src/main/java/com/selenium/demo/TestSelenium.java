package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSelenium {

    public WebDriver driver;

    @BeforeMethod
    public void open() {
        //设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)/Google/Chrome/Application/chromedriver.exe");
        //实例化chromedriver
        driver = new ChromeDriver();
        //设置geckodriver路径
//        System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
        //实例化firefoxdriver
//        driver = new FirefoxDriver();
        //浏览器最大化
        driver.manage().window().maximize();
    }

    @Test
    public void getTest() throws InterruptedException {
        //打开百度首页
        driver.get("http://www.baidu.com");
        //等待2s
        Thread.sleep(2000);
        //找到id为 kw的元素
        WebElement element = driver.findElement(By.id("kw"));
        //输入selenium
        element.sendKeys("xymb.xyz");
        //点击按钮
        driver.findElement(By.id("su")).click();
        //等待5s
        Thread.sleep(5000);
    }

    @AfterMethod
    public void close(){
        //关闭浏览器
        driver.quit();
    }

}