package pomReuseTestNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_Concept
{
    @BeforeClass
    public  void connectToDb()
    {
        System.out.println("@BeforeClass: This is dummy code for connecting to DB...");
    }
    @BeforeMethod
    public  void openBrowserAndEnterUrl()
    {
        System.out.println("@BeforeMethod: This is dummy code for opening browser and entering url...");
    }

    @Test(priority = 2, dependsOnMethods = "register", alwaysRun = true, groups = "smoke")
    public void login()
    {
        System.out.println("@Test: This is dummy login code.....");
    }

    @Test(priority = 1, groups = "smoke")
    public void register()
    {
        System.out.println("@Test: This is dummy register code.....");
        Assert.fail();
    }

    @Test(priority = 4, invocationCount = 10)
    public void contactUs()
    {
        System.out.println("@Test: This is dummy contactUs code.....");
    }

    @Test(priority = 5, enabled = false, alwaysRun = true)
    public void customerService()
    {
        System.out.println("@Test: This is dummy customerService code.....");
    }

    @Test(priority = 3)
    public void product()
    {
        System.out.println("@Test: This is dummy product code.....");
    }

    @AfterMethod
    public  void closeBrowser()
    {
        System.out.println("@AfterMethod: This is dummy code for closing the browser....");
    }
}
