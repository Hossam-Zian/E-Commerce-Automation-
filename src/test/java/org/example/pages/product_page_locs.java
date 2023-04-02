package org.example.pages;

import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class product_page_locs
{
    public static WebElement product_SKU()
    {
        WebElement product_SKU = hooks.driver.findElement(By.cssSelector("[class=\"sku\"]"));
        return product_SKU;
    }
    public static WebElement QTY_value()
    {
        WebElement QTY_value = hooks.driver.findElement(By.cssSelector("[class=\"qty-input\"]"));
        return QTY_value;
    }
}
