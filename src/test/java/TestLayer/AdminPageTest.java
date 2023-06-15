package TestLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseLayer.BaseTest;
import PageLayer.AdminPage;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class AdminPageTest extends BaseTest {
	
	public HomePage homepage;
	public LoginPage login;
	public AdminPage admin;
	public AdminPageTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}


	@BeforeMethod
	public void setup() throws Exception {
		initialize();
		Thread.sleep(5000);
		homepage=new HomePage(driver);
		login = new LoginPage(driver);
		admin=new AdminPage(driver);
		login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
		homepage.admin();
		Thread.sleep(5000);
	}
	
	
	@Test(priority=1)
	public void validateHomePageTest() {
		Assert.assertTrue(admin.validateHomePage());
	}

	@Test(priority=2)
	public  void clickOnEducationTest() throws InterruptedException {
		admin.clickOnEducation();
		Thread.sleep(10000);
		
	}


	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
