package StepDef;

import Page.Basket;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioThree {
	
	Basket arrival;
	

	@Given("user is on shop page2")
	public void user_is_on_shop_page2() {
		arrival = new Basket();
	    
	}

	@When("user clicks on shop menu2")
	public void user_clicks_on_shop_menu2() {

		arrival.clickShop();
	}

	@When("user clicks on home menu2")
	public void user_clicks_on_home_menu2() {
	    
		arrival.clickHome();
	}

	@When("test home page has Only three arrivals")
	public void test_home_page_has_Only_three_arrivals() {
		
		arrival.checkArrival();
	   
	}

	@Then("check page has three arrivals")
	public void check_page_has_three_arrivals() {
		
		arrival.confirm();
	    
	}
	
	@When("click on the image")
	public void click_on_the_image() {
		
		arrival.clickImage();
	    
	}

	@When("test that the page gets navigated where user adds to basket")
	public void test_that_the_page_gets_navigated_where_user_adds_to_basket() {
	  
		arrival.AddTobasket();
	}

	@Then("image shld clickable and shld navigate")
	public void image_shld_clickable_and_shld_navigate() {
		
		arrival.confirmation();
	    
	}

}
