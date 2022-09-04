package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrctProg1 {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Apple iphone 13");
	driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	driver.findElement(By.xpath("(//span[text()='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();

	driver.navigate().to("https://www.amazon.in/Apple-iPhone-13-128GB-Midnight/dp/B09G9HD6PD/ref=sr_1_1_sspa?keywords=Apple+iphone+13&qid=1658748678&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEyRUlZR1RHVk0yWU5VJmVuY3J5cHRlZElkPUEwMTY0OTAzTEpTT1RDNUdMMExYJmVuY3J5cHRlZEFkSWQ9QTA4NzI3NjAxSERUUEIzUlRWSTkxJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
	
	driver.findElement(By.xpath("(//input[@name='submit.buy-now'])[2]")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("8668368044");



	

//	Thread.sleep(2000);
//	driver.close();
	}

}
