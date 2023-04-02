package org.example.StepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home_page_locs;
import org.example.pages.register_page_locs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef
{

@When("Select Euro currency from the dropdown list on the top left of home page")
    public static void select_currency() throws InterruptedException {
    Select sel_day=new Select(home_page_locs.currency_switch());
    Thread.sleep(300);
    sel_day.selectByVisibleText("Euro");
    Thread.sleep(500);
}
@Then("verify that currency switched")
public static void currency_changed() throws InterruptedException
{

    //List <WebElement> price=hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
    List<WebElement> price = home_page_locs.price();
    for (int i=0 ;i<price.size();i++)
    {
        boolean currency =price.get(i).getText().contains("€");
        //hard assertion could be applied also as required
        //Assert.assertTrue(currency);
        hooks.soft.assertTrue(currency);
        hooks.soft.assertAll();
    }
    }

    @Given("user at home page")
    public static void userAtHomePage()
    {
     boolean logo= home_page_locs.logo().isDisplayed();
     Assert.assertTrue(logo);
    }
}

