package runner;


import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        // tags = "",
        features = "src/test/resources/features",
        glue = "steps",
        monochrome = true,
       // tags={"@sanity,@functional"}
        tags="@sanity",
        plugin = {"pretty"}

)
public class testrunner extends CustomAbstractTestNGCucumberTests {

    @Override
    @DataProvider()
    public Object[][] scenarios() {

        return super.scenarios();
    }

    }


