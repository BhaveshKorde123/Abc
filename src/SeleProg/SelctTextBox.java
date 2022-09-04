package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelctTextBox{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https://is.rediff.com/signup/register");
		 
		WebElement dayDropDwn = driver.findElement(By.xpath("//select[@id='date_day']"));
		Select s=new Select(dayDropDwn);
		s.selectByVisibleText("02");
		
		Thread.sleep(2000);
		
		WebElement monthDropDwn = driver.findElement(By.xpath("//select[@id='date_mon']"));
		Select s1=new Select(monthDropDwn);
		s1.selectByVisibleText("APR");
		Thread.sleep(2000);

		
		WebElement yearDropDwn = driver.findElement(By.xpath("//select[@name='Date_Year']"));
		Select s2=new Select(yearDropDwn);
		s2.selectByVisibleText("1925");
		Thread.sleep(2000);
		
		driver.close();
	}

}
