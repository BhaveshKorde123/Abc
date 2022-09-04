package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog2_rightClick {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		
		WebElement rightClButtn = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(rightClButtn).contextClick().build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
	driver.close();	
	}

}
