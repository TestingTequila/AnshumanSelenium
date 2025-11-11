package pomReuseTestNg;

import datarepo.AppLevel;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login_pom {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        //1- Open the browser
        driver = utilities.HandlingBrowsers.launchBrowser(AppLevel.BROWSER_NAME);
        //2- Enter the url
        driver.get(AppLevel.APP_URL);
    }

    @Test
    public void login1() {
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
    }

    @Test
    public void login2() {
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
    }

    @AfterMethod
    public void tearDown() {
        //9- Close the browser
        driver.close();
    }


}
