package StepDefinations;

import Pages.Accounts_Page;
import Utility.API;
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

public class Accounts_Step {
    public WebDriver driver;
    Accounts_Page accpage;
    SmartWait smartWait = new SmartWait();

    public Accounts_Step() {
        this.driver = Hooks.getDriver();
        accpage = new Accounts_Page(driver);
    }

    public void waitload() {
        new WebDriverWait(driver, 30).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    //Details Tab
    @When("user clicks on account button")
    public void user_clicks_on_account() throws InterruptedException {
        waitload();
        accpage.accMenuClick();
        System.out.println("Account menu clicked");
        Thread.sleep(2000);
        waitload();
    }

    @And("user clicks on USD wallet")
    public void user_clicks_on_usd_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        accpage.usdWalletClick();
        System.out.println("USD Wallet Clicked");
        waitload();
    }

    @And("user clicks on EURO wallet")
    public void user_clicks_on_euro_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        accpage.euroWalletClick();
        System.out.println("USD Wallet Clicked");

        waitload();
    }

    @And("user clicks on GBP wallet")
    public void user_clicks_on_gbp_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        Thread.sleep(1000);
        accpage.gbpWalletClick();
        System.out.println("GBP Wallet Clicked");
        waitload();
    }

    @And("user clicks on JPY wallet")
    public void user_clicks_on_jpy_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        accpage.jpyWalletClick();
        System.out.println("JPY Wallet Clicked");
        waitload();
    }

    @And("user clicks on CNY wallet")
    public void user_clicks_on_cny_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        accpage.cnyWalletClick();
        System.out.println("CNY Wallet Clicked");
        waitload();
    }

    @And("user clicks on PHP wallet")
    public void user_clicks_on_php_wallet() throws InterruptedException {
        waitload();
        user_clicks_on_account();
        accpage.phpWalletClick();
        System.out.println("PHP Wallet Clicked");
        waitload();
    }


    @Then("user should see a graph")
    public void user_should_see_a_graph() throws InterruptedException {
        waitload();
        Assert.assertTrue("Graph is not Displayed", accpage.checkgraph());
        waitload();
    }

    //Move Feature
    @And("user clicks on move tab")
    public void user_clicks_on_move_tab() throws InterruptedException {
        waitload();
        System.out.println("User is in USD Wallet");
        accpage.moveTabClick();
        System.out.println("Move Page clicked");
        waitload();
    }

    @When("user clicks on select beneficiary dropdown")
    public void user_clicks_on_select_beneficiary_dropdown() throws InterruptedException {
        waitload();
        accpage.benDropdownClick();
        System.out.println("Select Beneficiary Dropdown expended ");
        Thread.sleep(50);
        waitload();
    }

    @And("user selects beneficiary")
    public void user_selects_beneficiary() throws InterruptedException {
        waitload();
        accpage.beneficiaryCLick();
        waitload();
    }

    @And("user selects CNY wallet")
    public void user_selects_usd_wallet() throws InterruptedException {
        waitload();
        accpage.cnyAccClcik();
        Thread.sleep(3000);
        System.out.println("CNY Account Selected");
        waitload();
    }
    @And("user selects EUR wallet")
    public void user_selects_eur_wallet() throws InterruptedException {
        waitload();
        accpage.euroAccClcik();
        Thread.sleep(3000);
        System.out.println("Euro Account Selected");
        waitload();
    }
    @And("user selects JPY wallet")
    public void user_selects_jpy_wallet() throws InterruptedException {
        waitload();
        accpage.jpyAccClcik();
        Thread.sleep(3000);
        System.out.println("JPY Account Selected");
        waitload();
    }

    @And("user selects USD wallet")
    public void user_selects_cny_wallet() throws InterruptedException {
        waitload();
        accpage.usdAccClcik();
        Thread.sleep(3000);
        System.out.println("CNY Account Selected");
        waitload();
    }

    @And("enter amount on sending amount box")
    public void enter_amount_on_sending_amount_in_usd() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        accpage.enterSendingAmount();
        waitload();
        System.out.println("Amount Entered");
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("user clicks confirm")
    public void user_clicks_confirm() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        accpage.confirmBtnClick();
        System.out.println("Confirm Button Clicked");
        waitload();
    }

    @And("user enters secret code")
    public void user_enters_secret_code() throws Exception {
        waitload();
        accpage.enterSecretCode();
        Thread.sleep(50);
    }

    @And("user clicks confirm again")
    public void user_clicks_confirm_again() throws InterruptedException {
        waitload();
        accpage.confirmBtnClick();
        System.out.println("Confirm Button Clicked again");
        waitload();
    }

    @And("transfer successfully completed message is shown")
    public void transfer_successfully_completed_message_is_shown() throws InterruptedException {
        waitload();
        Assert.assertTrue("Transfer Unsuccessful.", accpage.checkSuccessMsg());
        System.out.println("Transfer Done");
        waitload();
    }

    @And("user clicks on ok")
    public void user_clicks_on_ok() throws InterruptedException {
        waitload();
        accpage.okBtnClick();
        System.out.println("Clicked on OK");
        waitload();
    }

    @Then("user should redirect to wallet details tab")
    public void user_should_redirect_to_usd_wallet_details_tab() throws InterruptedException {
        waitload();
        Assert.assertTrue("User is not in Details Tab", accpage.checkDetailsTab());
        Thread.sleep(1000);
        System.out.println("User is in Details Tab");
        waitload();

    }

    // Deposit Feature
    @And("user clicks on deposit")
    public void user_clicks_on_deposit() throws InterruptedException {
        waitload();
        accpage.depositTabClick();
        System.out.println("Deposit clicked");
        waitload();
    }

    @And("user expend from dropdown")
    public void user_expend_from_dropdown() throws InterruptedException {
        waitload();
        accpage.fromDropdwnClick();
        System.out.println("From dropdown Expended");
        Thread.sleep(1000);
    }

    @And("user selects debit or credit card")
    public void user_selects_debit_or_credit_card() throws InterruptedException {
        waitload();
        accpage.debitCardClick();
        waitload();
    }

    @And("user enters amount to deposit {string}")
    public void user_enters_amount_to_deposit(String amt )  throws InterruptedException {
        waitload();
        accpage.enterloadAmount(amt);
        System.out.println("Load amount Entered");
        waitload();
        Thread.sleep(500);
    }

    @And("user clicks agreement")
    public void user_clicks_agreement() throws InterruptedException {
        waitload();
        accpage.aggrementClick();
        System.out.println("Agreed transfer Aggrement");
        waitload();
    }

    @And("deposit summary should appear")
    public void deposit_summary_should_appear() throws InterruptedException {
        waitload();
        Assert.assertTrue("Summary didn't appear as expected",accpage.checkDepositSummary());
        System.out.println("Summary appeared");
        Thread.sleep(500);
    }
    @And("move summary should appear")
    public void move_summary_should_appear() throws InterruptedException {
        waitload();
        Assert.assertTrue("Summary didn't appear as expected",accpage.checkMoveSummary());
        System.out.println("Summary appeared");
        Thread.sleep(500);
    }

    @And("expedite fee should add in summary")
    public void expedite_fee_should_add_in_summary() throws InterruptedException {
        accpage = new Accounts_Page(driver);
        waitload();
        Thread.sleep(1000);
        Assert.assertTrue("Expedite fee didn't added in summary", accpage.checkExpeditSummary());
        waitload();
    }

    @And("clicks confirm")
    public void clicks_confirm() throws InterruptedException {
        waitload();
        accpage.confirmBtnClick();
        System.out.println("Confirm button clicked");
        waitload();
    }

    @And("user checks confirmation message and press ok")
    public void user_checks_confirmation_message() throws InterruptedException {
//        waitload();
//        Assert.assertTrue("Deposit Unsuccessfull", accpage.checkLoadSuccessMsg());
//        System.out.println("Deposit Successful");
//        waitload();
        smartWait.waitUntilPageIsLoaded(10);
        waitload();

        try {
            driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
            Assert.assertTrue("Topup unsucessful", accpage.checkLoadSuccessMsg());
        }
        catch (NoSuchElementException e){
            Assert.assertTrue("Topup unsucessful", accpage.sucessMsgwithLoader());
        }
        Thread.sleep(2000);
        accpage.clickOKbtn();
        waitload();
    }

    @And("user clicks ok")
    public void user_clicks_ok() throws InterruptedException {
        waitload();
        accpage.clickOKbtn();
        System.out.println("Ok Button Clicked");
        waitload();
    }

    @Then("user should redirect to accounts")
    public void user_should_redirect_to_accounts() throws InterruptedException {
        waitload();
        Assert.assertTrue("Didn't redirected to Accounts Tab", accpage.checkAccountsTab());
        System.out.println("Redirected to Accounts");
        waitload();
    }

    // Deposit local us bank
    @And("user selects local\\(US Bank)")
    public void user_selects_local_us_bank() {
        waitload();
        accpage.localUSBankClick();
        waitload();
    }

    @And("user selects local\\(UK Bank)")
    public void user_selects_local_uk_bank() {
        waitload();
        accpage.localUKBankClick();
        waitload();
    }

    @And("user selects International\\(non UK Bank)")
    public void user_selects_international_non_uk_bank() {
        waitload();
        accpage.intlNonUKBankClick();
        waitload();
    }

    @Then("user should see details of bank")
    public void user_should_see_details_of_bank() throws InterruptedException {
        smartWait.waitUntilPageIsLoaded(10);
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        Assert.assertTrue("Local US Bank details didn't appears", accpage.localUSBankBeneficiaryCheck());
        waitload();
        Thread.sleep(1500);
        System.out.println("Local US Bank details appeared");
    }

    // Crypto Deposit
    @When("user selects crypto deposit")
    public void user_selects_crypto_deposit() throws InterruptedException {
        waitload();
        accpage.cryptoClick();
        waitload();
    }

    @When("user enters sending amount in TBTC")
    public void user_enters_sending_amount_in_tbtc() throws InterruptedException {
        waitload();
        accpage.enterCryptoSendAmount();
        waitload();
    }

    @When("user clicks on terms and condition check box")
    public void user_clicks_on_terms_and_condition_check_box() throws InterruptedException {
        waitload();
        accpage.checkBoxClick();
        Thread.sleep(1000);

    }

    @Then("user should see a summary")
    public void user_should_see_a_summary() throws InterruptedException {
        waitload();
        Assert.assertTrue("Crypto Deposit Summary didn't appears", accpage.cryptoSummaryCheck());
        waitload();
    }

    // Transfer to new member
    @And("user clicks on transfer to a member pay")
    public void user_clicks_on_pay() throws InterruptedException {
        waitload();
        accpage.memberPayBtnClick();
        waitload();
    }

    @And("user selects existing beneficiary")
    public void user_clicks_transfer_to_another_member_wallet() throws InterruptedException {
        waitload();
        accpage.benDropdownClick();
        Thread.sleep(200);
        waitload();
        accpage.beneficiarySelect();
        waitload();
        System.out.println("Transfer Beneficiary Selected");
        waitload();
    }

    @And("user enters sending amount in USD and payment reference")
    public void user_enters_wallet_number_and_reference_name() throws InterruptedException {
        waitload();
        accpage.enterSendingAmount();
        System.out.println("1");
        waitload();
        accpage.enterPaymentRef();
        System.out.println("2");
        waitload();
    }

    @And("user checks summary of transfer amount")
    public void user_checks_summary_of_transfer_amount() throws InterruptedException {
        waitload();
        smartWait.waitUntilPageIsLoaded(10);
        Assert.assertTrue("No summary", accpage.checkTransferSummary());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        waitload();
        Thread.sleep(500);
    }

    @And("clicks confirm button")
    public void clicks_confirm_button() throws InterruptedException {
        waitload();
        clicks_confirm();
        waitload();
    }

    @And("enter otp for transfer")
    public void enter_otp_for_transfer() throws Exception {
        waitload();
        accpage.enterSecretCode();
        Thread.sleep(50);
        waitload();
    }

    @And("user clicks confirm button again")
    public void user_clicks_confirm_button_again() throws InterruptedException {
        waitload();
        clicks_confirm_button();
        smartWait.waitUntilPageIsLoaded(10);
    }

    @And("user checks success message")
    public void user_checks_success_message() throws InterruptedException {
        waitload();
        Assert.assertTrue("Transfer Not Successful", accpage.checkSuccessMsg());
        waitload();
    }

    @And("press ok")
    public void press_ok() throws InterruptedException {
        waitload();
        user_clicks_ok();
        waitload();
    }

    @And("user should redirect to details")
    public void user_should_redirect_to_details() throws InterruptedException {
        waitload();
        user_should_see_a_graph();
        waitload();
    }

    // Make payment to new individual
    @When("user clicks payments tab")
    public void user_clicks_payments_tab() throws InterruptedException {
        waitload();
        accpage.paymentTabClick();
        waitload();
    }

    @And("clicks on make payment pay button")
    public void clicks_on_make_payment_pay_button() throws InterruptedException {
        waitload();
        accpage.makePaymentClick();
        waitload();
    }

    @And("user clicks on individual")
    public void user_clicks_on_individual() {
        waitload();
        accpage.toIndividual();
        waitload();
    }

    @And("user clicks on new")
    public void user_clicks_on_new() throws InterruptedException {
        waitload();
        accpage.newBtnClick();
    }

    @And("user enters other recipient details for new individual")
    public void user_enters_other_recipient_details_for_new_individual() throws InterruptedException {
        waitload();
        accpage.recipientDetails();
        waitload();
    }

    @And("user enters bank details")
    public void user_enters_bank_details() throws InterruptedException {
        waitload();
        accpage.bankDetails();
        waitload();
    }

    @And("user enters amount")
    public void user_enters_amount() throws InterruptedException {
        waitload();
        accpage.amount();
        waitload();
    }

    @And("user selects timing\\(now)")
    public void user_selects_when_now() {
        waitload();
        accpage.whenToPay();
        waitload();
    }

    @And("user enter references")
    public void user_enter_references() throws InterruptedException {
        waitload();
        accpage.references();
        Thread.sleep(1000);
    }

    @And("user clicks on pay for payment")
    public void user_clicks_on_pay_for_payment() throws InterruptedException {
        waitload();
        accpage.payClick();
        waitload();
    }

    @And("check request success message and press ok")
    public void check_success_message_and_press_ok() throws InterruptedException {
        waitload();
        Assert.assertTrue("Success message didn't appear", accpage.checkReqAcceptMsg());
        waitload();
    }

    @Then("if payment is complete user should redirect to payments tab")
    public void user_should_redirect_to_payments_tab() throws InterruptedException {
        waitload();
        Assert.assertTrue("User redirected to payment page", accpage.paymentPage());
        waitload();
    }
    // Make payment to new individual ends

    // Make payment to new Business
    @When("user clicks on business")
    public void user_clicks_on_Business() throws InterruptedException {
        waitload();
        accpage.businessClick();
        waitload();
    }

    @And("user enters other recipient details for new business")
    public void user_enters_other_recipient_details_for_new_business() throws InterruptedException {
        waitload();
        accpage.recipientBusinessDetails();
        waitload();
    }

    // Make payment to Existing Individual

    @And("user clicks on existing")
    public void user_clicks_on_Existing_Individual() throws InterruptedException {
        waitload();
        accpage.clickExisting();
        waitload();
    }

    @And("user selects existing recipient from recipient details")
    public void user_selects_existing_beneficiary_from_recipient_details() {
        waitload();
        accpage.selectRecipients();
        waitload();
    }

    //Make payment to Existing Business
    @When("user is in payments tab and makes payment for existing business")
    public void user_is_in_payments_tab_and_makes_payment_for_existing_business() throws InterruptedException {
        waitload();
        clicks_on_make_payment_pay_button();
        waitload();

    }

    @And("user clicks on existing business")
    public void user_clicks_on_existing_business() throws InterruptedException {
        waitload();
        accpage.businessClick();
        Thread.sleep(1000);
        accpage.clickExisting();
        waitload();
    }

    //Transaction Tab
    @When("user click on transaction tab")
    public void user_is_in_transaction_tab() throws InterruptedException {
        waitload();
        accpage.transactionsTabClick();
        waitload();

    }

    @And("user should see latest pending transactions first\\(if any) in PENDING TRANSACTIONS")
    public void user_should_see_latest_pending_transactions_first_if_any_in_pending_transactions() throws InterruptedException {
        waitload();
        try {
            Assert.assertTrue("Latest pending transaction not found", accpage.pendingTransection());
            waitload();
        } catch (NoSuchElementException e) {
            Assert.assertTrue("Latest pending transaction not found", accpage.noTranscetionLabelCheck());
            waitload();
        }
    }

    @When("user after scroll down should see latest cleared transaction first in YOUR TRANSACTIONS")
    public void user_after_scroll_down_should_see_latest_cleared_transaction_first_in_your_transactions() throws InterruptedException {
        waitload();
        Assert.assertTrue("Latest Completed transaction not found", accpage.completedTransection());
        waitload();
    }

    @When("user clicks on statements tab")
    public void user_is_in_statements_tab() throws InterruptedException {
        waitload();
        accpage.statementsTabBtnClick();

    }

    @And("if any statement available user clicks on download button")
    public void if_any_statement_available_user_clicks_on_download_button() {
        waitload();
        try {
            if (accpage.downloadBtnCheck())
                accpage.downloadBtnClick();
            waitload();
        } catch (Exception e) {
            accpage.accMenuClick();
            waitload();
        }

    }

    @Then("statement should be downloaded")
    public void statement_should_be_downloaded() {
        System.out.println("Statement downloaded");
    }

    // Withdraw
    @When("user is in withdraw tab")
    public void user_is_in_withdraw_tab() throws InterruptedException {

        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        waitload();
        accpage.withdrawTabClick();
        waitload();

    }

    @And("user add personal account")
    public void user_add_personal_account() throws InterruptedException {
        waitload();
        accpage.addPersonalAccClick();
        waitload();
    }

    @And("user selects destination bank country and currency")
    public void user_selects_destination_bank_country() throws InterruptedException {
        waitload();
        accpage.destinationBankCountry();
        Thread.sleep(500);
        accpage.beneficiaryCurrencyClick();
        Thread.sleep(500);
        accpage.nextBtnClick();
        waitload();
    }

    @And("press next button")
    public void press_next_button() throws InterruptedException {
        waitload();
        accpage.nextBtnClick();
        waitload();
    }

    @And("user input withdraw beneficiary details and press next")
    public void user_enter_withdraw_beneficiary_details_and_press_next() throws InterruptedException {
        waitload();
        accpage.withdrawBeneficiaryDetails();
        Thread.sleep(1000);
        accpage.nextBtnClick();
        waitload();
    }

    @And("input sending amount in usd")
    public void input_sending_amount_in_usd() throws InterruptedException {
        waitload();
        accpage.enterSendingAmount();
        waitload();
    }

    @And("click on expedite fee and outbound transfer agreement")
    public void click_on_expedite_fee_and_outbound_transfer_agreement() throws InterruptedException {
        waitload();
        accpage.withdrawCheckBox();
        waitload();

    }

    //Pay Family
    @When("user is in pay tab")
    public void user_is_in_pay_tab() throws InterruptedException {
        user_clicks_on_account();
        user_clicks_on_usd_wallet();
        waitload();
        accpage.payTabClick();
        waitload();
    }

    @And("user clicks pay button of friends or family")
    public void user_clicks_pay_button_of_friends_or_family() throws InterruptedException {
        waitload();
        accpage.ffPayBtnClick();
        waitload();
    }

    @And("user clicks on pay someone new")
    public void user_clicks_on_pay_someone_new() throws InterruptedException {
        waitload();
        accpage.paySomeoneNewBtnClick();
        waitload();
    }

    @And("user input pay\\(individual) beneficiary details and press next")
    public void user_input_pay_individual_beneficiary_details_and_press_next() throws InterruptedException {
        waitload();
        accpage.payFriendorFamilyDetails();
        Thread.sleep(1000);
        accpage.nextBtnClick();
        waitload();
    }

    @And("input payment reference and reason")
    public void input_payment_reference_and_reason() throws InterruptedException {
        waitload();
        accpage.paymentReason();
        Thread.sleep(500);
        accpage.paymentRef();
        waitload();
    }

    //Pay business
    @And("user clicks pay button a business or invoice")
    public void user_clicks_pay_button_a_business_or_invoice() throws InterruptedException {
        waitload();
        accpage.businessPayBtnClick();
        waitload();
    }

    @And("user clicks on pay to new business button")
    public void user_clicks_on_pay_to_new_business_button() throws InterruptedException {
        waitload();
        accpage.payNewBusinessClick();
        waitload();
    }

    @And("user input business beneficiary details and press next")
    public void user_input_business_beneficiary_details_and_press_next() throws InterruptedException {
        waitload();
        accpage.payBusinessDetails();
        waitload();
        accpage.nextBtnClick();
        waitload();
    }

    //Another member pay

    @And("user clicks pay button of another member")
    public void user_clicks_pay_button_of_another_member() throws InterruptedException {
        waitload();
        accpage.anotherMemberPayBtnClick();
        waitload();
    }

    @And("input payment reference")
    public void input_payment_reference() throws InterruptedException {
        waitload();
        accpage.paymentReason();
        Thread.sleep(500);
        waitload();
    }

}
