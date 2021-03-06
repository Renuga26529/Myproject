package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class Basket extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Shop')]")
	WebElement shop;
	@FindBy(xpath="//a[contains(text(),'Home')]")
	WebElement Home;
	@FindBy(xpath="//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement Image;
	@FindBy(xpath="//button[contains(text(),'Add to basket')]")
	WebElement AddTobasket;
	
	Actions action;
	
	public Basket()	{
		init();
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickShop()
	{
		shop.click();
		
	}
	
	public void clickHome()
	{
		Home.click();
	}
	
	public void checkArrival()
	{
		List<WebElement> a=driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		for(WebElement list:a)
		{
			List<WebElement> books = driver.findElements(By.tagName("h3"));
			
			if(books.size()==3)
			{
				System.out.println("There are only three arrivals on home page");
				
			}
			
		}
	}
	public void confirm()
	{
		List<WebElement> a =driver.findElements(By.xpath("//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]"));
		List<WebElement> books = driver.findElements(By.tagName("h3"));
		Assert.assertTrue(books.size()==3);
	}
	
	public void clickImage()
	{
		Image.click();
	}
	
	public void AddTobasket() {
		
		AddTobasket.click();
	}
	public void confirmation()
	{
	
		System.out.println(driver.getTitle());
	}

}
