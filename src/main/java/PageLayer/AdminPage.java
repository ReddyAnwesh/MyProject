package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseTest;

public class AdminPage extends BaseTest {

	
	@FindBy(xpath= "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
	WebElement Search;
	@FindBy(xpath= "/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[4]/span/i")
	WebElement Qualifications;
	@FindBy(xpath= "//a[text()='Education']")

	WebElement Education;
	

	public AdminPage(WebDriver driver) throws Exception {
		super();
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean validateHomePage() {
		return Search.isDisplayed();
		
	}
	
	public  void clickOnEducation() {
		Qualifications.click();
		Education.click();
	}
}
