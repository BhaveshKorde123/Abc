package ScrollProg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement contactInfoLink = driver.findElement(By.xpath("//h3[text()='Contact Info']"));
		Thread.sleep(1000);
		JavascriptExecutor js=((JavascriptExecutor)driver);
//		js.executeScript("arguments[0].scrollIntoView();", contactInfoLink);
		
//		js.executeScript("window.scrollBy(0,800)");
		
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		Thread.sleep(4000);
		driver.close();

}
}