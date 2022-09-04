package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2_Practice {

		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("mahakal sarkar mere");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
        
	}

}
