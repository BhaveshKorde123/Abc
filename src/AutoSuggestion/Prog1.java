package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("seleni");
		Thread.sleep(1000);
		List<WebElement> autoSuggs = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		Thread.sleep(1000);
		
		for(int i=0;i<autoSuggs.size();i++)
		{
			System.out.println(autoSuggs.get(i).getText());
		}
		
		for(int i=0;i<autoSuggs.size();i++)
		{
			if(autoSuggs.get(i).getText().equals("selenium tutorial"))
			{
				autoSuggs.get(i).click();
				break;
			}  
			
		}
	    Thread.sleep(3000);
//		driver.close();

	}

}
