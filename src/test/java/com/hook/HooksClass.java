package com.hook;

import com.base.LibGlobal;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal{

	@Before
	public void beforeScenario() {
		systemConfig();
		openUrl("https://adactinhotelapp.com/");
	}
	@After
	public void afterScenario() {
		closeBrowser();
	}
}
