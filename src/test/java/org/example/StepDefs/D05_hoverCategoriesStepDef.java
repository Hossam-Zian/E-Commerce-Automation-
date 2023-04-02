package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home_page_locs;
import org.example.pages.search_page_locs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Random;

public class D05_hoverCategoriesStepDef
{
    Random random = new Random();
    int result =random.nextInt(3);
    String sub;
    @Given("there are 3 main categories contains sub-categories")
    public static void sub_cateogry() throws InterruptedException {
        Thread.sleep(1000);
        //int count=0;
       //for(int i=0;i<home_page_locs.category().size();i++);
    }

    @When("user hoover random one of the three main categories")
    public void userSelectRandomOneOfTheThreeMainCategories() throws InterruptedException {

     hooks.act.moveToElement(home_page_locs.category().get(result)).perform();
     Thread.sleep(2000);
    }
    @And("user select & open random one of the three sub categories")
    public void userSelectOpenRandomOneOfTheThreeSubCategories() throws InterruptedException
    {
       sub =home_page_locs.sub_category().get(result).getText().trim();
        home_page_locs.sub_category().get(result).click();
        Thread.sleep(3000);

    }

    @Then("user should see sub-category title he selected randomly")
    public void userShouldSeeSubCategoryTitleHeSelectedRandomly()
    {
        String title= search_page_locs.product_title().getText();
        System.out.println(title);
        boolean cond = sub.contains(title);
        hooks.soft.assertTrue(cond);
    }


}
