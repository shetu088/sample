package Testing.AjioTest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\SHRESSIN\\eclipse-workspace\\AjioTest\\src\\main\\java\\feature\\ajio.feature" ,
glue="stepdef" , monochrome = true , plugin = {"pretty", "html:target/index.html"})
public class AjioTest {

}
