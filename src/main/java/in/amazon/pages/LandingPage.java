package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    Actions actions;

    @FindBy(linkText = "Mobiles")
    private WebElement mobiles;

    @FindBy(id="nav-link-accountList")
    private WebElement helloSignIn;

    @FindBy(linkText = "Sign in")
    private WebElement signInBtn;

    public LandingPage(WebDriver driver){
        PageFactory.initElements(driver,this);
        actions = new Actions(driver);
    }

    public void clickMobiles(){
        mobiles.click();
    }

    public void hoverOverHelloSignIn(){
        actions.moveToElement(helloSignIn).build().perform();
    }

    public void clickSignInBtn(){
        signInBtn.click();
    }
}
