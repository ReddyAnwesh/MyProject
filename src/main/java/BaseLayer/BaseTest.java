package BaseLayer;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import UtilLayer.TestUtil;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static Properties prop;
	public static WebDriver driver;

	public BaseTest() throws Exception {
		prop = new Properties();

		FileInputStream fis = new FileInputStream("C:\\Users\\Hp\\Documents\\Git Projects\\MyProject\\src\\test\\resources\\com.automation.properties\\prop.properties");
		prop.load(fis);

	}

	public static WebDriver initialize() {
		String Browser = prop.getProperty("browser");
		if (Browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

			driver.get(prop.getProperty("url"));

		}
		return driver;
	}

}
