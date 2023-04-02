package org.example.pages;

import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class main_page_locs
{
public static WebElement register_page()
{
WebElement register_page_locator= hooks.driver.findElement(By.className("ico-register"));
return register_page_locator;
}
    public static WebElement login_page()
    {
        WebElement login_page_locator= hooks.driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
        return login_page_locator;
    }

}
