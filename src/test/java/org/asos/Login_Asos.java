package org.asos;

import java.util.List;

import org.test.parent.BaseClass;

import io.cucumber.java.en.Then;

public class Login_Asos extends BaseClass {
	@Then("The User should enter all the given details.")
	public void the_user_should_enter_all_the_given_details(io.cucumber.datatable.DataTable data) {
		List<String> l = data.asList();
		sendKeys(Registraion_Asos.l.getEmailAddress(), l.get(0));
		sendKeys(Registraion_Asos.l.getPassword(), l.get(1));
		
	}

	@Then("The User should click signin asos button.")
	public void the_user_should_click_signin_asos_button() {
		click(Registraion_Asos.l.getSignin_btn());
		
	}

	@Then("The User will navigate to men page")
	public void the_user_will_navigate_to_men_page() {
		webwait(20, "men");
		
	}

}
