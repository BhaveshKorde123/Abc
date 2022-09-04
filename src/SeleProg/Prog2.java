package SeleProg;    //All NavigateMethods

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	
		  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();                     //maximize()=method
		driver.get("http://www.facebook.com");
	     Thread.sleep(2000);
		driver.navigate().to("http://www.google.com");           //navigate().to=method
		 Thread.sleep(2000);
		driver.navigate().back();                                //navigate().back=method
		 Thread.sleep(2000);
		driver.navigate().forward();                             //navigate().forward=method
		 Thread.sleep(2000);
	    driver.navigate().refresh();                             //navigate().refresh=method
	     Thread.sleep(2000);
		
		
		
		driver.quit();                                           //quit()=method
		
		
		

	}

}
