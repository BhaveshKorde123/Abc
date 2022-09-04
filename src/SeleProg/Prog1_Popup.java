package SeleProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1_Popup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		Thread.sleep(2000);
		
		 Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		
//		System.out.println(driver.switchTo().alert().getText());         //shortcutUsed

			
		driver.switchTo().alert().accept();      //to accept the pop-up =>click on ok button
	//	driver.switchTo().alert().dismiss();     //to dismiss the pop-up =>click on Cancel button
		
		driver.close();	
		}

}
