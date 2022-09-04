package WaitsProg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prog1_ImplicitWait {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		
//		driver.findElement(By.xpath("//button[@id='alert']")).click();		
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
		
//		driver.findElement(By.xpath("//button[@id='populate-text']")).click();
//		WebElement text = driver.findElement(By.xpath("//h2[@id='h2']"));
//		wait.until(ExpectedConditions.textToBePresentInElement(text, "Selenium Webdriver"));
		
//		driver.findElement(By.xpath("//button[@id='display-other-button']")).click();
//		WebElement hiddenbtn = driver.findElement(By.xpath("//button[@id='hidden']"));
//		wait.until(ExpectedConditions.elementToBeClickable(hiddenbtn));
		
//		driver.findElement(By.xpath("//button[@id='enable-button']")).click();
//		WebElement btn = driver.findElement(By.xpath("//button[@id='disable']"));
//		wait.until(ExpectedConditions.elementToBeClickable(btn));
//		btn.click();
		
		driver.findElement(By.xpath("//button[@id='checkbox']")).click();
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='ch']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkBox));
			
    driver.close();
	}

}
