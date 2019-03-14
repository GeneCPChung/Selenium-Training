package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {

	@Test
	public void WebloginCarLoan() {

		// selenium
		System.out.println("weblogincar");

	}
	
	@BeforeMethod
	public void beforeevery() {
		System.out.println(" I will execute before every test method in day 3 class");
	}

	@Test
	public void MobileLogincarLoan() {
		// appium
		System.out.println("Mobillogincar");
	}
	
	@BeforeSuite
	public void Bfsuite() {
		System.out.println(" I am no. 1");
	}
	
	@Test
	public void MobilesignincarLoan() {
		// appium
		System.out.println("Mobil SIGNIN");
	}
	
	@Test
	public void MobilesingoutcarLoan() {
		// appium
		System.out.println("Mobil SIGNOUT");
	}

	@Test
	public void LoginAPIcarLoan() {
		System.out.println("APIlogincar");
	}

}
