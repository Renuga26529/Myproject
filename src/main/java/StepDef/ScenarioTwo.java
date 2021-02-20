package StepDef;

import Page.ThreeArrivals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioTwo {
	
	ThreeArrivals arrival;

	@Given("user is on shop page")
	public void user_is_on_shop_page() {
		arrival = new ThreeArrivals();
	    
	}

	@When("user clicks on shop menu")
	public void user_clicks_on_shop_menu() {

		arrival.clickShop();
	}

	@When("user clicks on home menu")
	public void user_clicks_on_home_menu() {
	    
		arrival.clickHome();
	}

	@When("test home page has three arrivals")
	public void test_home_page_has_three_arrivals() {
		
		arrival.checkArrival();
	   
	}

	@Then("check page has only three arrivals")
	public void check_page_has_only_three_arrivals() {
		
		arrival.confirm();
	    
	}

}
