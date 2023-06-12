import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {
	public WebDriver driver;
	
	
	@BeforeTest
	public void testbefore() {
		System.out.println("Before");
		
	}
	
	
	@Test
	public void tests() {
		System.out.println("Automation");
		
	}
	
	@AfterTest
	public void testafter() {
		System.out.println("After");
		
	}
	
	
//	@Test(priority=1)
//	
//	public void start() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Hp\\eclipse-workspace\\SeleniumAutomation\\Drivers\\chrome.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.browserstack.com/users/sign_in");
//		WebElement username=driver.findElement(By.id("user_email_Login"));
//		WebElement password=driver.findElement(By.id("user_password"));
//		WebElement login=driver.findElement(By.name("commit"));
//		username.sendKeys("abc@gmail.com");
//		password.sendKeys("your_password");
//		login.click();
//		
//		}
	
//	
//@Test
//public void runn() {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\eclipse-workspace\\SeleniumAutomation\\Drivers\\firefox.exe");
//	WebDriver d= new FirefoxDriver();
//	
//	d.get("https://www.google.com/");
//	
	

	}


