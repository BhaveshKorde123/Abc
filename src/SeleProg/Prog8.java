package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog8 {
	public static void main(String[] args) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       
	       driver.get("https://is.rediff.com/signup/register");
	       
	     driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bhavesh Korde");
	     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("kordebhavesh@gmail.com");
	     driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Amravati");
	     driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("S. G. boys High School");
	     driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("MPL College");
	      
	     
	}	      
}