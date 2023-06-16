package Pages;

import Utility.BaseData;
import Utility.CommonPageMethods;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentGatewayPage extends CommonPageMethods {
    public static WebDriver driver;
    @FindBy(id = "apex-frame")
    WebElement apexFrame;
    @FindBy(xpath = "//iframe[contains(@name,'__privateStripeFrame')]")
    WebElement stripeFrame;
    @FindBy(xpath = "//*[@id=\"card_number\"]")
    WebElement cardNo;

    @FindBy(xpath = "//*[@id=\"expiry_month\"]")
    WebElement expMonth;
    @FindBy(xpath = "//*[@id=\"expiry_year\"]")
    WebElement expYear;
    @FindBy(xpath = "//*[@id=\"cvv\"]")
    WebElement cvv;
    @FindBy(xpath = "//*[@id=\"hostedPaymentsubmitBtn\"]")
    WebElement payBtn;
    @FindBy(xpath = "//input[@name='cardnumber']")
    WebElement cardNumber;
    @FindBy(xpath = "//input[@name='exp-date']")
    WebElement expDate;
    @FindBy(xpath = "//input[@name='cvc']")
    WebElement cvc;
    @FindBy(xpath = "//span[text()='Pay']")
    WebElement Pay;
    @FindBy(xpath = "//h6[text()='Payment Information']")
    WebElement paymentInfoLebel;

    public PaymentGatewayPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public boolean apexFrameCheck() {
        try {
            return apexFrame.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("No Apex");
        }
        return false;
    }
    public boolean stripeFrameCheck() {
        try {
            return stripeFrame.isDisplayed();
        } catch (NoSuchElementException e) {
            System.out.println("No Stripe");
        }
        return false;
    }
    public void enterApxxCardNum() {
        cardNo.sendKeys(BaseData.cardNumber());
    }

    public void enterApxxMonth() {
        expMonth.sendKeys(BaseData.cardMonth());
    }

    public void enterApxxCardYear() {
        expYear.sendKeys(BaseData.cardYear());
    }
    public void enterApexxCvv() {
        cvv.sendKeys(BaseData.cardCvv());
    }
    public void clickApxxPay() {
        payBtn.click();
    }
    public void enterStripeCardNum() {
        cardNumber.sendKeys(BaseData.stripeCardNumber());
    }

    public void enterStripeExpdate() {

        expDate.sendKeys(BaseData.stripeCardExpiry());
    }
    public void enterStripeCvc() {
        cvc.sendKeys(BaseData.cardCvv());
    }
    public void stripePayClick() throws InterruptedException {
        paymentInfoLebel.click();
        Thread.sleep(1000);
        Pay.click();
    }
}
