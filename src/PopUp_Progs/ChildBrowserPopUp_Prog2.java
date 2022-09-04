package PopUp_Progs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp_Prog2{

	public static void main(String[] args) {
		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.aspsnippets.com/demos/1102/");
		driver.findElement(By.xpath("//input[@value='Open Popup']")).click();
		
		Set<String> windows = driver.getWindowHandles(); //Total no of windows present
		 Iterator<String> itr = windows.iterator();
		 
		 String win[]=new String[5];                     //total no of windos  getting
		for(int i=0;i<windows.size();i++)
		{
			win[i]=itr.next();
			System.out.println(win[i]);
		}
		
			
		driver.switchTo().window(win[1]);                           //switching new window1
		System.out.println("Windows 1= "+driver.getTitle());
		driver.close();
		
		driver.switchTo().window(win[0]);                           //switching original window
		System.out.println("Windows 0=" + driver.getTitle());
		driver.close();
				
	}

}
