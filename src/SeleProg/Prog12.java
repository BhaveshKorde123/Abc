package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
        
       driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("korde");
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("korde");
        driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("korde");
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("korde");




        
	}

}
