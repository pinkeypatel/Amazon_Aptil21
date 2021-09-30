package in.amazon.testscripts;

import in.amazon.pages.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utils.Driver;

import java.util.ArrayList;

public class BuyMobilePhoneSteps extends Driver {

    @Given("a user is on the landing page of Amazon")
    public void a_user_is_on_the_landing_page_of_amazon() {
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.amazon.in/"));
    }

    @When("he clicks on Mobiles")
    public void he_clicks_on_mobiles() {
        landingPage.clickMobiles();
    }

    @When("he hovers over Mobiles & Accessories on next page")
    public void he_hovers_over_mobiles_accessories_on_next_page() {
        mobilePhones.hoverOverMobilesAndAccessories();
    }

    @When("he clicks on Apple in the submenu")
    public void he_clicks_on_apple_in_the_submenu() {
        mobilePhones.clickApple();
    }

    @When("he clicks on first available phone on the next page")
    public void he_clicks_on_first_available_phone_on_the_next_page() {
        applePhones.clickFirstIPhone();
    }

    @When("he clicks on Buy Now button on new tab")
    public void he_clicks_on_buy_now_button_on_new_tab() {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        buyNow.clickBuyNowBtn();
    }

    @Then("he must be able to purchase a new phone")
    public void he_must_be_able_to_purchase_a_new_phone() {
        SignIn signIn = new SignIn(driver);
        String expectedText = "Sign-In";
        String actualText = signIn.getSignInText();
        Assert.assertEquals(actualText,expectedText);
    }
}
