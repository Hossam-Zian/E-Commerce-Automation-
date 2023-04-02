package org.example.StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.main_page_locs;
import org.example.pages.login_page_locs;
import org.example.pages.register_page_locs;
import org.openqa.selenium.support.Color;

public class D02_loginStepDef {
    @Given("user go to login page")
    public static void login_page() {
        main_page_locs.login_page().click();
    }

    @When("user login with valid {string} and {string}")
    public void enter_valid_user_and_password(String username,String password) {
        login_page_locs.enter_Email().sendKeys(username);
        login_page_locs.enter_password().sendKeys(password);
    }


    @And("user press on login button")
    public static void click_login() {
        login_page_locs.click_login().click();
    }

    @Then("user login to the system successfully")
    public static void user_loggedin() throws InterruptedException {
      String URL=hooks.driver.getCurrentUrl();
      hooks.soft.assertEquals(URL,"https://demo.nopcommerce.com/");
      boolean cond = login_page_locs.logged_in().isDisplayed();
      hooks.soft.assertTrue(cond);
      hooks.soft.assertAll();
    }

    @When("user login with invalid {string} and {string}")
    public void enter_invalid_user_and_password(String username,String password) {
        login_page_locs.enter_Email().sendKeys(username);
        login_page_locs.enter_password().sendKeys(password);

    }

    @Then("user couldn't login to the system successfully")
    public static void user_cannot_log() throws InterruptedException {
        boolean cond = login_page_locs.cannot_log().getText().contains("Login was unsuccessful");
        String clr_rgb= login_page_locs.cannot_log().getCssValue("color");
        String clr_hex= Color.fromString(clr_rgb).asHex();
        hooks.soft.assertEquals(clr_hex,"#e4434b");
        hooks.soft.assertTrue(cond);
        hooks.soft.assertAll();

    }


}
