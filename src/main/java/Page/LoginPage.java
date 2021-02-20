package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {
	
    @FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")
	WebElement username;
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/input[1]")
	WebElement password;
	@FindBy(xpath="//body/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")
	WebElement submit;
	
	public LoginPage()
	{
		init();
		PageFactory.initElements(driver, this);
	}
	
	public void enterUN(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterPW(String pw)
	{
		password.sendKeys(pw);
	}
	
	public void clickBtn()
	{
		submit.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}

}
