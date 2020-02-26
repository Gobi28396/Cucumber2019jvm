package org.steps;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.*;

public class Report {
	public static void reports(String stg) {
	File f=new File("D:\\NewSelenium42\\Cucumber\\Reports\\JVM");
	Configuration c= new Configuration(f, "goibihhbj");
	
	c.addClassifications("browser", "chrome");
	c.addClassifications("version", "78");
	c.addClassifications("os", "windows");

	c.addClassifications("version", "10");
	c.addClassifications("sprint", "3");
	List<String> l=new ArrayList<String>();
	l.add(stg);
	ReportBuilder r=new ReportBuilder(l, c);
	r.generateReports();
	
	
	
	}
}
