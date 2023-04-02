package org.example.pages;


import org.example.StepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
public class home_page_locs {
    public static WebElement currency_switch() {
        WebElement currency = hooks.driver.findElement(By.id("customerCurrency"));
        return currency;
    }

    public static List<WebElement> price() {
        List<WebElement> price = hooks.driver.findElements(By.xpath("//span[@class=\"price actual-price\"]"));
        return price;
    }

    public static WebElement search_bar() {
        WebElement search_bar = hooks.driver.findElement(By.id("small-searchterms"));
        return search_bar;
    }

    public static WebElement logo() {
        WebElement logo = hooks.driver.findElement(By.cssSelector("[alt=\"nopCommerce demo store\"]"));
        return logo;
    }

    public static WebElement search_button() {
        WebElement search_button = hooks.driver.findElement(By.cssSelector("[class=\"button-1 search-box-button\"]"));
        return search_button;
    }

    public static List<WebElement> category() {
        List<WebElement> category = hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href]"));
        return category;
    }

    public static List<WebElement> sub_category() {
        List<WebElement> sub_category = hooks.driver.findElements(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]"));
        return sub_category;
    }


    public static WebElement slider_1() {
        WebElement slider1 = hooks.driver.findElement(By.cssSelector("[style=\"display: block;\"]"));
        return slider1;
    }

    public static WebElement slider_2() {
        WebElement slider2 = hooks.driver.findElement(By.cssSelector("[style=\"display: block;\"]"));
        return slider2;
    }

    public static WebElement facebook() {
        WebElement facebook = hooks.driver.findElement(By.cssSelector("[class=\"facebook\"]>a"));
        return facebook;
    }

    public static WebElement twitter() {
        WebElement twitter = hooks.driver.findElement(By.cssSelector("[class=\"twitter\"]>a"));
        return twitter;
    }

    public static WebElement rss() {
        WebElement rss = hooks.driver.findElement(By.cssSelector("[class=\"rss\"]>a"));
        return rss;
    }

    public static WebElement youtube() {
        WebElement youtube = hooks.driver.findElement(By.cssSelector("[class=\"youtube\"]>a"));
        return youtube;
    }

    public static List<WebElement> wish_list() {
        List<WebElement> wish_list = hooks.driver.findElements(By.cssSelector("[title=\"Add to wishlist\"]"));
        return wish_list;
    }
    public static WebElement product_added_message() {
        WebElement product_added_message = hooks.driver.findElement(By.cssSelector("[class=\"bar-notification success\"]"));
        return product_added_message;
}
    public static WebElement wish_list_page() {
        WebElement wish_list_page = hooks.driver.findElement(By.className("ico-wishlist"));
        return wish_list_page;
}

}
