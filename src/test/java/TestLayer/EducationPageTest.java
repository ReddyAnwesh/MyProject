package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseLayer.BaseTest;
import PageLayer.AdminPage;
import PageLayer.EducationPage;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class EducationPageTest extends BaseTest {

	public HomePage homepage;
	public LoginPage login;
	public AdminPage admin;
	public EducationPage education;
	public EducationPageTest() throws Exception {
		super();
	
	}

	@BeforeMethod
	public void setup() throws Exception {
		initialize();
		Thread.sleep(5000);
		homepage=new HomePage(driver);
		login = new LoginPage(driver);
		admin=new AdminPage(driver);
		education=new EducationPage(driver);
		login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		homepage.admin();
		Thread.sleep(5000);
		admin.clickOnEducation();
		Thread.sleep(5000);
	}
	@Test(priority=0)
	public void validateEducationPageTest() {
		education.validateEducationPage();
		
	}
	@Test(priority=1)
	public void clickOnDeleteTest() throws Exception {
		education.clickOnDelete();
		
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
