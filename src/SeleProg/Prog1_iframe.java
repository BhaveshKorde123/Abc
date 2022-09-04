package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog1_iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	       
	       driver.switchTo().frame("iframeResult");
	         
	       WebElement carSelect = driver.findElement(By.xpath("//select[@id='cars']"));
	       Select s=new Select(carSelect);
	       s.selectByValue("volvo");
	       
	       driver.switchTo().parentFrame();           //switch from child to immediate parent
//	       driver.switchTo().defaultContent();        //switch from child to main page
	       
	     //a[@id='tryhome']
	      driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	       
	       driver.close();
	}

}
