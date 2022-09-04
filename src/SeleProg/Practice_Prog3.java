package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Prog3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       Thread.sleep(1000);
	       driver.get("http://www.google.com");
	       driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("flipkart");
	       driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("(//cite[@class='iUh30 tjvcx'])[1]")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	       Thread.sleep(1000);
	       driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Led tv");
	       driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath("//div[text()='OnePlus Y1 80 cm (32 inch) HD Ready LED Smart Android TV with Dolby Audio']")).click();
	       Thread.sleep(1000);
	       driver.navigate().to("https://www.flipkart.com/oneplus-y1-80-cm-32-inch-hd-ready-led-smart-android-tv-dolby-audio/p/itme650a6bb8cee3?pid=TVSFVWD2ENXYGEJY&lid=LSTTVSFVWD2ENXYGEJY9U6ROG&marketplace=FLIPKART&q=Led+tv&store=ckf%2Fczl&spotlightTagId=BestsellerId_ckf%2Fczl&srno=s_1_4&otracker=search&otracker1=search&fm=Search&iid=448c9519-3ae5-46bf-b563-fc5a64b3b9b3.TVSFVWD2ENXYGEJY.SEARCH&ppt=sp&ppn=sp&ssid=8ox2xjcoqo0000001658804558716&qH=d6f09c4b9b46e058");
	       Thread.sleep(2000);
	       driver.close();
	       

	}

}
