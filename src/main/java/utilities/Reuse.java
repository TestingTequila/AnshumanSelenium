package utilities;

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
}
