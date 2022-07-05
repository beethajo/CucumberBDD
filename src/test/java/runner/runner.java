package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "",
        features = "src/test/resources/features/login.feature",
        glue = "steps.MyStepdefs"
)
public class runner extends AbstractTestNGCucumberTests {
}
