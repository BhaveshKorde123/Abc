package SeleProg;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog1_Partmeterization {
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		
		FileInputStream file=new FileInputStream("C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\TestData\\Bnk1.xlsx");
		Sheet excelData = WorkbookFactory.create(file).getSheet("Sheet1");
		
	    driver.findElement(By.id("fullname")).sendKeys(excelData.getRow(0).getCell(0).getStringCellValue());
	    driver.findElement(By.id("emailid")).sendKeys(excelData.getRow(0).getCell(1).getStringCellValue());
	    driver.findElement(By.id("pass")).sendKeys(excelData.getRow(0).getCell(2).getStringCellValue());
	    driver.findElement(By.id("repass")).sendKeys(excelData.getRow(0).getCell(3).getStringCellValue());
	    driver.findElement(By.id("sex")).click();
	    
	    WebElement day = driver.findElement(By.id("date_day")); 
	    Select s=new Select(day);
	    s.selectByValue(excelData.getRow(0).getCell(4).getStringCellValue());
	    
	    WebElement month = driver.findElement(By.id("date_mon"));
	    Select s1=new Select(month);
	    s1.selectByValue(excelData.getRow(0).getCell(5).getStringCellValue());
	    
	    WebElement year = driver.findElement(By.name("Date_Year"));
	    Select s2=new Select(year);
	    s2.selectByValue(excelData.getRow(0).getCell(6).getStringCellValue());
	    
	    driver.findElement(By.id("signup_city")).sendKeys(excelData.getRow(0).getCell(7).getStringCellValue());
	    driver.findElement(By.id("school")).sendKeys(excelData.getRow(0).getCell(8).getStringCellValue());
	    driver.findElement(By.id("college")).sendKeys(excelData.getRow(0).getCell(9).getStringCellValue());
	    driver.findElement(By.id("fld_captcha")).sendKeys(excelData.getRow(0).getCell(10).getStringCellValue());
	   
	    Thread.sleep(2000);
	    driver.close();
	}

}
