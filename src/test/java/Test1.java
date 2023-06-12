import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Test1 {
	
	
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
	@Test(priority=1)
	public void runn() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
	
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Hp\\eclipse-workspace\\SeleniumAutomation\\Drivers\\firefox.exe");
	//WebDriver d= new ChromeDriver();
		
	driver.get("https://www.youtube.com/");
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@id='search']")).sendKeys("AdhipurshTrailer");
	driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
	}
	

}
