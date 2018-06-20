package tescobdd.search.item.step_def;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import tescobdd.search.item.PageObjects.HomePage;
import tescobdd.search.item.PageObjects.ResultsPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Every.everyItem;

public class SearchStepsDef
{
    HomePage homepage=new HomePage();
    ResultsPage resultsPage=new ResultsPage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        //throw new PendingException();
    }

    @When("^I search for a product \"([^\"]*)\"$")
    public void i_search_for_a_product(String product) throws Throwable {
        homepage.doSearch(product);
        //throw new PendingException();
    }

    @Then("^I should see results search by \"([^\"]*)\"$")
    public void i_should_see_results_search_by(String product) throws Throwable {
        List<WebElement> actual=resultsPage.getAllResults(product);
        assertThat(actual,hasSize(24));



    }

}
