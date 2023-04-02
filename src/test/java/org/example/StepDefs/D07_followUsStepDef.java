package org.example.StepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.home_page_locs;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef
{
    //String parent=hooks.driver.getWindowHandle();

    ArrayList<String> tabs = new ArrayList<>(hooks.driver.getWindowHandles());
    @When("user clicks on facebook Follow us")
    public  void user_clicks_on_facebook_button() throws InterruptedException {

      home_page_locs.facebook().click();
    }
    @When("user clicks on twitter Follow us")
    public void userClicksOnTwitterFollowUs()
    {
        home_page_locs.twitter().click();
    }
    @When("user clicks on rss Follow us")
    public void userClicksOnRssFollowUs()
    {
        home_page_locs.rss().click();
    }
    @When("user clicks on youtube Follow us")
    public void userClicksOnYoutubeFollowUs()
    {
        home_page_locs.youtube().click();
    }
    @Then("user switch  to {string} page")
    public void userSwitchToFacebookPage(String follow_us) throws InterruptedException
    {
        Thread.sleep(2000);
        ArrayList<String> tabs = new ArrayList<String>(hooks.driver.getWindowHandles());
        hooks.driver.switchTo().window(tabs.get(1));
        String url= hooks.driver.getCurrentUrl();
        hooks.driver.close();
        Assert.assertEquals(url,follow_us);
    }
}
