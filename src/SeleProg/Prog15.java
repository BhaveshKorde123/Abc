package SeleProg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog15 {
	public	static	void	main(String[]	args)	throws	Exception		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://is.rediff.com/signup/register");
	       
	     WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
	     Thread.sleep(2000);
	     Select s=new Select(dayDropDown);
	     List<WebElement> dayDropDownValues = s.getOptions();
	     
	    for( WebElement Values : dayDropDownValues)
	    {
	    	System.out.println(Values.getText());
	    }
	     
	    
	    
	}
	
}
