package TestLayer;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseLayer.BaseTest;
import PageLayer.HomePage;
import PageLayer.LoginPage;

public class HomePageTest extends BaseTest{
	
	public HomePage homepage;
	public LoginPage login;
	public HomePageTest() throws Exception {
		super();

	}

	@BeforeMethod
	public void setup() throws Exception {
		initialize();
		Thread.sleep(5000);
		homepage=new HomePage(driver);
		login = new LoginPage(driver);
		login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		Thread.sleep(5000);
	}
	
	@Test(priority=0)
	public void getHomePageTitleTest() {
		
	String hometitle=homepage.getHomePageTitle();
	Assert.assertEquals(hometitle, "OrangeHRM");
	}

	@Test(priority=1)
	public void validateHomePageTest() {
	Assert.assertTrue(homepage.validateHomePage());	
		
	}
	
	@Test(priority=2)
	public void adminTest() throws Exception {
	homepage.admin();

	
	}

	@Test(priority = 3)
	public void selectDropDownTest() throws InterruptedException {
		homepage.admin();
		homepage.selectDropDown();
		
	}

	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}