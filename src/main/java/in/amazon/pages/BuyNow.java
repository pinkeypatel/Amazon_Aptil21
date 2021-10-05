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

    @FindBy(id="buy-now-butto")
    private WebElement buyNowBtn;

    public BuyNow(WebDriver driver){
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver,30);
    }

    public void clickBuyNowBtn(){
        wait.until(ExpectedConditions.visibilityOf(buyNowBtn));
        buyNowBtn.click();
    }
}
