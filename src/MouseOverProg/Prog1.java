package MouseOverProg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		Thread.sleep(1000);
		WebElement aboutusDrp = driver.findElement(By.xpath("//a[text()='About Us']"));
		
		Actions a=new Actions(driver);
		a.moveToElement(aboutusDrp).build().perform();
		
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		Thread.sleep(1000);
		driver.close();	
	}

}
