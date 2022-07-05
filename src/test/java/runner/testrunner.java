package runner;


import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        // tags = "",
        features = "src/test/resources/features/login.feature",
        glue = "steps",
        monochrome = true
)
public class testrunner extends CustomAbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {

        return super.scenarios();
    }

    }


