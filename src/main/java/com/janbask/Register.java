package com.janbask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import utilities.Reuse;

public class Register {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://janbaskdemo.com/index.php?route=account/register");
        Reuse reuse = new Reuse(driver);
        By countryDDL = By.id("input-country");
        reuse.doDDLSelectByValue(countryDDL, "99");

    }
}
