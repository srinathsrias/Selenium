package org.asos;

import java.util.List;
import java.util.NoSuchElementException;

import org.asos.pom.Log_pom;
import org.asos.pom.Reg_pom;
import org.test.parent.BaseClass;

import io.cucumber.java.en.*;

public class Registraion_Asos extends BaseClass {

	Reg_pom r;
	static Log_pom l;

	@Given("The User should be in the Home page of the Application.")
	public void the_user_should_be_in_the_home_page_of_the_application() {
		r = new Reg_pom();
		l = new Log_pom();
	}

	@Then("The User should place the cursor on the account icon.")
	public void the_user_should_place_the_cursor_on_the_account_icon() {

		moveToElement(r.getIcon());

	}

	@Then("The User should click the {string} button.")
	public void the_user_should_click_the_button(String btn) throws InterruptedException {

		Thread.sleep(2000);
		switch (btn) {
		case "join":
			click(r.getJoin());
			break;
		case "Signin":
			click(l.getSign_In());
			break;
		default:
			throw new NoSuchElementException();
		}

		// Signin join
	}

	@Then("The User should enter all the given basic details.")
	public void the_user_should_enter_all_the_given_basic_details(io.cucumber.datatable.DataTable data) {
		List<String> l = data.asList();
		sendKeys(r.getEmail(), l.get(0));
		sendKeys(r.getFirstName(), l.get(1));
		sendKeys(r.getLastName(), l.get(2));
		sendKeys(r.getPassword(), l.get(3));
		selectByValue(r.getBirthDay(), l.get(4));
		selectByValue(r.getBirthMonth(), l.get(5));
		selectByValue(r.getBirthYear(), l.get(6));

	}

	@Then("The User should click join asos button.")
	public void the_user_should_click_join_asos_button() {
		click(r.getRegister());

	}

	@Then("The User need to click I am not robot button.")
	public void the_user_need_to_click_i_am_not_robot_button() {
		click(r.getRegister_robot());

	}

	@Then("The User will navigate to my-account page")
	public void the_user_will_navigate_to_my_account_page() {
		webwait(30, "my-account");
	}

}
