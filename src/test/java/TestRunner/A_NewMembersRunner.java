package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/A.NewMembers/NewMembers.feature",glue = "StepDefinations",
        tags="@card_common or @card_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class A_NewMembersRunner {
}

/*
***Card purchase and Activation using debit card
1. For fully new US member with 0 balance ----> @card_common or @card_us
2. For fully new Non-US member with 0 balance ----> @card_common or @card_non_us

****Card purchase and Activation using Wallet
1. For fully new both US and Non-US member with 0 balance ---->  @accounts

    @topup_us           -----> Popup Topup for US members
    @topup_non_us       -----> Popup Topup for Non-US members
    @card_common        -----> Virtual card Purchase using Debit card for both US & Non-US Members
    @card_us            -----> Virtual card Activation using Debit card for US Members
    @card_non_us        -----> Virtual card Activation using Debit card for Non-US Members
    @accounts           -----> All 3 Virtual card Purchase and Activation using Wallet
    @beneficiary        -----> Beneficiary creation for Member to Member Transfer.(Need valid Wallet Number. Can change from feature file)
    @activate           -----> Physical card activate (Need to change Last 4 Digits of testing Account. Can change from feature file)

*/
