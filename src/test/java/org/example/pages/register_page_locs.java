package org.example.pages;

import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class register_page_locs
{
public static WebElement Gender_selection()
{
WebElement gender_selection= hooks.driver.findElement(By.xpath("//label[@for=\"gender-male\"]"));
return gender_selection;
}

    public static WebElement first_name()
    {
        WebElement FirstName= hooks.driver.findElement(By.id("FirstName"));
        return FirstName;
    }
    public static WebElement last_name()
    {
        WebElement LastName= hooks.driver.findElement(By.id("LastName"));
        return LastName;
    }
    public static WebElement day()
    {
        WebElement day= hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]"));
        return day;
    }
    public static WebElement month()
    {
        WebElement month= hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]"));
        return month;
    }
    public static WebElement year()
    {
        WebElement year= hooks.driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]"));
        return year;
    }
    public static WebElement email()
    {
        WebElement email= hooks.driver.findElement(By.id("Email"));
        return email;
    }
    public static WebElement Password()
    {
        WebElement Password= hooks.driver.findElement(By.id("Password"));
        return Password;
    }
    public static WebElement ConfirmPassword()
    {
        WebElement ConfirmPassword= hooks.driver.findElement(By.id("ConfirmPassword"));
        return ConfirmPassword;
    }
    public static WebElement register_button()
    {
        WebElement register_button= hooks.driver.findElement(By.id("register-button"));
        return register_button;
    }
    public static WebElement register_success()
    {
        WebElement register= hooks.driver.findElement(By.xpath("//div[@class=\"result\"]"));
        return register;
    }

}
