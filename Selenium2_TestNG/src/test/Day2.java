package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class Day2 {

	public void TestNGDemo3() {

		System.out.println("TestNGDemo3");
	}

	@BeforeTest
	public void TestNGDemo4() {

		System.out.println("BeforeTest");
	}

}
