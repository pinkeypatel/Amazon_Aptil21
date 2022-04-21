package utils;

import in.amazon.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    protected static WebDriver driver;
    protected static LandingPage landingPage;
    protected static SignIn signIn;
    protected static MobilePhones mobilePhones;
    protected static ApplePhones applePhones;
    protected static BuyNow buyNow ;

    public static void init(){
        System.setProperty("webdriver.chrome.driver", "Resource//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.in");
        landingPage = new LandingPage(driver);
        signIn = new SignIn(driver);
        mobilePhones = new MobilePhones(driver);
        applePhones = new ApplePhones(driver);
        buyNow = new BuyNow(driver);
    }
}
