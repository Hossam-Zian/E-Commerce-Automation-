package org.example.pages;

import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class search_page_locs {
    public static List<WebElement> product() {
        List<WebElement> product = hooks.driver.findElements(By.cssSelector("[class=\"product-title\"]"));
        return product;
    }

    public static WebElement product_selection() {
        WebElement product_selection = hooks.driver.findElement(By.xpath("//img[starts-with(@alt,'Picture of')]"));
        return product_selection;
    }

    public static WebElement product_title() {
        WebElement product_title = hooks.driver.findElement(By.cssSelector("div[class=\"page category-page\"]>div>h1"));
        return product_title;
    }
}