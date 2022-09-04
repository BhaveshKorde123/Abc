package SeleProg;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2_Popup {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
//		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//		 Thread.sleep(4000);
//		 Alert alt = driver.switchTo().alert();
//		 System.out.println(alt.getText());
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		 Thread.sleep(1000);
//		Alert alt = driver.switchTo().alert();
//		 Thread.sleep(1000);
//		System.out.println(alt.getText());
//		 Thread.sleep(1000);
//		alt.accept();
//		alt.dismiss();
		 
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		 Thread.sleep(2000);
		Alert x = driver.switchTo().alert();
		 Thread.sleep(2000);
		System.out.println(x.getText());
		 Thread.sleep(1000);
		x.sendKeys("Bhavesh Korde");
		x.accept();
//		x.dismiss();
		
     Thread.sleep(4000);
     driver.close();
	}

}
