package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.main_page_locs;
import org.example.pages.register_page_locs;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;


public class D01_registerStepDef
{

@Given("user go to register page")
public static void register_page()
{
main_page_locs.register_page().click();
}
@When("user select gender type")
public static void Gender_selction() throws InterruptedException {
    Thread.sleep(1000);
    register_page_locs.Gender_selection().click();
}
@And("user enter first name and last name")
public static void enter_user_name() throws InterruptedException {
register_page_locs.first_name().sendKeys("automation");
    Thread.sleep(500);
register_page_locs.last_name().sendKeys("tester");
    Thread.sleep(500);
}
    @And("user enter date of birth")
    public static void user_enter_data_of_birth() throws InterruptedException
    {
        Select sel_day=new Select(register_page_locs.day());
        sel_day.selectByVisibleText("5");
        Thread.sleep(500);
        Select sel_month =new Select(register_page_locs.month());
        sel_month.selectByVisibleText("September");
        Thread.sleep(500);
        Select sel_year =new Select(register_page_locs.year());
        sel_year.selectByVisibleText("1995");
        Thread.sleep(500);
}
@And("user enter email field")
public static void user_enter_email() throws InterruptedException
{
register_page_locs.email().sendKeys("testt@example.com");
}
    @And("user fills Password fields")
    public static void user_enter_passwords() throws InterruptedException
    {
        register_page_locs.Password().sendKeys("P@ssw0rd");
        register_page_locs.ConfirmPassword().sendKeys("P@ssw0rd");
        Thread.sleep(500);
    }
    @And("user clicks on register button")
    public static void user_click_register_button() throws InterruptedException
    {
        register_page_locs.register_button().click();
        Thread.sleep(500);
    }
    @Then("success message is displayed")
    public static void user_registered() throws InterruptedException
    {
      boolean cond=register_page_locs.register_success().isDisplayed();
        String clr_rgb= register_page_locs.register_success().getCssValue("color");
         String clr_hex= Color.fromString(clr_rgb).asHex();
        hooks.soft.assertEquals(clr_rgb,"rgba(76, 177, 124, 1)");
    hooks.soft.assertAll();
    }

}













