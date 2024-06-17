package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	@Before("@NetBanking")
	public void netBankingSetup() {

		System.out.println("*************************");
		System.out.println("netBankingSetup Entries");
	}

	@Before("@Mortgage")
	public void mortgageSetup() {
		System.out.println("mortgageSetup Entries");
	}

	@After
	public void tearDown() {
		System.out.println("clear up entries");
	}

}

//Before-Background-Scenario-After