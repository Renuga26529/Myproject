package StepDef;

import Page.Review;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioFive {
	
	Review arrival;
	
	@Given("user is on shop page5")
	public void user_is_on_shop_page5() {
		arrival=new Review();
	   
	}

	@When("user clicks on shop menu5")
	public void user_clicks_on_shop_menu5() {
		arrival.clickShop();
	}

	@When("user clicks on home menu5")
	public void user_clicks_on_home_menu5() {
		arrival.clickHome();
	}

	@When("Test home page has Only three arrivals")
	public void test_home_page_has_only_three_arrivals() {
		arrival.checkArrival();
	}

	@When("Test page must have three arrivals")
	public void test_page_must_have_three_arrivals() {
		arrival.confirm();
	}

	@When("click on any image in arrivals")
	public void click_on_any_image_in_arrivals() {
		arrival.Image();
	}

	@When("test that the page gets navigated where user adds any book to basket")
	public void test_that_the_page_gets_navigated_where_user_adds_any_book_to_basket() {
		arrival.AddTobasket();;
	}

	@When("image shld be clickable and page shld navigate")
	public void image_shld_be_clickable_and_page_shld_navigate() {
		arrival.confirmation();
	}

	@When("click on Review")
	public void click_on_review() {
		arrival.review();
	}

	@Then("shld get the Review")
	public void shld_get_the_review() {
		arrival.Content();
	}

}
