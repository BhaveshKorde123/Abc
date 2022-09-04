package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4_iframe {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");

//		driver.switchTo().frame("oneGoogleBar");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("images");
		driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		
	}

}
