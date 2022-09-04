package PopUp_Progs;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp_Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
	Set<String> win = driver.getWindowHandles();
	Iterator<String> itr = win.iterator();

	String windows[]=new String[5];
	for(int i=0;i<win.size();i++)
	{
		windows[i]=itr.next();
		System.out.println(windows[i]);
	}
	
	//driver.switchTo().window(windows[0]);                  //no need to switch because it already on 
	System.out.println("Window 0=" + driver.getTitle());     //main=0 window but you can do that
	Thread.sleep(3000);
	driver.close();
	
	driver.switchTo().window(windows[1]);
	System.out.println("Window 1=" + driver.getTitle());
	Thread.sleep(1000);
	driver.close();
	
	}
}
