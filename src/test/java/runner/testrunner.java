package runner;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.plugin.event.Node;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.xml.XmlSuite;

import java.util.Arrays;

@CucumberOptions(
        // tags = "",
        features = "src/test/resources/features/login.feature",
        glue = "steps"
)
public class testrunner extends CustomAbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {

        return super.scenarios();
    }

    }


