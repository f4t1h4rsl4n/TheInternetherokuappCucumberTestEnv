import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\artem\\IdeaProjects\\theinternetherokuappTestProject\\src\\main\\java\\features\\fate.feature",
        glue = {"stepdefinition"},
        format = {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
        monochrome = true,
        dryRun = false,
        strict = true
)
public class TestRunner {
}
