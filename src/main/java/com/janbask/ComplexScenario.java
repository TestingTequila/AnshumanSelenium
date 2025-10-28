package com.janbask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ComplexScenario {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
        List<WebElement> menuItems= driver.findElements(By.xpath("//aside[@id='column-right']//a"));
        for(WebElement e : menuItems)
        {
              String elementText =e.getText();
              if(elementText.equals("Order History"))
              {
                  e.click();
              }
        }

    }
}
