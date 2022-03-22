package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.LibGlobal;

public class Login extends LibGlobal {
	@FindBy(id="username")
	private WebElement txtUsername;

	@FindBy(id="password")
	private WebElement txtPassword;

	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void login(String userName, String password) {
		type(getTxtUsername(), userName);
		type(getTxtPassword(), password);
		click(getBtnLogin());
	}
}
