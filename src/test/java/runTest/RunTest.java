package runTest;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
                snippets = CucumberOptions.SnippetType.CAMELCASE,
                plugin = {"pretty", "json:reports/cucumber.json"},
                features = {"./src/test/resources/features/"},
                glue = {"base.framework.steps", "base.framework.configuration"},
                tags = "@smoke_test")

public class RunTest {
}
