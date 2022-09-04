package SeleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog100 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://is.rediff.com/signup/register");
	       
	      
		    WebElement yearDropDwn= driver.findElement(By.xpath("//select[@name='Date_Year']"));
		    Select w=new Select(yearDropDwn);
		    List<WebElement> yearDropDwnValues = w.getOptions();
		    
		    for(WebElement s : yearDropDwnValues)
		    {
		    	
		    	System.out.println(s.getText());	
		    }
		    driver.close();	
	
	}
}
