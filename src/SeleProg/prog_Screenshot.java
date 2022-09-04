package SeleProg;
//OK OK => Run Zala
import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class prog_Screenshot {
	
	public	static	void main(String[] args) throws	Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	System.out.println(source);
		File destination = new File("C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\Screenshots\\bhav.png");
		FileHandler.copy(source, destination);
		
		
		driver.close();
  }
}