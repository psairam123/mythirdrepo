package tescobdd.search.item.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import tescobdd.search.item.Drivers.DriverFactory;

import java.util.ArrayList;
import java.util.List;

public class ResultsPage extends DriverFactory
{

    public List<WebElement> getAllResults(String product)
    {
        List<String> collecteditems=new ArrayList<>();
        List<WebElement> results=driver.findElements(By.cssSelector(".product-list--list-item"));
        System.out.println(results.size());
        for(WebElement title:results) {
            String titles= title.getText();
            System.out.println(title);
            collecteditems.add(titles);

        }


        return results ;
    }

}
