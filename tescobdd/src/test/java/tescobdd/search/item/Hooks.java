package tescobdd.search.item;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.Ignore;
import tescobdd.search.item.Drivers.DriverFactory;

public class Hooks
{
    DriverFactory driverfactory=new DriverFactory();

    @Before
    public void setUp()
    {
        driverfactory.openBrowser();
        driverfactory.navigate("https://www.tesco.com/");
        //driverfactory.maxWindow();
        driverfactory.applyImpWait();
        driverfactory.deleteCookies();

    }
    @Ignore
    public void tearDown()
    {
        driverfactory.closeBrowser();
    }
}
