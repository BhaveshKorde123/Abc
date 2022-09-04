package MouseOverProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog3 {
	
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[text()='✕']")).click();
	   WebElement loginDrpDwn = driver.findElement(By.xpath("//a[text()='Login']"));
	   Actions a=new Actions(driver);
	   a.moveToElement(loginDrpDwn).build().perform();
		Thread.sleep(4000);
	   driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
	   Thread.sleep(4000);
	   driver.close();

}
}