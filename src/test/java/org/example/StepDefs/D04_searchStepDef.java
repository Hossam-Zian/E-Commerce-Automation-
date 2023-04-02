package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Examples;
import org.example.pages.product_page_locs;
import org.example.pages.home_page_locs;
import org.example.pages.product_page_locs;
import org.example.pages.search_page_locs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class D04_searchStepDef
{
@When("user searches with {string}")
    public static void search(String search_word) throws InterruptedException {
    home_page_locs.search_bar().sendKeys(search_word);
Thread.sleep(500);
home_page_locs.search_button().click();
}



    @Then("search shows relevant results for{string}")
    public static void searchShowsRelevantResults(String search_word)
    {
     boolean URL =hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q=");
     hooks.soft.assertTrue(URL);
        List<WebElement> product= search_page_locs.product();
        for (int i=0 ;i<product.size();i++)
        {
            boolean product_name =product.get(i).getText().toLowerCase().contains(search_word);
            System.out.println(product_name);
            //hard assertion could be applied also as required
           //Assert.assertTrue(currency);
          hooks.soft.assertTrue(product_name);
    }
        int No_of_products=product.size();
        System.out.println("number of relevant products"+No_of_products);
        hooks.soft.assertAll();
}
    @When("user searches with product {string}")
    public static void userSearchesWith(String SKU) throws InterruptedException
    {
        home_page_locs.search_bar().sendKeys(SKU);
        Thread.sleep(500);
        home_page_locs.search_button().click();
        Thread.sleep(3000);
    }

    @Then("search shows requested product {string}")
    public static void searchShowsRequestedProduct(String SKU)
    {
//hooks.wait.until(ExpectedConditions.visibilityOf(search_page_locs.product_selection()));
        search_page_locs.product_selection().click();
        hooks.driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Boolean Sku = product_page_locs.product_SKU().getText().contains(SKU);
        hooks.soft.assertTrue(Sku);
        hooks.soft.assertAll();
    }

}
