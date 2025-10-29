package com.janbask;

import datarepo.AppLevel;
import datarepo.TCLevelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Login_3 {
    public static void main(String[] args) {

        //1- Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser(AppLevel.BROWSER_NAME);
        //2- Enter the url
        driver.get(AppLevel.APP_URL);
        //3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class='fa fa-user']"));
        myAccountIcon.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(AppLevel.WAIT_TIME));
        //4- Click on login Link
        WebElement loginLink = driver.findElement(By.xpath("//a[text()='Login']"));
        loginLink.click();
        //5- Enter correct email
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@id='input-email']"));
        emailTextBox.sendKeys(TCLevelData.EMAIL_ID);
        //6- Enter correct password
        WebElement passwordTextBox = driver.findElement(By.xpath("//input[@id='input-password']"));
        passwordTextBox.sendKeys(TCLevelData.PASSWORD);
        //7- Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        //8- Validate Login Status
        String pageTitle = driver.getTitle();
        if (pageTitle.equals(TCLevelData.EXPECTED_PAGE_TITLE)) {
            System.out.println(TCLevelData.LOGIN_SUCCESS_MSG);
        } else {
            System.out.println(TCLevelData.LOGIN_FAILURE_MSG);
        }
        //9- Close the browser
        driver.close();

    }
}
