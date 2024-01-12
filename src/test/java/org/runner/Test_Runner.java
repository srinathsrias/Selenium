package org.runner;

import org.test.parent.JVMReport;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features/Asos", 
					glue = "org.asos", 
					monochrome = true,
					dryRun = false, 
					tags="@log",
					plugin = {
							"pretty", "html:src/test/resources/Reports/HTML_Reports/asos.html",
							"json:src/test/resources/Reports/Json_Reports/asos.json",
							"junit:src/test/resources/Reports/Junit_Reports/asos.junit",
							"rerun:src/test/resources/Reports/Failed_Scenarios/asos.txt"

})
public class Test_Runner extends AbstractTestNGCucumberTests {
	
	
	@AfterSuite
	private void report() {
		JVMReport.jvmReportGenerator("src/test/resources/Reports/Json_Reports/asos.json");
	}

	@DataProvider(parallel = false)
	@Override
	public Object[][] scenarios() {

		return super.scenarios();
	}
}
