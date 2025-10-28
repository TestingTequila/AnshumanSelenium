package com.janbask;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {
    public static void main(String[] args) {
        //1. .get(String Url)

        WebDriver driver = new ChromeDriver();
        driver.get("http://janbaskdemo.com/");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        System.out.println(driver.getTitle());
        String currentPageUrl = driver.getCurrentUrl();
        System.out.println("currentPageUrl: " + currentPageUrl);

        driver.manage().window().maximize();
        driver.close();
        driver.quit();

    }
}
