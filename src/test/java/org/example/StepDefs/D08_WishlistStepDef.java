package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home_page_locs;
import org.example.pages.product_page_locs;
import org.example.pages.search_page_locs;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import javax.xml.ws.WebEndpoint;

public class D08_WishlistStepDef {
    @When("user add product to wishlist")
    public static void user_add_product() throws InterruptedException {
        for (int i = 0; i < search_page_locs.product().size();i++)
        {
if (search_page_locs.product().get(i).getText().contains("HTC"))
{
    home_page_locs.wish_list().get(i).click();
}
        }
        Thread.sleep(2000);
    }

    @Then("product added and success message appear")
    public void productAddedAndSucessMessageAppear()
    {
        hooks.soft.assertTrue(home_page_locs.product_added_message().isDisplayed());
        hooks.soft.assertTrue(home_page_locs.product_added_message().getText().contains("The product has been added to your wishlist"));
         String clr_rgb= hooks.driver.findElement(By.cssSelector("[class=\"bar-notification success\"]")).getCssValue("background-color");
         String clr_hex= Color.fromString(clr_rgb).asHex();
        System.out.println(clr_rgb);
        hooks.soft.assertEquals(clr_hex,"#4bb07a");
        hooks.soft.assertAll();
    }

    @And("product added and message disappear")
    public void messageDisappear()
    {
        hooks.soft.assertTrue(home_page_locs.product_added_message().isDisplayed());
        hooks.soft.assertTrue(home_page_locs.product_added_message().getText().contains("The product has been added to your wishlist"));
        hooks.wait.until(ExpectedConditions.invisibilityOf(home_page_locs.product_added_message()));
    }

    @And("user move to wishlist page")
    public void userMoveToWishlistPage() throws InterruptedException {
       // Thread.sleep(5000);
     home_page_locs.wish_list_page().click();
    }

    @Then("user finds the product at wishlist basket")
    public void userFindsTheProductAtWishlistBasket() throws InterruptedException {
        Thread.sleep(2000);
        int QTY= Integer.parseInt(product_page_locs.QTY_value().getAttribute("value"));
        System.out.println(QTY);
        boolean cond=false;
        if(QTY>0){
            cond= true;}
        hooks.soft.assertTrue(cond);
        hooks.soft.assertAll();


}}