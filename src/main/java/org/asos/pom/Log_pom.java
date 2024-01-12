package org.asos.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class Log_pom extends BaseClass {
	public Log_pom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Sign In")
	private WebElement Sign_In;
	@FindBy(id="EmailAddress")
	private WebElement EmailAddress;
	@FindBy(id="Password")
	private WebElement Password;
	@FindBy(id="signin")
	private WebElement signin_btn;
	@FindBy(id="signin")
	private WebElement signin_robot;
	public WebElement getSign_In() {
		return Sign_In;
	}
	public WebElement getEmailAddress() {
		return EmailAddress;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSignin_btn() {
		return signin_btn;
	}
	public WebElement getSignin_robot() {
		return signin_robot;
	}

}
