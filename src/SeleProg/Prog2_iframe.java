package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class Prog2_iframe {
	  public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
//	       
	       driver.manage().window().maximize();
//	       driver.findElement(By.xpath("input[@id='s']")).sendKeys("Bhavesh");
//       
	       driver.switchTo().frame("globalSqa");
	       
	       driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("Korde");
	       
//	       driver.switchTo().parentFrame();  OR
	       driver.switchTo().defaultContent();
	       driver.findElement(By.xpath("(//input[@id='s'])[1]")).sendKeys("Bhavesh");
//	       
//	     
	       
	       
	       
	       
	       
	}
}
