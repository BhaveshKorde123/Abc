package SeleProg;
import java.util.List;

import org.openqa.selenium.By;
//VerifyWeatherLlistbox	is	singleSelectable/multiSelectable
//GetselectedoptionPresentInlistbox
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog16 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	       
	       //Switch to iframe
	       driver.switchTo().frame("iframeResult");
	       
	     WebElement chooseCarDropdown = driver.findElement(By.xpath("//select[@name='cars']"));
	    Select s=new Select(chooseCarDropdown);
	    s.selectByVisibleText("Volvo");
	    s.selectByVisibleText("Saab");
	    s.selectByVisibleText("Opel");
	    s.selectByVisibleText("Audi");
	    
	    Thread.sleep(2000);
	    
	    s.deselectByValue("audi");
	    s.deselectByValue("saab");
	    
	    //checking the list box is multiple or not(SelectMultipleOptions OR not)
	    //boolean w = s.isMultiple();
	    
	     s.isMultiple();
	    System.out.println("Is List box is multi Selectable = "+s.isMultiple());
	    

	   List<WebElement> selectedOptions = s.getAllSelectedOptions();
	    
	       for(WebElement d : selectedOptions) 
	       {
	    	   System.out.println(d.getText());
	       }
	      
	}

}
