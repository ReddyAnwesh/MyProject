package PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseTest;

public class HomePage extends BaseTest
{

	public HomePage(WebDriver driver) throws Exception {
		super();
		PageFactory.initElements(driver, this);
		
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//span[text()='Admin']") 
	WebElement Admin;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
	WebElement dashboard;
	

	@FindBy(xpath=" //div[text()='-- Select --'][1]")
	WebElement dropdown;
	@FindBy(xpath=" //div[@class='oxd-select-text-input'][1]")
			WebElement ess;	
	
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}
	
	public void selectDropDown() throws InterruptedException {

		dropdown.click();
		Thread.sleep(5000);
	
		
	}
	

	public void admin() {

		Admin.click();
	}

	public boolean validateHomePage() {
		return dashboard.isDisplayed();
	}

}
