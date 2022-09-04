package SeleProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\PractiseProg\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");          //get()-method
		 
		Thread.sleep(1000);                          //Interrupted Exception
		
	    driver.close();                              //close()-method
	    
	           
		
	}

}

