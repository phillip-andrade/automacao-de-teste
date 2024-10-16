import org.junit.ClassRule;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import util.TestRule;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features",
		tags = "@run",
		glue = {""}
		)
public class MainCucumber {

	@ClassRule
	public static TestRule testRule = new TestRule();

}

