package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day3 {
	@AfterSuite
	public void AfterSuite1() {

		System.out.println("AfterSuite1 I am No 1 from last");
	}

	@Test
	public void WebLoginCarLoan() {

		System.out.println("Web Login CarLoan");
	}

	@Test
	public void MobileLoginCarLoan() {

		System.out.println("Mobile Login CarLoan");
	}

	@Test
	public void APILoginCarLoan() {

		System.out.println("API Login CarLoan");
	}

	@Test
	public void Regular1() {

		System.out.println("Regular1");
	}

	@BeforeSuite
	public void BeforeSuite1() {

		System.out.println("Before Suite 1 I am No 1");
	}

	@Test
	public void Regular2() {

		System.out.println("Regular2");
	}

	@Test
	public void Regular3() {

		System.out.println("Regular3");
	}
}
