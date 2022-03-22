package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.LibGlobal;

public class SelectHotel extends LibGlobal {

	@FindBy(xpath="//td[@class='login_title']")
	private WebElement textSelectHotel;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnRadio;
	
	@FindBy(id="continue")
	private WebElement btnContinue;

	public WebElement getTextSelectHotel() {
		return textSelectHotel;
	}

	public WebElement getBtnLogin() {
		return btnRadio;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void selectHotel() {

		click(getBtnContinue());
		click(getBtnContinue());
	}
	
	public void verifySelectHotel(String expectedValue) {
		Assert.assertEquals("Verify select hotel text is displayes", expectedValue);
		getText(getBtnContinue());
	}
}
