package pomReuseTestNg;

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

    @Test
    public void login()
    {
        System.out.println("@Test: This is dummy login code.....");
    }

    @Test
    public void register()
    {
        System.out.println("@Test: This is dummy register code.....");
    }

    @AfterMethod
    public  void closeBrowser()
    {
        System.out.println("@AfterMethod: This is dummy code for closing the browser....");
    }
}
