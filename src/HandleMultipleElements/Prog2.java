package HandleMultipleElements;
//on amazon practice
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		Thread.sleep(2000);
		for(int i=0;i<elements.size();i++)
		{
			System.out.println(elements.get(i).getText());
			
		}
		Thread.sleep(2000);
		
		for(int i=0;i<elements.size();i++)
		{
			 String exp = "Privacy Notice";
			 String act = elements.get(i).getText();
			  
			 if(exp.equals(act))
			 {
				 elements.get(i).click();
				 break;
			 }
			 Thread.sleep(2000);
		}
		
	
		
	 //Thread.sleep(2000);
     driver.close();
	}

}
