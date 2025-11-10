package utilities;

import datarepo.TCLevelData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reuse
{
    WebDriver driver;

    public Reuse(WebDriver driver)
    {
        this.driver = driver;
    }

    public void doClick(By locator)
    {
        WebElement element= driver.findElement(locator);
        element.click();
    }

    public void doSendKeys(By locator, String text)
    {
        WebElement inputTextBox = driver.findElement(locator);
        inputTextBox.sendKeys(text);
    }

    public String doValidatePageTitle(String expectedPageTitle, String successMessage, String failureMessage)
    {
        String pageTitle = driver.getTitle();
        if (pageTitle.equals(expectedPageTitle)) {
            return successMessage;
        } else {
            return failureMessage;
        }
    }
}
