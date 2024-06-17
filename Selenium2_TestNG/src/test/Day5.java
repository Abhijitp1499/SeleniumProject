package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day5 {

	@Test
	public void FirstMethod() {

		System.out.println("FirstMethod");
	}

	@Test
	public void SecondMethod() {

		System.out.println("SecondMethod");
	}

	@BeforeMethod
	public void ThirdMethod() {

		System.out.println("ThirdMethod Execute before each class in day5 class");
	}
}
