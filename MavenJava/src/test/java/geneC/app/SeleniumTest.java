package geneC.app;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testng xml file from Maven
	//how to execute all test cases from Test folder - mvn test
	
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
	}
	
	@Test
	public void ElementsUI() {
		System.out.println("ElementsUI");
	}
	
}
