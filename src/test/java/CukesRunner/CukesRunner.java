package CukesRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        dryRun = false,
        tags = {"@wip"}
)
public class CukesRunner {
}
