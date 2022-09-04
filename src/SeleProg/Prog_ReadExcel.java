package SeleProg;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog_ReadExcel {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://is.rediff.com/signup/register");
	      WebElement fNameTextbox = driver.findElement(By.xpath("//input[@name='city']"));
	      
	      FileInputStream a=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\TestData\\BhavTest.xlsx");
	      Sheet excelData = WorkbookFactory.create(a).getSheet("Sheet1");
	      String value = excelData.getRow(0).getCell(0).getStringCellValue();
	      
//	       System.out.println(value);
	       fNameTextbox.sendKeys(value);   
	       
	       Thread.sleep(1000);
	       driver.close(); 
	}
                                                                          //path always provide of excel file
}
