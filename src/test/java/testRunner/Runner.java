package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//Features",
    glue="stepDefinitions",
			plugin= {"pretty", "html:reports/myreport.html", 
					  "rerun:target/rerun.txt" }  
)

public class Runner {

}
