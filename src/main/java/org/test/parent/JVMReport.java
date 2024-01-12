package org.test.parent;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport extends BaseClass{
	public static void jvmReportGenerator(String json) {
		File f= new File(System.getProperty("user.dir")+"/src/test/resources/Reports/JVM_Reports/Asos_Report");
		Configuration c=new Configuration(f, "Asos");
		c.addClassifications("Company Name", "Phoenix.Pvt.Ltd");
		c.addClassifications("Browser", "Windows 10");
		c.addClassifications("Tester", "Srinath");
		c.addClassifications("Sprint", "20");
		
		List<String> jsonFiles=new LinkedList<String>();
		jsonFiles.add(json);
		ReportBuilder r= new ReportBuilder(jsonFiles, c);
		r.generateReports();
	}
	

}
