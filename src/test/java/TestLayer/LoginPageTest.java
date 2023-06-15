package TestLayer;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import BaseLayer.BaseTest;
import PageLayer.HomePage;
import PageLayer.LoginPage;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class LoginPageTest extends BaseTest {

	public HomePage homepage;
	public LoginPage login;


	public LoginPageTest() throws Exception {
		super();
	}

@BeforeMethod
	public void setup() throws Exception {
		initialize();
		Thread.sleep(10000);
		login = new LoginPage(driver);

	}
@Ignore
	@Test(priority=0)
	public void validateurl() throws Exception {
		String title = login.validateTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}

	@Test(priority=1, dataProvider="excel-data")
	public void loginTest(String User , String Pass) throws Exception {
		Thread.sleep(10000);
	//	homepage = login.loginPage(prop.getProperty("username"), prop.getProperty("password"));
		login.loginPage(User,Pass);
		Thread.sleep(10000);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	@DataProvider(name ="excel-data")
  	public Object[][] excelDP() throws IOException{
        	//We are creating an object from the excel sheet data by calling a method that reads data from the excel stored locally in our system
        	Object[][] arrObj = getExcelData("C:\\Users\\Hp\\eclipse-workspace\\SeleniumAutomation\\src\\test\\resources\\Data\\Data.xlsx","Sheet1");
        	return arrObj;
  	}
  	//This method handles the excel - opens it and reads the data from the respective cells using a for-loop & returns it in the form of a string array
  	public String[][] getExcelData(String fileName, String sheetName){
        	
        	String[][] data = null;   	
  	  	try
  	  	{
  	   	FileInputStream fis = new FileInputStream(fileName);
  	   	XSSFWorkbook wb = new XSSFWorkbook(fis);
  	   	XSSFSheet sh = wb.getSheet(sheetName);
  	   	XSSFRow row = sh.getRow(0);
  	   	int noOfRows = sh.getPhysicalNumberOfRows();
  	   	System.out.println(noOfRows);
  	   	int noOfCols = row.getLastCellNum();
  	 	System.out.println(noOfCols);
  	   	Cell cell;
  	   	data = new String[noOfRows][noOfCols];
  	   	
  	   	for(int i =0; i<noOfRows;i++){
  		     for(int j=0;j<noOfCols;j++){
  		    	   row = sh.getRow(i);
  		    	   cell= row.getCell(j);
  		    	   data[i][j] = cell.getStringCellValue();
  	   	 	   }
  	   	}
  	  	}
  	  	catch (Exception e) {
  	     	   System.out.println("The exception is: " +e.getMessage());
           	}
        	return data;
  	}
}
