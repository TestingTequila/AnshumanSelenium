package pom;

import datarepo.AppLevel;
import datarepo.TCLevelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Login_pom {
    public static void main(String[] args) {

        //1- Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser(AppLevel.BROWSER_NAME);
        //2- Enter the url
        driver.get(AppLevel.APP_URL);
        //3- Click on My Account icon
        MyStore ms = new MyStore(driver);
        ms.clickOnMyAccountIcon();
        //4- Click on login Link
        ms.clickOnLoginLink();
        //5- Enter correct email
        AccountLogin al = new AccountLogin(driver);
        al.enterEmail();
        //6- Enter correct password
        al.enterPassword();
        //7- Click on Login button
        al.clickOnLoginButton();
        //8- Validate Login Status
        MyAccount ma = new MyAccount(driver);
        ma.validateLoginStatus();
        //9- Close the browser
        driver.close();

    }
}
