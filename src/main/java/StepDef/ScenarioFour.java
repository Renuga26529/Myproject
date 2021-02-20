package StepDef;

import Page.Basket;
import Page.Description;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioFour {
	
	Description arrival;
	
	
	@Given("user is on shop page3")
	public void user_is_on_shop_page3() {
		arrival = new Description(); 
	}

	@When("user clicks on shop menu3")
	public void user_clicks_on_shop_menu3() {
	   arrival.clickShop();
	}

	@When("user clicks on home menu3")
	public void user_clicks_on_home_menu3() {
	  arrival.clickHome();
	}

	@When("check home page has Only three arrivals")
	public void check_home_page_has_only_three_arrivals() {
	   arrival.checkArrival();
	}

	@When("check page must have three arrivals")
	public void check_page_must_have_three_arrivals() {
	    arrival.confirm();
	}

	@When("click on the image in arrivals")
	public void click_on_the_image_in_arrivals() {
	  arrival.Image();
	}

	@When("test that the page gets navigated where user adds book to basket")
	public void test_that_the_page_gets_navigated_where_user_adds_book_to_basket() {
	   arrival.AddTobasket();
	}

	@When("image shld clickable and page shld navigate")
	public void image_shld_clickable_and_page_shld_navigate() {
	   arrival.confirmation();
	}

	@When("click on description")
	public void click_on_description() {
	   arrival.clickDescription();
	}

	@Then("shld get the  description")
	public void shld_get_the_description() {
		arrival.viewDescription();
	    
	}


}
