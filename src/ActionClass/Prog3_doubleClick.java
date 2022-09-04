package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog3_doubleClick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(doubleClick).doubleClick().build().perform(); 
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.close();
        
	}

}
