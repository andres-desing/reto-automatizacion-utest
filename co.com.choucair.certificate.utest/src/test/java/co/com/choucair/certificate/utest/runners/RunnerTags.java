package co.com.choucair.certificate.utest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/join.feature",
        tags = "@EscenarioHU001",
        glue = "co.com.choucair.certificate.utest.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RunnerTags {
}
