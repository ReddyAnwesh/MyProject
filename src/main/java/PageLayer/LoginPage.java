package PageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

import BaseLayer.BaseTest;

public class LoginPage extends BaseTest {
	
	@FindBy(xpath = "//input[@name='username']")
	WebElement username;
	@FindBy(xpath = "//input[@name='password']")
	WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	WebElement button;
	
	public LoginPage(WebDriver driver) throws Exception {
		super();
		PageFactory.initElements(driver, this);

	}

	public String validateTitle() {
		return driver.getTitle();
	}

	@DataProvider(name = "test-data")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{
              	{"Admin","admin123"},{"Admin","admin12"},{"ADMIN","admin123"}
        	};
  	}
	public HomePage loginPage(String User, String pass) throws Exception {
		username.sendKeys(User);
		password.sendKeys(pass);
		button.click();
		return new HomePage(driver);

}
	
	

}
