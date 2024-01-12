package org.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="@src/test/resources/Reports/Failed_Scenarios/asos.txt",glue="org.asos")
public class Test_Rerunner extends AbstractTestNGCucumberTests{

}
