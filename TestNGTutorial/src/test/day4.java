package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	
	
	@Parameters({ "URL" })
	@Test
	public void WebloginHomeLoan(String uname) {

		// selenium
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);

	}

	@Test(groups=("Smoke"))
	public void MobileLoginHomeLoan() {
		// appium
		System.out.println("Mobilloginhome");
	}

	@Test
	public void LoginAPIHomeLoan() {
		System.out.println("APIloginhome");
	}

}
