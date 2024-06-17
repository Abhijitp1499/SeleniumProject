package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Day4 {

	@Test
	public void WebLoginHomeLoan() {

		System.out.println("Web Login HomeLoan ");
	}

	@Test
	public void MobileLoginHomeLoan() {

		System.out.println("Mobile Login HomeLoan ");
	}

	@Test
	public void APILoginHomeLoan() {

		System.out.println("API Login HomeLoan ");
	}

	@Test
	public void APILogoutHomeLoan() {

		System.out.println("API Logout HomeLoan ");
	}

	@AfterMethod
	public void AfterMethod() {

		System.out.println("AfterMethod Execute after every method in day4 class");
	}

}
