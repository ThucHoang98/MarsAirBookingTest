package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        glue = { "com.Automation" },
        plugin = {
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        features = "src/test/resources/features")
public class TestNGCucumberRunner extends AbstractTestNGCucumberTests {

}