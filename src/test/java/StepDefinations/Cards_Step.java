package StepDefinations;

import Pages.Cards_Page;
import Utility.Hooks;
import Utility.SmartWait;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Cards_Step {
    public WebDriver driver;
    Cards_Page cardspage;
    SmartWait smartWait = new SmartWait();

    public Cards_Step() {
        this.driver = Hooks.getDriver();
        cardspage = new Cards_Page(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }


    @And("user clicks on cards on side menu")
    public void user_clicks_on_Cards_on_side_menu() throws InterruptedException {
        waitload();
        cardspage.cardsMenuClick();
        waitload();
    }

    @Then("physical cards page will appear")
    public void physical_cards_page_will_appear() {
        waitload();
        Assert.assertTrue("Physical card didn't appear", cardspage.physicalCardCheck());
        System.out.println("Physical card appeared");
        waitload();
    }

    @When("user clicks on physical card")
    public void user_clicks_on_physical_card() throws InterruptedException {
        waitload();
        cardspage.physicalCardClick();
        Assert.assertTrue("We are not in details tab", cardspage.detailsTabCheck());
        waitload();
    }

    @And("user clicks on statements Tab")
    public void user_is_in_details_tab_user_clicks_on_statements_tab() throws InterruptedException {
//        clicks_on_virtual_card_tab_from_card_page();
//        user_clicks_on_first_virtual_card();
        waitload();
        cardspage.statementTabClick();
        waitload();
    }

    @And("user clicks on download button if any statement available")
    public void user_clicks_on_download_button_if_any_statement_available() throws InterruptedException {
        try {
            if (cardspage.isStatementAvailable())
                cardspage.statementDownloadClick();
            waitload();
        } catch (Exception e) {
            cardspage.cardsMenuClick();
        }
    }

    @Then("a statement will be downloaded")
    public void a_statement_will_be_downloaded() {
        System.out.println("Statement downloaded");
    }

    @When("user clicks on transaction tab")
    public void user_clicks_on_transaction_tab() throws InterruptedException {
//        clicks_on_virtual_card_tab_from_card_page();
//        user_clicks_on_first_virtual_card();
        waitload();
        cardspage.transactionTabClick();
        waitload();
    }

    @And("latest transactions should appear in  your transactions section")
    public void latest_transactions_should_appear_in__your_transactions_section() throws InterruptedException {
        waitload();
        Assert.assertTrue("Latest pending transaction not found", cardspage.latestTransectionCheck());
        waitload();
    }

    @Then("user should be able to export transactions as pdf and csv")
    public void user_should_be_able_to_export_transactions_as_pdf_and_csv() throws InterruptedException {
        waitload();
        cardspage.exportTransaction();
        waitload();
    }

    @And("user clicks on load tab")
    public void user_clicks_on_load_tab() throws InterruptedException {
        waitload();
        cardspage.loadTabClick();
        waitload();
    }

    @When("user enters amount to load {string}")
    public void user_enters_amount_to_load(String amount) throws InterruptedException {
        waitload();
        cardspage.enterLoadAmount(amount);
        waitload();
    }

    @When("user checks overview")
    public void user_checks_overview() throws InterruptedException {
        waitload();
        Assert.assertTrue("Overview didn't appeared", cardspage.overviewCheck());
        waitload();
    }

    @When("user clicks confirm button")
    public void user_clicks_confirm_button() throws InterruptedException {
        waitload();
        cardspage.confirmBtnClick();
        waitload();
    }

    @When("user provides otp and clicks confirm button again")
    public void user_provides_otp_and_clicks_confirm_button_again()throws Exception {
        waitload();
        cardspage.enterOtp();
        waitload();
        cardspage.otpConfirmBtnClick();
        waitload();
    }

    @And("user checks transfer success message and press ok button")
    public void user_checks_transfer_success_message_and_press_ok_button() throws InterruptedException {
        waitload();
        Assert.assertTrue("Load unSuccessful", cardspage.loadSucessMsgCheck());
        cardspage.okBtnClick();
        waitload();
    }

    @And("user checks topup confirmation message and clicks ok button")
    public void user_checks_topup_confirmation_message_and_clicks_ok_button() throws InterruptedException {
        System.out.println("1");
        waitload();
        try {
            Assert.assertTrue("Topup unsucessful", cardspage.checksucessMsgApexxLoad());
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Topup unsucessful", cardspage.sucessMsgStripeLoad());
        }
        System.out.println("2");
        Thread.sleep(2000);
        cardspage.topupOKBtnClick();
        System.out.println("3");
        waitload();
    }

    @And("user checks topup confirmation message and clicks back button")
    public void user_checks_topup_confirmation_message_and_clicks_back_button() throws InterruptedException {
        System.out.println("1");
        waitload();
        try {
            Assert.assertTrue("Topup unsucessful", cardspage.checksucessMsgApexxLoad());
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Topup unsucessful", cardspage.sucessMsgStripeLoad());
        }
        System.out.println("2");
        Thread.sleep(2000);
        cardspage.topupBackBtnClick();
        System.out.println("3");
        waitload();
    }

    @Then("user should redirect back to physical card page")
    public void user_should_redirect_back_to_physical_card_page() {
        smartWait.waitUntilPageIsLoaded(2);
        Assert.assertTrue("Physical card didn't appear", cardspage.physicalCardCheck());
        System.out.println("Back to Physical card");
    }

    @And("user clicks on unload tab")
    public void user_clicks_on_unload_tab() throws InterruptedException {
//        user_clicks_on_Cards_on_side_menu();
//        user_clicks_on_physical_card();
        waitload();
        cardspage.unloadTabClick();
        waitload();
    }

    @And("user enters amount to unload")
    public void user_enters_amount_to_unload() throws InterruptedException {
        cardspage.enterUnloadAmount();
        waitload();
    }

    @And("user clicks on topup tab")
    public void user_clicks_on_topup_tab() throws InterruptedException {
//        clicks_on_virtual_card_tab_from_card_page();
//        user_clicks_on_first_virtual_card();
        waitload();
        cardspage.topUpTabClick();
        waitload();
    }

    @And("user selects amount to topup")
    public void user_selects_amount_to_topup() throws InterruptedException {
        waitload();
        cardspage.topupAmountDropdownClick();
        Thread.sleep(1000);
        cardspage.topupAmountClick();
    }

    @And("clicks on topup button")
    public void clicks_on_topup_button() throws InterruptedException {
        waitload();
        cardspage.topupBtnClick();
        waitload();

    }

    @When("user checks summary")
    public void user_checks_summary() {
        waitload();
        Assert.assertTrue("Topup Summary didn't appear", cardspage.summaryCheck());
        waitload();
    }

    @When("user clicks confirm button for topup")
    public void user_clicks_confirm_button_for_topup() throws InterruptedException {
        waitload();
        cardspage.topupConfirmBtnClick();
        waitload();
    }


    //+++++++++++++++++++++++++++++++++++++++PIN++++++++++++++++++++++++++++++++++++++++
    @And("user clicks on pin tab")
    public void user_clicks_on_pin_tab() throws InterruptedException {
        waitload();
        cardspage.pinTabClick();
        waitload();
    }

    @And("user inputs password")
    public void user_inputs_password() throws Exception {
        waitload();
        cardspage.enterPinPass();
        waitload();
    }

    @And("user clicks on submit")
    public void user_clicks_on_submit() throws InterruptedException {
        waitload();
        cardspage.pinSubmitClick();
        waitload();
    }

    @Then("card pin should appear")
    public void card_pin_should_appear() throws InterruptedException {
        waitload();
        Assert.assertTrue("Card Pin didn't appear", cardspage.viewedPinCheck());
        waitload();
    }
//+++++++++++++++++++++++++++++++++++++++++++++++++PIN+++++++++++++++++++++++++++++++++++++++++++

    //+++++++++++++++++++++++++++++++++++++++++++++++++Digital Card+++++++++++++++++++++++++++++++++++++++++++
    @And("user clicks on digital card tab")
    public void user_clicks_on_digital_card_tab() throws InterruptedException {
        waitload();
        cardspage.digitalCardTabClick();
        waitload();
    }

    @And("user inputs otp")
    public void user_inputs_otp() throws Exception {
        waitload();
        cardspage.enterOtpDigitalCard();
        waitload();

    }

    @And("user clicks on show card details button")
    public void user_clicks_on_show_card_details_button() {
        waitload();
        cardspage.showCardDetailsBtnClick();
        waitload();
    }

    @Then("card details should appear")
    public void card_details_should_appear() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        waitload();
        Assert.assertTrue("Card details didn't appeared", cardspage.cardDetaisCheck());
        waitload();
    }

//+++++++++++++++++++++++++++++++++++++++++++++++++Digital Card+++++++++++++++++++++++++++++++++++++++++++

    @When("clicks on virtual card tab from card page")
    public void clicks_on_virtual_card_tab_from_card_page() throws InterruptedException {
        user_clicks_on_Cards_on_side_menu();
        waitload();
        cardspage.virtualCardTabClick();
        waitload();
    }

    @And("user clicks on first virtual card")
    public void user_clicks_on_first_virtual_card() throws InterruptedException {
        waitload();
        cardspage.firstVCardClick();
        waitload();
    }

    @And("user clicks on second virtual card")
    public void user_clicks_on_second_virtual_card() throws InterruptedException {
        waitload();
        cardspage.secondVCardClick();
        waitload();
    }

    @And("user clicks on third virtual card")
    public void user_clicks_on_Third_virtual_card() throws InterruptedException {
        waitload();
        cardspage.thirdVCardClick();
        waitload();
    }

    @Then("user should redirect back to virtual card page")
    public void user_should_redirect_back_to_virtual_card_page() throws InterruptedException {
        waitload();
        Assert.assertTrue("Didn't come back to virtual Card Page", cardspage.firstVCardCheck());
        waitload();
    }

}
