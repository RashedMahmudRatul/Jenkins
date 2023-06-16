package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Accounts/Accounts.feature",glue = "StepDefinations",
        tags="@JPY_us or @CNY_us",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class AccountsTestRunner {
}

/*::::::::::::::::::::::::::::::::::::Note for tags::::::::::::::::::::::::::::::::::

1. For non us users: @USD_common or @EURO_common or @GBP_common or @CNY_common or @JPY_common or @USD_non_us or @EURO_non_us or @GBP_non_us or @JPY_non_us or @CNY_non_us
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








