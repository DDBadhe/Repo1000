package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "E:\\WORKSPACE\\UpdatedClientAssignment\\src\\test\\resources\\Features\\Exchange_2_1.feature",
glue = {"RateAPI_2_1"})
public class TestRunner {

}
