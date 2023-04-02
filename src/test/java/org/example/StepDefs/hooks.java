package org.example.StepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class hooks
{
    public static ChromeDriver driver;
    public static SoftAssert soft;
    public static WebDriverWait wait ;
    public static Actions act ;
    //public Select sel;

@Before
    public static void before()
{
    driver=new ChromeDriver();
    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    act = new Actions(driver);
    soft =new SoftAssert();
    wait =new WebDriverWait(driver, Duration.ofSeconds(3));
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@After
public static void after()
{
    driver.quit();
}

}








