package StepDef;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginStepDef {
	
	WebDriver driver;

	WebElement element;
	
	LoginPage login;
	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		login=new LoginPage();
	}

	@When("^user enters \"([^\"]*)\" & \"([^\"]*)\"$")
	public void user_enters(String arg1, String arg2) throws Throwable {
	   login.enterUN(arg1); 
	   login.enterPW(arg2);
	}
	@When("^user clicks on submit btn$")
	public void user_clicks_on_submit_btn() throws Throwable {
	  login.clickBtn();
	}

	
	
//	@Given("user is on login page")
//	public void user_is_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver","driver//chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.shoppersstop.com/#login");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//	    
//	}
//	/*@When("user enters un & pw")
//	public void user_enters_un_pw() {
//		
//		element=driver.findElement(By.xpath("//input[@id='j_username']"));
//		element.sendKeys("renumuthu11@gmail.com");
//		element=driver.findElement(By.xpath("//input[@id='j_password']"));
//		element.sendKeys("sai baba");
//		   
//	}*/
//	
//	@When("user enters {string} & {string}")
//	public void user_enters(String string, String string2) {
//		element=driver.findElement(By.xpath("//input[@id='j_username']"));
//		element.sendKeys(string);
//		element=driver.findElement(By.xpath("//input[@id='j_password']"));
//		element.sendKeys(string2);
//		   
//	   }
//	
//	@Then("user login failed")
//	public void user_login_failed() {
//	  Assert.assertEquals(driver.getTitle(), "https://www.shoppersstop.com/#login");
//	}
//	
//	
//	@When("user enters data")
//	public void user_enters_data(io.cucumber.datatable.DataTable dataTable) {
//		 Map<String,String> map=dataTable.asMap(String.class, String.class);
//		    System.out.println(map.get("username"));
//		    System.out.println(map.get("mobileNumber"));
//		    System.out.println(map.get("company"));
//	    
//	}
//
//	@When("user clicks on submit btn")
//	public void user_clicks_on_submit_btn() {
//		
//		element=driver.findElement(By.xpath("//button[@id='loginajax']"));
//		element.click();
//	   
//	}
	@Then("user is on home page")
	public void user_is_on_home_page() {
		
		//System.out.println(driver.getTitle());
		//Assert.assertEquals(driver.getTitle(), "https://www.flipkart.com/");
	   
	}

}
