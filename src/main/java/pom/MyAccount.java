package pom;

import datarepo.TCLevelData;
import org.openqa.selenium.WebDriver;

public class MyAccount
{
    WebDriver driver;
    public MyAccount(WebDriver driver)
    {
        this.driver = driver;
    }
    public void validateLoginStatus()
    {
        String pageTitle = driver.getTitle();
        if (pageTitle.equals(TCLevelData.EXPECTED_PAGE_TITLE)) {
            System.out.println(TCLevelData.LOGIN_SUCCESS_MSG);
        } else {
            System.out.println(TCLevelData.LOGIN_FAILURE_MSG);
        }
    }
}
