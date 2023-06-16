package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",glue = "StepDefinations",

        tags = "@topup_non_us or @card_common or @card_non_us or @beneficiary or @activate or @USD_non_us or @GBP_non_us or @JPY_non_us or @CNY_non_us or @USD_common or @GBP_common or @JPY_common or @CNY_common or @common or @tagReward or @settings or  @logout",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true)


public class FullTestRunner {
}
/*
tags = "@topup_us or @Deposit_us or @card_common or @card_us",
@USD_us or @EURO_us or @GBP_us or @JPY_us or @CNY_us or @USD_common or @EURO_common or @GBP_common or @JPY_common or @CNY_common or @common or @clubswan_us or @tagReward or @tagShopping or @tagShopping or @settings
1. For us members Clubswan tags: @topup_us or @accounts or @beneficiary or @activate or @USD_us or @EURO_us or @GBP_us or @JPY_us or @CNY_us or @USD_common or @EURO_common or @GBP_common or @JPY_common or @CNY_common or @common or @topup_us or @tagReward or @tagShopping

2. For non-us members : @topup_non_us or @card_common or @card_non_us or @beneficiary or @activate or @USD_non_us or @EURO_non_us or @GBP_non_us or @JPY_non_us or @CNY_non_us or @USD_common or @EURO_common or @GBP_common or @JPY_common or @CNY_common or @common or @tagReward or @tagShopping

3. For Aure @USD_us or @EURO_us or @GBP_us or @USD_common or @EURO_common or @GBP_common or @common or @tagReward or @logout.


@USD_common  --->  Common USD wallet features for both US and Non-US brands
@EURO_common --->  Common EURO wallet features for both US and Non-US brands
@GBP_common  --->  Common GBP wallet features for both US and Non-US brands
@JPY_common  --->  Common JPY wallet features for both US and Non-US brands
@CNY_common  --->  Common CNY wallet features for both US and Non-US brands

@JPY_cs      --->  Common JPY wallet features for both US and Non-US brands
@CNY_cs      --->  Common CNY wallet features for both US and Non-US brands

@USD_us     --->  USD wallet features for only US brands
@EURO_us    --->  EURO wallet features for only US brands
@GBP_us     --->  GBP wallet features for only US brands
@JPY_us     --->  JPY wallet features for only US brands
@CNY_us     --->  CNY wallet features for only US brands

@USD_non_us     --->  USD wallet features for only Non-US brands
@EURO_non_us    --->  EURO wallet features for only Non-US brands
@GBP_non_us     --->  GBP wallet features for only Non-US brands
@JPY_non_us     --->  JPY wallet features for only Non-US brands
@CNY_non_us     --->  CNY wallet features for only Non-US brands

@PHP_non_us     --->  PHP wallet features for only Non-US brands
@PHP_common     --->  PHP wallet features for only Non-US brands

*/
