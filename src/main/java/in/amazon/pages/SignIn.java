package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {

    @FindBy(xpath = "//h1[contains(@class,'spacing-small')]")
    private WebElement textSignIn;

    @FindBy(id="ap_email")
    private WebElement email;

    @FindBy(id="continue")
    private WebElement continueBtn;

    @FindBy(xpath = "//span[contains(@class,'a-list-item')]")
    private WebElement usernameErrMsg;

    public SignIn(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public String getSignInText(){
        String text = textSignIn.getText();
        return text;
    }

    public void enterEmailId(String emailId){
        email.sendKeys(emailId);
    }

    public void clickContinueBtn(){
        continueBtn.click();
    }

    public String getUsernameErrMsg(){
        String text = usernameErrMsg.getText();
        return text;
    }
}
