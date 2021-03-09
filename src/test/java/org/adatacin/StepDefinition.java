package org.adatacin;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinition extends BaseClass {
	@Given("user is on adactin login page")
	public void user_is_on_adactin_login_page() {
	    launchBrowser("https://adactinhotelapp.com/");
	}
	@When("user enter the valid {string} and {string}")
	public void user_enter_the_valid_and(String string, String string2) {
		login("username", string);
	    passWord("password", string2); 
	}

	@Then("user should click login button")
	public void user_should_click_login_button() {
		clk("login");
	}
	@When("user enter the {string},{string},{string},{string},{string}")
	public void user_enter_the(String string, String string2, String string3, String string4, String string5) {
	    loc("location", string); 
	    rooms("room_nos", string2);
	    entryDate("datepick_in",string3 );
	   exitDate("datepick_out", string4);
	    adult("adult_room", string5);
	   
	   
	}

	@Then("user should click search button")
	public void user_should_click_search_button() {
		 clk("Submit");
	   
	}

	@When("user select the hotel name")
	public void user_select_the_hotel_name() {
	   clk("radiobutton_1");
	}

	@Then("click the continue")
	public void click_the_continue() {
	   clk("continue");
	}
	@When("user enter the {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_enter_the(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) throws InterruptedException {
	    loc("first_name",string);
	    loc("last_name",string2);
	    loc("address", string3);
	    loc("cc_num", string4);
	    loc("cc_type", string5);
	    loc("cc_exp_month", string6);
	    loc("cc_exp_year", string7);
	    loc("cc_cvv", string8);
	    clk("book_now");
	  

}
	@When("click the logout")
	public void click_the_logout() {
	   clk("logout");
	}}
