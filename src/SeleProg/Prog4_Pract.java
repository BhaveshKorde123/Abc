package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4_Pract {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.get("http://www.amazon.com");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("vivo s1 pro");
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("")).sendKeys("");
	}

}
