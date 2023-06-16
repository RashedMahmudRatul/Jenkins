package Pages;

import Utility.API;
import Utility.BaseData;
import Utility.CommonPageMethods;
import Utility.Random_data;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.channels.Selector;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static Utility.API.CurrencyExchangeRate.*;
import static Utility.UserProfile.cardLoad.clRate;


public class Accounts_Page extends CommonPageMethods {
    public static WebDriver driver;
    String moveAmount="1200";
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[2]")
    public WebElement graph;

    @FindBy(xpath = "(//span[text()='Accounts'])[1]")
    public WebElement accMenubtn;

    //Accounts Move xpaths
    @FindBy(xpath = "(//p[contains(text(),'Available Balance')])[1]")
    public WebElement usdWallet;
    @FindBy(xpath = "(//span[contains(text(),'Euro')])[1]")
    public WebElement euroWallet;
    @FindBy(xpath = "//span[contains(text(),'Pound Sterling')]")
    public WebElement gbpWallet;

    @FindBy(xpath = "//span[contains(text(),'Yen')]")
    public WebElement jpyWallet;
    @FindBy(xpath = "//span[contains(text(),'Yuan')]")
    public WebElement cnyWallet;
    @FindBy(xpath = "//span[contains(text(),'Pdeso')]")
    public WebElement phpWallet;
    @FindBy(xpath = "(//span[text()='Move'])")
    public WebElement moveTab;
    @FindBy(xpath = "//div[contains( text(),'Beneficiary')]")
    public WebElement selectBeneficiaryDropdown;

    @FindBy(xpath = "//Span[contains( text(),'$')]")
    public WebElement usdAcc;
    @FindBy(xpath = "//Span[contains( text(),'€')]")
    public WebElement euroAcc;

    @FindBy(xpath = "//span[contains( text(),'円')]")
    public WebElement jpyAcc;
    @FindBy(xpath = "//Span[contains( text(),'¥')]")
    public WebElement cnyAcc;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement sendAmount;
    @FindBy(xpath = "(//button[text()='Confirm'])")
    public WebElement confirmBtn;
    @FindBy(xpath = "(//input[@type='text' and @name='secretCode'])")
    public WebElement secretCode;
    @FindBy(xpath = "(//span[contains(text(),'successfully')])")
    public WebElement sucessMsg;
    @FindBy(xpath = "(//button[@role='button' and text()='Ok' or text()='OK'])")
    public WebElement okBtn;
    @FindBy(xpath = "(//span[text()='Details'])")
    public WebElement detailsTab;
    //Accounts deposit
    @FindBy(xpath = "(//span[text()='Deposit'])")
    public WebElement depositTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[1]/div/div/input")
    public WebElement fromDropdwn;
    @FindBy(xpath = "//span[contains(text(),'Debit or Credit Card')]")
    public WebElement debitCard;
    @FindBy(xpath = "//input[@name='topUpAmount']")
    public WebElement loadAmount;
    @FindBy(xpath = "//div[@class='CheckboxWithValidation']")
    public WebElement trAggrement;
    @FindBy(xpath = "(//span[text()='Transfer Summary'])")
    public WebElement summary;
    @FindBy(xpath = "(//span[contains(text(),'Expedite Fee')])")
    public WebElement expeditSummary;
    @FindBy(xpath = "//b[contains(text(),'Congratulations')]")
    public WebElement loadSucessMsg;
    @FindBy(xpath = "//span[contains(text(),'Your payment request has been accepted.')]")
    public WebElement sucessMsgUS;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[1]/div/div/div")
    public WebElement accountsTabUsd;
    @FindBy(xpath = "//span[contains(text(),'Local (US Bank)')]")
    public WebElement localUSBank;
    @FindBy(xpath = "//span[contains(text(),'Local (UK Bank)')]")
    public WebElement localUKBank;
    @FindBy(xpath = "//span[contains(text(),'International')]")
    public WebElement intlNonUKBank;
    @FindBy(xpath = "//div[contains(@class,'MuiGrid-root MuiGrid-container')]//parent::div[contains(@class,'MuiPaper-root wallet-card-layout')]")
    public WebElement localUSBankBeneficiary;
    @FindBy(xpath = "//span[contains(text(),'Crypto Deposit')]")
    public WebElement crypto;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement cryptoSendAmount;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[2]/div/div[1]/label")
    //@FindBy(xpath = "//div[@class='ui checkbox Checkbox']//child::input")
    //@FindBy(xpath = "//div[@class='ui checkbox Checkbox']//child::label")
    //@FindBy(xpath = "(//input[@class='hidden' and  @type='checkbox'])//self::input")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div[2]/div/div/div/div[3]/div[1]/div/div[2]/div[1]/div/div")
    public WebElement cryptoSummary;
    @FindBy(xpath = "(//span[text()='Payments'])")
    public WebElement paymentTabBtn;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div/div[1]/div")
    public WebElement paymentTabPage;
    @FindBy(xpath = "(//span[text()='PAY'])[2]")
    public WebElement memberPayBtn;
    @FindBy(xpath = "/html/body/div[1]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div[1]/div/div[2]/div/div[2]/div/div/div/div[1]/div/div[2]/div[1]")
    public WebElement beneficiary;
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement paymentRef;
    @FindBy(xpath = "(//span[text()='Summary'])")
    public WebElement trnsSummary;
    @FindBy(xpath = "(//span[text()='PAY'])[1]")
    public WebElement makePayBtn;
    @FindBy(xpath = "//span[text()='Individual']")
    public WebElement individual;
    @FindBy(xpath = "//span[text()='New']")
    public WebElement newRecipient;
    @FindBy(xpath = "//input[@name='firstName']")
    public WebElement fName;
    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement lName;
    @FindBy(xpath = "//*[@id=\"mui-component-select-country\"]")
    public WebElement countryDropdown;
    @FindBy(xpath = "//li[contains(text(),'America')]")
    public WebElement america;
    @FindBy(xpath = "//input[@name='addressLine1']")
    public WebElement addressLine;
    @FindBy(xpath = "//input[@name='city']")
    public WebElement city;
    @FindBy(xpath = "//*[@id=\"mui-component-select-state\"]")
    public WebElement stateDropdown;
    @FindBy(xpath = "//span[text()='Arkansas']")
    public WebElement recipientState;
    @FindBy(xpath = "//input[@name='postCode']")
    public WebElement postCode;
    @FindBy(xpath = "//input[@name='email']")
    public WebElement email;
    @FindBy(xpath = "//div[@class='selected-flag']")
    public WebElement phoneDropdown;
    @FindBy(xpath = "//li[@class='search search-class']/input[@type='search']")
    public WebElement phnSearchBox;
    @FindBy(xpath = "//li[@data-country-code='us']")
    public WebElement phnUS;
    @FindBy(xpath = "//input[@type='tel']")
    public WebElement phone;
    @FindBy(xpath = "//*[@id=\"mui-component-select-currency\"]/div/div[2]")
    public WebElement currencyDropdown;
    //@FindBy(xpath = "(//span[contains(text(),'Dollar ')])[2]")
    @FindBy(xpath = "//*[@id=\"menu-currency\"]/div[3]/ul/li[1]/div/div[2]")
    public WebElement usd;
    @FindBy(xpath = "//*[@id=\"mui-component-select-bankCountry\"]")
    public WebElement bankCountry;
    @FindBy(xpath = "//input[@name='bankName']")
    public WebElement bankName;
    @FindBy(xpath = "//input[@name='bankAddress']")
    public WebElement bankAddress;
    @FindBy(xpath = "//input[@name='bankCity']")
    public WebElement bankCity;
    @FindBy(xpath = "//*[@id=\"mui-component-select-bankState\"]")
    public WebElement bankStateDropdown;
    @FindBy(xpath = "(//span[text()='Delaware'])")
    public WebElement bankState;
    @FindBy(xpath = "//input[@name='bankPostCode']")
    public WebElement bankPostCode;
    @FindBy(xpath = "//input[@name='bankRoutingNumber']")
    public WebElement bankRountingNum;
    @FindBy(xpath = "//input[@name='bankAccountNumber']")
    public WebElement bankAccNum;
    @FindBy(xpath = "//input[@name='bankAccountName']")
    public WebElement bankAccName;
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement payAmount;
    @FindBy(xpath = "//span[text()='Now']")
    public WebElement now;
    @FindBy(xpath = "//input[@name='paymentReference']")
    public WebElement payRef;
    @FindBy(xpath = "//input[@name='reason']")
    public WebElement paymentReson;
    @FindBy(xpath = "//input[@name='note']")
    public WebElement paymentNote;
    @FindBy(xpath = "//span[text()='PAY']")
    public WebElement payBtn;
    @FindBy(xpath = "//span[text()='Request accepted']")
    public WebElement reqAcceptmsg;
    @FindBy(xpath = "//span[text()='Business']")
    public WebElement business;
    @FindBy(xpath = "//input[@name='businessName']")
    public WebElement busName;
    @FindBy(xpath = "//input[@name='registrationNumber']")
    public WebElement busRegNum;
    @FindBy(xpath = "//*[@id=\"mui-component-select-country\"]")
    public WebElement busCountry;
    @FindBy(xpath = "//span[text()='Existing']")
    public WebElement existing;
    @FindBy(xpath = "(//span[text()='Select'])[1]")
    public WebElement select;
    @FindBy(xpath = "//span[text()='Transactions']")
    public WebElement transactionsTab;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[3]/div[2]/div/table/tbody/tr[1]/td[1]/a/span")
    public WebElement firstPTransaction;
    @FindBy(xpath = "(//span[contains(text(),' No records')])[1]")
    public WebElement noTransectionLabel;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[4]/div[3]/div[1]/table/tbody/tr[1]/td[1]")
    public WebElement firstCTransactions;
    @FindBy(xpath = "(//span[text()='Statements'])")
    public WebElement statementsTabBtn;
    @FindBy(xpath = "(//button[contains(text(),'DOWNLOAD')])[1]")
    public WebElement downloadBtn;
    @FindBy(xpath = "(//span[text()='Withdraw'])")
    public WebElement withdrawTab;
    @FindBy(xpath = "(//div[@role=\"option\"])[1]")
    public WebElement withdrawExistingBeneficiary;
    @FindBy(xpath = "(//div[contains(text(),'Add')])")
    public WebElement addPersonalAccBtn;
    @FindBy(xpath = "//option[@value='US']")
    public WebElement countryUS;
    @FindBy(xpath = "//option[@value='USD']")
    public WebElement currencyUSD;
    @FindBy(xpath = "//button[@role='button' and text()='Next']")
    public WebElement nextBtn;
    @FindBy(xpath = "(//option[@value='Colorado'])")
    public WebElement stateColorado;
    @FindBy(xpath = "(//input[@name='beneficiaryReference'])")
    public WebElement beneficiaryReference;
    @FindBy(xpath = "(//input[@name='destinationBankName'])")
    public WebElement destinationBankName;
    @FindBy(xpath = "(//input[@name='addressLine1'])")
    public WebElement address;
    @FindBy(xpath = "(//input[@name='destinationBankCity'])")
    public WebElement destinationBankCity;
    @FindBy(xpath = "(//input[@name='sortCode'])")
    public WebElement sortCode;
    @FindBy(xpath = "(//input[@name='accountNo'])")
    public WebElement accountNo;
    @FindBy(xpath = "(//input[@name='swiftCode'])")
    public WebElement swiftCode;
    @FindBy(xpath = "(//input[@name='iban'])")
    public WebElement iban;
    @FindBy(xpath = "(//div[@class='ui fitted checkbox Checkbox'])[1]")
    public WebElement expediteFee;
    @FindBy(xpath = "(//div[@class='ui fitted checkbox Checkbox'])[1]")
    public WebElement withdrawTransferAggrement;
    @FindBy(xpath = "(//span[text()='Pay'])")
    public WebElement payTab;
    @FindBy(xpath = "(//span[text()='PAY'])[1]")
    public WebElement ffPayBtn;
    @FindBy(xpath = "(//div[contains(text(),'Pay someone new')])")
    public WebElement paySomeoneNewBtn;
    @FindBy(xpath = "(//input[@name='firstName'])")
    public WebElement firstName;
    @FindBy(xpath = "(//input[@name='lastName'])")
    public WebElement lastName;
    @FindBy(xpath = "(//input[@name='dateOfBirth'])")
    public WebElement dob;
    // @FindBy(xpath = "(//input[@type='text']//parent::div[@class='ui input'])[1]")
    @FindBy(xpath = "(//div[@class='ui input']//child::input[@type='text'])[1]")
    public WebElement paymentReason;
    @FindBy(xpath = "(//div[@class='ui input']//child::input[@type='text'])[2]")
    public WebElement paymentReference;
    @FindBy(xpath = "(//span[text()='PAY'])[2]")
    public WebElement businessPayBtn;
    @FindBy(xpath = "(//div[contains(text(),'Pay to new business')])")
    public WebElement paynewBusinessBtn;
    @FindBy(xpath = "(//input[@name='businessName'])")
    public WebElement businessName;
    @FindBy(xpath = "(//input[@name='registrationNumber'])")
    public WebElement busRegNumber;
    @FindBy(xpath = "(//span[text()='PAY'])[3]")
    public WebElement anotherMemberPayBtn;
    //FEE  Calculation
    @FindBy(xpath = "//span[contains(text(),'Sending amount')]")
    public WebElement sendingAmount;
    @FindBy(xpath = "//span[contains(text(),'Fee amount')]")
    public WebElement feeAmount;
    @FindBy(xpath = "//span[contains(text(),'Total Amount')]")
    public WebElement totalAmount;
    @FindBy(xpath = "//span[contains(text(),'Receiving amount')]")
    public WebElement recivingAmount;
    @FindBy(xpath = "//span[contains(text(),'Dollar') or contains(text(),'Yen') or contains(text(),'Sterling')or contains(text(),'Euro') or contains(text(),'Yuan')]")
    public WebElement walletCurrency;
    @FindBy(xpath = "//span[contains(text(),'1 ')][1]")
    public WebElement convRate;
    @FindBy(xpath = "//span[contains(text(),'Sending Amount')]")
    public WebElement sendAmt;
    @FindBy(xpath = "//span[contains(text(),'Transfer Fee')]")
    public WebElement transferFee;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/main/div/div/div/div/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div[16]/span")
    public WebElement receiveAmount;
    @FindBy(xpath = "(//input[@type='number'])[2]")
    public WebElement recAmtBox;

    public Accounts_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void withdrawTabClick() {
        withdrawTab.click();
    }

    public void addPersonalAccClick() {
        addPersonalAccBtn.click();
    }

    public void destinationBankCountry() throws InterruptedException {
        countryUS.click();
    }

    public void beneficiaryCurrencyClick() {
        currencyUSD.click();
    }

    public void nextBtnClick() {
        nextBtn.click();
    }

    public void withdrawBeneficiaryDetails() throws InterruptedException {
        countryUS.click();
        Thread.sleep(200);
        stateColorado.click();
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");
    }

    public void beneficiaryCLick() {
        click(withdrawExistingBeneficiary);
    }

    public void withdrawCheckBox() throws InterruptedException {
        expediteFee.click();
        Thread.sleep(3000);
        withdrawTransferAggrement.click();
    }

    public void payTabClick() {
        payTab.click();
    }

    public void ffPayBtnClick() {
        ffPayBtn.click();
    }

    public void paySomeoneNewBtnClick() {
        paySomeoneNewBtn.click();
    }

    public void payFriendorFamilyDetails() throws InterruptedException {
        firstName.sendKeys(Random_data.firstName());
        Thread.sleep(200);
        lastName.sendKeys(Random_data.lastName());
        Thread.sleep(200);
        click(dob);
        Thread.sleep(200);
        dob.sendKeys("02052000");
        Thread.sleep(200);
        click(countryUS);
        Thread.sleep(500);
        click(stateColorado);
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");

    }

    public void paymentReason() {
        paymentReason.sendKeys("Automation portal");
    }

    public void paymentRef() {
        paymentReference.sendKeys("Automation");

    }

    public void businessPayBtnClick() {
        businessPayBtn.click();
    }

    public void payNewBusinessClick() {
        paynewBusinessBtn.click();
    }

    public void payBusinessDetails() throws InterruptedException {
        businessName.sendKeys(Random_data.firstName());
        Thread.sleep(200);
        busRegNumber.sendKeys(Random_data.businessRegNum());
        Thread.sleep(200);
        click(countryUS);
        Thread.sleep(500);
        click(stateColorado);
        Thread.sleep(200);
        beneficiaryReference.sendKeys(Random_data.fullName());
        Thread.sleep(200);
        destinationBankName.sendKeys(Random_data.bankName());
        Thread.sleep(200);
        address.sendKeys(Random_data.address());
        Thread.sleep(200);
        destinationBankCity.sendKeys("Cansas");
        Thread.sleep(200);
        sortCode.sendKeys(Random_data.sortCode());
        Thread.sleep(200);
        accountNo.sendKeys(Random_data.bankAccNum());
        Thread.sleep(200);
        swiftCode.sendKeys("ESSEDE5F100");
        Thread.sleep(200);
        iban.sendKeys("US45154751915535805484966893");

    }

    public void anotherMemberPayBtnClick() {
        anotherMemberPayBtn.click();
    }

    public Boolean checkgraph() {
        return graph.isDisplayed();

    }

    public void localUSBankClick() {
        localUSBank.click();
    }

    public void intlNonUKBankClick() {
        intlNonUKBank.click();
    }
    public void localUKBankClick() {
        localUKBank.click();
    }
    public boolean localUSBankBeneficiaryCheck() {
        return localUSBankBeneficiary.isDisplayed();
    }

    public void cryptoClick() {
        crypto.click();
    }

    public void enterCryptoSendAmount() {
        cryptoSendAmount.sendKeys(".1");
    }

    public void checkBoxClick() throws InterruptedException {
        checkBox.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        checkBox.click();
       // checkBox.sendKeys(Keys.CONTROL+Keys.getKeyFromUnicode("W"));


    }

    public boolean cryptoSummaryCheck() {
        return cryptoSummary.isDisplayed();

    }

    public void accMenuClick() {
        accMenubtn.click();
    }

    public void usdWalletClick() {
        usdWallet.click();
    }
    public void euroAccClcik() {
        euroAcc.click();
    }
    public void euroWalletClick() {
        euroWallet.click();
    }
    public void gbpWalletClick() {
        gbpWallet.click();
    }
    public void jpyWalletClick() {
        jpyWallet.click();
    }
    public void cnyWalletClick() {
        cnyWallet.click();
    }
    public void phpWalletClick() {
        phpWallet.click();
    }

    public void moveTabClick() {
        moveTab.click();
    }

    public void benDropdownClick() {
        selectBeneficiaryDropdown.click();
    }

    public void jpyAccClcik() {
        jpyAcc.click();
    }
    public void cnyAccClcik() {
        cnyAcc.click();
    }
    public void usdAccClcik() {
        usdAcc.click();
    }

    public void enterSendingAmount() {
        sendAmount.sendKeys(moveAmount);
    }

    public void confirmBtnClick() {
        confirmBtn.sendKeys(Keys.PAGE_DOWN);
        confirmBtn.click();
    }

    public void enterSecretCode()throws Exception {
        String Otp = BaseData.BaseOtp();
        System.out.println("Move: " + Otp);
        secretCode.sendKeys(Otp);
    }

    public boolean checkSuccessMsg() {
        return sucessMsg.isDisplayed();
    }

    public void okBtnClick() {
        okBtn.click();
    }

    public boolean checkDetailsTab() {
        return detailsTab.isDisplayed();
    }

    public void depositTabClick() {
        depositTab.click();
    }

    public void fromDropdwnClick() {
        fromDropdwn.click();
    }

    public void debitCardClick() {
        debitCard.click();
    }

    public void enterloadAmount(String amount) {
        loadAmount.sendKeys(amount);
    }

    public void aggrementClick() {
        trAggrement.click();
    }

    public boolean checkDepositSummary() {
        API.CurrencyExchangeRate cr = new API.CurrencyExchangeRate();
        cr.rates();
        confirmBtn.sendKeys(Keys.PAGE_DOWN);
        DecimalFormat df = new DecimalFormat("#.##");
        String sAmt = sendingAmount.getText();
        String fAmt = feeAmount.getText();
        String tAmt = totalAmount.getText();
        String rAmt = recivingAmount.getText();
        System.out.println("Given " + sAmt);
        System.out.println("Given " + fAmt);
        System.out.println("Given " + tAmt);
        System.out.println("Given " + rAmt);
        String[] p1 = {sAmt.replaceAll("[\\s,]+", "").substring(15), fAmt.replaceAll("[\\s,]+", "").substring(12), tAmt.replaceAll("[\\s,]+", "").substring(13), rAmt.replaceAll("[\\s,]+", "").substring(17)};
        String loadWalletCurrency = sAmt.replaceAll("[\\s,]+", "").substring(14, 15);
        double sendingAmount = Double.valueOf(p1[0]);
        double givenFee = Double.valueOf(p1[1]);
        double givenTotal = Double.valueOf(p1[2]);
        double givenReceiveAmount = Double.valueOf(p1[3]);
        if (loadWalletCurrency.contains("$")) {
            System.out.println("In USD Wallet");
            double calculatedFee = Double.valueOf(df.format(sendingAmount * clRate*ToUSD));
            double calculatedTotal = Double.valueOf(sendingAmount + calculatedFee);
            System.out.println("Calculated Fee: " + calculatedFee);
            System.out.println("Calculated Total Amount: " + calculatedTotal);
            System.out.println("Diff Given and Calculated Fee: " + Math.abs(Double.valueOf(df.format(calculatedFee - givenFee))));
            System.out.println("Diff Given and Calculated Total: " + Math.abs(Double.valueOf(df.format(givenTotal - calculatedTotal))));
            System.out.println();

            if ((Math.abs(calculatedFee - givenFee)) <= 7 && (Math.abs(givenTotal - calculatedTotal)) <= 7 && sendingAmount == givenReceiveAmount) {
                return recivingAmount.isDisplayed();
            } else {
                return false;
            }
        } else if (loadWalletCurrency.contains("€")) {
            System.out.println("In EURO Wallet");
            double calculatedFee = Double.valueOf(df.format(sendingAmount * clRate * ToEuro));
            double calculatedTotal = Double.valueOf(sendingAmount + calculatedFee);
            System.out.println("Calculated Fee: " + calculatedFee);
            System.out.println("Calculated Total Amount: " + calculatedTotal);
            System.out.println("Diff Given and Calculated Fee: " + Math.abs(Double.valueOf(df.format(calculatedFee - givenFee))));
            System.out.println("Diff Given and Calculated Total: " + Math.abs(Double.valueOf(df.format(givenTotal - calculatedTotal))));
            System.out.println();

            if ((Math.abs(calculatedFee - givenFee)) <= 7 && (Math.abs(givenTotal - calculatedTotal)) <= 7 && sendingAmount == givenReceiveAmount) {
                return recivingAmount.isDisplayed();
            } else {
                return false;
            }
        } else if (loadWalletCurrency.contains("£")) {
            System.out.println("In GBP Wallet");
            double calculatedFee = Double.valueOf(df.format(sendingAmount * clRate * ToGBP));
            double calculatedTotal = Double.valueOf(sendingAmount + calculatedFee);
            System.out.println("Calculated Fee: " + calculatedFee);
            System.out.println("Calculated Total Amount: " + calculatedTotal);
            System.out.println("Diff Given and Calculated Fee: " + Math.abs(Double.valueOf(df.format(calculatedFee - givenFee))));
            System.out.println("Diff Given and Calculated Total: " + Math.abs(Double.valueOf(df.format(givenTotal - calculatedTotal))));
            System.out.println();

            if ((Math.abs(calculatedFee - givenFee)) <= 7 && (Math.abs(givenTotal - calculatedTotal)) <= 7 && sendingAmount == givenReceiveAmount) {
                return recivingAmount.isDisplayed();
            } else {
                return false;
            }
        } else if (loadWalletCurrency.contains("¥") && walletCurrency.getText().contains("Yuan")) {
            System.out.println("In CNY Wallet");
            double calculatedFee = Double.valueOf(df.format(sendingAmount * clRate * ToCNY));
            double calculatedTotal = Double.valueOf(sendingAmount + calculatedFee);
            System.out.println("Calculated Fee: " + calculatedFee);
            System.out.println("Calculated Total Amount: " + calculatedTotal);
            System.out.println("Diff Given and Calculated Fee: " + Math.abs(Double.valueOf(df.format(calculatedFee - givenFee))));
            System.out.println("Diff Given and Calculated Total: " + Math.abs(Double.valueOf(df.format(givenTotal - calculatedTotal))));
            System.out.println();

            if ((Math.abs(calculatedFee - givenFee)) <= 250 && (Math.abs(givenTotal - calculatedTotal)) <= 250 && sendingAmount == givenReceiveAmount) {
                return recivingAmount.isDisplayed();
            } else {
                return false;
            }
        } else if (loadWalletCurrency.contains("¥") && walletCurrency.getText().contains("Yen")) {
            System.out.println("In JPY Wallet");
            double calculatedFee = Double.valueOf(df.format(sendingAmount * clRate * ToJPY));
            double calculatedTotal = Double.valueOf(sendingAmount + calculatedFee);
            System.out.println("Calculated Fee: " + calculatedFee);
            System.out.println("Calculated Total Amount: " + calculatedTotal);
            System.out.println("Diff Given and Calculated Fee: " + Math.abs(Double.valueOf(df.format(calculatedFee - givenFee))));
            System.out.println("Diff Given and Calculated Total: " + Math.abs(Double.valueOf(df.format(givenTotal - calculatedTotal))));
            System.out.println();

            if ((Math.abs(calculatedFee - givenFee)) <= 4000 && (Math.abs(givenTotal - calculatedTotal)) <= 4000 && sendingAmount == givenReceiveAmount) {
                return recivingAmount.isDisplayed();
            } else {
                return false;
            }

        } else return false;

    }

    public boolean checkMoveSummary(){
        String rate = convRate.getText();
        String sAmt = sendAmt.getText();
        String rAmt = receiveAmount.getText();
        String tAmt = totalAmount.getText();
        double conversionRate = Double.valueOf(rate.replaceAll("\\s", "").substring(5).replaceAll("[a-zA-Z]", ""));
        double sendingAmount = Math.floor(Double.valueOf(sAmt.replaceAll("[\\s,]+", "").substring(15)));
        double amountoReceive = Math.floor(Double.valueOf(rAmt.replaceAll("[\\s,]+", "").substring(1)));
        double totalAmount = Math.floor(Double.valueOf(tAmt.replaceAll("[\\s,]+", "").substring(13)));
        System.out.println("Summary Rate: " +rate);
        System.out.println("Summary Sending Amount: "+ sendingAmount);
        System.out.println("Summary Receiving Amount: "+ amountoReceive);
        System.out.println("Summary Total Amount: "+ totalAmount);
        System.out.println("Calculated Receiving Amount: "+ Double.valueOf(moveAmount)*conversionRate);
        System.out.println("Diff of Receiving Amounts: "+ Math.abs(Double.valueOf(moveAmount)*conversionRate-amountoReceive));

        if (Math.abs(Double.valueOf(moveAmount)*conversionRate-amountoReceive)<=5 && Double.valueOf(totalAmount)==totalAmount ){
            return true;
        }
        else {
            return  false;
        }

    }


    public boolean checkExpeditSummary() {
        return expeditSummary.isDisplayed();
    }

    public boolean checkLoadSuccessMsg() {
        return loadSucessMsg.isDisplayed();
    }

    public boolean sucessMsgwithLoader(){
        return sucessMsgUS.isDisplayed();

    }
    public void clickOKbtn() {
        okBtn.click();
    }

    public boolean checkAccountsTab() {
        return accountsTabUsd.isDisplayed();

    }

    public void paymentTabClick() {
        paymentTabBtn.click();
    }

    public boolean paymentPage() {
        return paymentTabPage.isDisplayed();
    }

    public void memberPayBtnClick() {
        memberPayBtn.click();
    }

    public void beneficiarySelect() {
        beneficiary.click();
    }

    public void enterPaymentRef() {
        paymentRef.sendKeys("Automation");
    }

    public boolean checkTransferSummary() {
       return trnsSummary.isDisplayed();
    }

    public void makePaymentClick() throws InterruptedException {
        makePayBtn.click();
        Thread.sleep(5000);
    }

    public void toIndividual() {
        individual.click();
    }

    public void newBtnClick() {
        newRecipient.click();
    }

    public void recipientDetails() throws InterruptedException {
        fName.sendKeys(Random_data.firstName());
        Thread.sleep(300);
        lName.sendKeys(Random_data.lastName());
        Thread.sleep(300);
        click(countryDropdown);
        Thread.sleep(1500);
        click(america);
        Thread.sleep(300);
        addressLine.sendKeys(Random_data.address());
        Thread.sleep(300);
        city.sendKeys("Anchorage");
        Thread.sleep(300);
        click(stateDropdown);
        Thread.sleep(1500);
        click(recipientState);
        Thread.sleep(300);
        postCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        email.sendKeys(Random_data.email());
        Thread.sleep(300);
        phoneDropdown.click();
        Thread.sleep(500);
        phnSearchBox.sendKeys("us");
        Thread.sleep(500);
        phnUS.click();
        phone.sendKeys("20255300169");
        Thread.sleep(300);
    }

    public void bankDetails() throws InterruptedException {
        click(currencyDropdown);
        Thread.sleep(1000);
        click(usd);
        Thread.sleep(300);
        click(bankCountry);
        Thread.sleep(1000);
        click(america);
        Thread.sleep(300);
        bankName.sendKeys("Bank of America");
        Thread.sleep(300);
        bankAddress.sendKeys("365 old street");
        Thread.sleep(300);
        bankCity.sendKeys("Cansas");
        Thread.sleep(300);
        click(bankStateDropdown);
        Thread.sleep(1500);
        click(bankState);
        Thread.sleep(300);
        bankPostCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        bankRountingNum.sendKeys("233394133");
        Thread.sleep(300);
        bankAccNum.sendKeys(Random_data.bankAccNum());
        Thread.sleep(300);
        bankAccName.sendKeys(Random_data.fullName());
        Thread.sleep(300);
    }


    public void amount() throws InterruptedException {
        payAmount.sendKeys("20");
        Thread.sleep(3000);
    }

    public void whenToPay() {
        click(now);
    }

    public void references() throws InterruptedException {
        payRef.sendKeys("Test Automation");
        Thread.sleep(300);
        paymentReson.sendKeys("Payment Automation");
        Thread.sleep(300);
        paymentNote.sendKeys("Make Payment Automation Note");
        Thread.sleep(300);
    }

    public void payClick() throws InterruptedException {
        payBtn.click();
        Thread.sleep(5000);
    }

    public boolean checkReqAcceptMsg() throws InterruptedException {
        boolean msg = reqAcceptmsg.isDisplayed();
        Thread.sleep(300);
        okBtn.click();
        return msg;
    }

    public void businessClick() {
        business.click();
    }

    public void recipientBusinessDetails() throws InterruptedException {
        busName.sendKeys(Random_data.businessName());
        Thread.sleep(300);
        busRegNum.sendKeys(Random_data.businessRegNum());
        Thread.sleep(300);
        click(busCountry);
        Thread.sleep(1500);
        click(america);
        Thread.sleep(300);
        addressLine.sendKeys(Random_data.address());
        Thread.sleep(300);
        city.sendKeys("Anchorage");
        Thread.sleep(300);
        click(stateDropdown);
        Thread.sleep(1500);
        click(recipientState);
        Thread.sleep(300);
        postCode.sendKeys(Random_data.postCode());
        Thread.sleep(300);
        email.sendKeys(Random_data.email());
        Thread.sleep(300);
        phoneDropdown.click();
        Thread.sleep(500);
        phnSearchBox.sendKeys("us");
        Thread.sleep(500);
        phnUS.click();
        phone.sendKeys("20255300169");
        Thread.sleep(300);
    }

    public void clickExisting() {
        existing.click();
    }

    public void selectRecipients() {
        select.click();
    }

    public void transactionsTabClick() {
        transactionsTab.click();
    }

    public boolean pendingTransection() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Calendar cal = Calendar.getInstance();
        String dt = dateFormat.format(cal.getTime());
        String str = firstPTransaction.getText();
        System.out.println("get text: " + str);
        System.out.println("date: " + dt);
        if (firstPTransaction.getText().trim().equals(dt.trim())) {
            return firstPTransaction.isDisplayed();
        }
        return false;
    }
    public boolean noTranscetionLabelCheck(){
        return noTransectionLabel.isDisplayed();
    }

    public boolean completedTransection() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
        Calendar cal = Calendar.getInstance();
        String dt = dateFormat.format(cal.getTime());
        String str = firstCTransactions.getText();
        System.out.println("get text: " + str);
        System.out.println("date: " + dt);
        if (firstCTransactions.getText().trim().equals(dt.trim())) {
            return firstCTransactions.isDisplayed();
        }
        return false;
    }
    public void statementsTabBtnClick(){
        statementsTabBtn.click();
    }
    public boolean downloadBtnCheck(){
            return downloadBtn.isDisplayed();
    }

    public void downloadBtnClick(){
        downloadBtn.click();
    }

}
