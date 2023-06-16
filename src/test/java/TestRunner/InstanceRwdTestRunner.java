package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/InstantRewards/InstanceRewards.feature",
        glue = "StepDefinations",tags = "@tag1 or @tag2 or @tag3",
        plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})


public class InstanceRwdTestRunner {
}

