package org.example.pages;

import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class login_page_locs
{
    public static WebElement enter_Email()
    {
        WebElement enter_Email= hooks.driver.findElement(By.id("Email"));
        return enter_Email;
    }
    public static WebElement enter_password()
    {
        WebElement enter_password= hooks.driver.findElement(By.id("Password"));
        return enter_password;
    }
    public static WebElement click_login()
    {
        WebElement click_login= hooks.driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
        return click_login;
    }
    public static WebElement logged_in()
    {
        WebElement logged_in= hooks.driver.findElement(By.xpath("//a[@class=\"ico-account\"]"));
        return logged_in;
    }
    public static WebElement cannot_log()
    {
        WebElement cannot_log= hooks.driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]"));
        return cannot_log;
    }
}
