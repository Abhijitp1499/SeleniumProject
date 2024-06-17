package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void TestNGDemo1() {

		System.out.println("Hello");
	}

	@AfterTest
	public void TestNGDemo2() {

		System.out.println("AfterTest");
	}
}
