package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day6 {

	@BeforeClass
	public void FifthMethod() {

		System.out.println("Before Class FifthMethod");
	}

	@Test
	public void SecondMethod() {

		System.out.println("SecondMethod");
	}

	@Test
	public void ThirdMethod2() {

		System.out.println("ThirdMethod");
	}
	@Test
	public void FourthMethod() {

		System.out.println("FourthMethod");
	}
	@AfterClass
	public void FirstMethod() {

		System.out.println("After Class FirstMethod");
	}
}
