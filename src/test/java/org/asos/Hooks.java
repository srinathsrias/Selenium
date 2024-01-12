package org.asos;

import java.io.IOException;

import org.test.parent.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{
	@Before
	public void beforeScenarios() {
		browserLaunch("chrome");
		urlLaunch("https://www.asos.com/");
		time(20);
	}
	@After
	public void afterScenario(Scenario sc) throws IOException, InterruptedException {
		String name = sc.getName();
		if(sc.isFailed()) {
			takeScreenShot("Asos", name);
		}
		else {
			System.out.println("==============Successful==============");

		}
		Thread.sleep(2000);
		quit();
	}
}
