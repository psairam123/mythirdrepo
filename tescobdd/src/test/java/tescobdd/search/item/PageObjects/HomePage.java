package tescobdd.search.item.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import tescobdd.search.item.Drivers.DriverFactory;
import tescobdd.search.item.Hooks;

public class HomePage extends DriverFactory
{
    public void doSearch(String product)
    {
        WebElement SearchBox=driver.findElement(By.xpath(".//*[@id='content']/div/div[5]/div[2]/form/div/input[1]" ));
        SearchBox.sendKeys(product);
        SearchBox.sendKeys(Keys.ENTER);
        sleep(3000);
    }



}
