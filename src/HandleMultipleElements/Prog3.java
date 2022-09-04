package HandleMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(int i=1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=checkbox.size()-1;i>0;i--)
		{
			checkbox.get(i).click();
		}
		
		for(int i=1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=checkbox.size()-1;i>0;i--)
		{
			checkbox.get(i).click();
		}

		for(int i=1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=checkbox.size()-1;i>0;i--)
		{
			checkbox.get(i).click();
		}
		
		for(int i=1;i<checkbox.size();i++)
		{
			checkbox.get(i).click();
		}
		
		for(int i=checkbox.size()-1;i>0;i--)
		{
			checkbox.get(i).click();
		}
		
		Thread.sleep(500);	
        driver.close();
	}

}
