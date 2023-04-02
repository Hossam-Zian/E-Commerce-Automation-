package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home_page_locs;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class D06_homeSlidersStepDef
{
@And("first slider is clickable")
    public void slider()
{
    boolean slider =home_page_locs.slider_1().isEnabled();
    hooks.soft.assertTrue(slider);
    hooks.soft.assertAll();
}

    @When("user select the first slider")
    public void userSelectTheFirstSlider() throws InterruptedException {
        home_page_locs.slider_1().click();
        Thread.sleep(3000);

    }
    @Then("page switched to product page")
    public void userMoveToAnotherPage()
    {
        hooks.soft.assertTrue( hooks.wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-14-pro")));
        String actual =hooks.driver.getCurrentUrl();
        hooks.soft.assertEquals(actual,"https://demo.nopcommerce.com/iphone-14-pro");
        hooks.soft.assertAll();
    }
    @And("second slider is clickable")
    public void slider2()
    {
        boolean slider =home_page_locs.slider_2().isEnabled();
        hooks.soft.assertTrue(slider);
        hooks.soft.assertAll();
    }
    @When("user select the second slider")
    public void userSelectTheseconedSlider() throws InterruptedException
    {
        home_page_locs.slider_1().click();
        Thread.sleep(3000);
    }


    @Then("page switched to 2nd product page")
    public void userMoveTo2ndproductPage()

    {
        hooks.soft.assertTrue( hooks.wait.until(ExpectedConditions.urlToBe("https://demo.nopcommerce.com/iphone-6")));
        String actual =hooks.driver.getCurrentUrl();
        hooks.soft.assertEquals(actual,"https://demo.nopcommerce.com/iphone-6");
        hooks.soft.assertAll();
    }

}
