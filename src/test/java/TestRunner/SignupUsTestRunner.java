package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SignUp/SignUp.feature",glue = "StepDefinations",
        tags="@vip",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
// tags="@starterlite or @starter or @premier or @vip or @chairman",
public class SignupUsTestRunner {
}
