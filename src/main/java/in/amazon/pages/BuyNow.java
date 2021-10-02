package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyNow {
    WebDriverWait wait;

    @FindBy(linkText = "Join Prime")
    private WebElement joinPrimeBtn;

    public BuyNow(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,30);
    }

    public void clickJoinPrimeBtn(){
        wait.until(ExpectedConditions.visibilityOf(joinPrimeBtn));
        joinPrimeBtn.click();
    }
}
