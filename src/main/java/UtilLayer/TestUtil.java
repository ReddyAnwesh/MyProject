package UtilLayer;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseLayer.BaseTest;

public class TestUtil extends BaseTest {

	public TestUtil() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;

	public static void getScreenshoot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		
		File DestFile = new File("C:\\Users\\Hp\\Documents\\Git Projects\\MyProject\\screenshoots"+ timestamp()+".png");
		
		
		
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("srrenshoot taken");
		

		}
	public static String timestamp() {
		
		
		String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		return timestamp; 
	}
	
	
	public static void webDriverWait(WebElement elm) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		System.out.println("checkkk");
	     wait.until(ExpectedConditions.visibilityOf(elm));
	}
	
	 public static String getDate() {
	        return new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss").format(new Date());
	    }
	 

	}


