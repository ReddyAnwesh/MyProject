package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import BaseLayer.BaseTest;

public class EducationPage extends BaseTest {

	public EducationPage(WebDriver driver) throws Exception {
		super();
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
		

	}
	
	@FindBy(xpath="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	WebElement Add;
	@FindBy(xpath="//i[@class='oxd-icon bi-trash'][1]")
	WebElement Delete;
	@FindBy(xpath="//button[@type='button' and @class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
	WebElement YesDelete;


public boolean validateEducationPage() {
	return Add.isDisplayed();
}
public void clickOnDelete()throws Exception {
	Delete.click();
	Thread.sleep(5000);
	YesDelete.click();
	
	
}



}