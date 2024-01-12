package org.asos.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.parent.BaseClass;

public class Reg_pom extends BaseClass {
	public Reg_pom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="myAccountDropdown")
	private WebElement icon;
	@FindBy(linkText="Join")
	private WebElement Join;
	@FindBy(id="Email")
	private WebElement Email;
	@FindBy(id="FirstName")
	private WebElement FirstName;
	@FindBy(id="LastName")
	private WebElement LastName;
	@FindBy(id="Password")
	private WebElement Password;
	@FindBy(id="BirthDay")
	private WebElement BirthDay;
	@FindBy(id="BirthMonth")
	private WebElement BirthMonth;
	@FindBy(id="BirthYear")
	private WebElement BirthYear;
	@FindBy(id="register")
	private WebElement register;
	@FindBy(id="register")
	private WebElement register_robot;
	public WebElement getIcon() {
		return icon;
	}
	public WebElement getJoin() {
		return Join;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getBirthDay() {
		return BirthDay;
	}
	public WebElement getBirthMonth() {
		return BirthMonth;
	}
	public WebElement getBirthYear() {
		return BirthYear;
	}
	public WebElement getRegister() {
		return register;
	}
	public WebElement getRegister_robot() {
		return register_robot;
	}

}
