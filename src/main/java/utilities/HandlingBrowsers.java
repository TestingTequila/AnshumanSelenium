package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class HandlingBrowsers {
    static WebDriver driver = new InternetExplorerDriver();

    public static WebDriver launchBrowser(String browserName) {
        switch (browserName) {
            case "Edge":
                driver = new EdgeDriver();
            case "Chrome":
                driver = new ChromeDriver();
            case "Firefox":
                driver = new FirefoxDriver();
            case "Safari":
                driver = new SafariDriver();
        }
        return driver;
    }
}
