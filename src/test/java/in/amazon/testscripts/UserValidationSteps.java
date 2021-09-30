package in.amazon.testscripts;

import in.amazon.pages.LandingPage;
import in.amazon.pages.SignIn;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ro.Si;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import utils.Driver;

public class UserValidationSteps extends Driver {

    @Given("a user is on the home page of Amazon")
    public void a_user_is_on_the_home_page_of_amazon() {
        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.amazon.in/"));
    }

    @When("he hovers the pointer over Hello Sign in menu")
    public void he_hovers_the_pointer_over_hello_sign_in_menu() {
        landingPage.hoverOverHelloSignIn();
    }
    @When("he clicks on Sign in button in the sub menu")
    public void he_clicks_on_sign_in_button_in_the_sub_menu() {
        landingPage.clickSignInBtn();
    }
    @When("he enters an invalid username as {string}")
    public void he_enters_an_invalid_username_as(String string) {
        signIn.enterEmailId(string);
    }

    @When("he clicks on Continue button")
    public void he_clicks_on_continue_button() {
        signIn.clickContinueBtn();
    }

    @Then("he should see the error message as {string}")
    public void he_should_see_the_error_message_as(String string) {
        String expectedErrMsg = string;
        String actualErrMsg = signIn.getUsernameErrMsg();
        Assert.assertEquals(actualErrMsg,expectedErrMsg);
    }
}
