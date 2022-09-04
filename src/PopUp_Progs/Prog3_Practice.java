package PopUp_Progs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3_Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();	
		
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		
		String win[] = new String[10];
	
		for(int i=0;i<windows.size();i++) 
		{
		  win[i]=itr.next();
		  System.out.println(win[i]);
		}
		
		 
		driver.switchTo().window(win[1]);
		System.out.println("Window 1 = " + driver.getTitle());
		driver.close();
		
		driver.switchTo().window(win[0]);
		System.out.println("Window 0 = " + driver.getTitle());
		driver.close();
		}
		
	
	}


