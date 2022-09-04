package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog5_guru99 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement debit5000 = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		WebElement credit5000 = driver.findElement(By.xpath("(//li[@id='fourth'])[2]"));
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		
		WebElement bankDebitPlace = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement debit5000Place = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement salesCreditPlace = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement sales5000Place = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));

		  WebElement sroll = driver.findElement(By.xpath("(//h3[normalize-space(text())='Account'])[1]"));
		  JavascriptExecutor je=((JavascriptExecutor)driver);
	      je.executeScript("arguments[0].scrollIntoView();",sroll);

		Actions a=new Actions(driver);
		Thread.sleep(1000);
		a.moveToElement(debit5000).clickAndHold().moveToElement(debit5000Place).release().build().perform();
		Thread.sleep(1000);
		a.moveToElement(credit5000).clickAndHold().moveToElement(sales5000Place).release().build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(bank, bankDebitPlace).build().perform();
		Thread.sleep(1000);
		a.dragAndDrop(sales, salesCreditPlace).build().perform();
		Thread.sleep(1000);
		WebElement perfectbutton = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		System.out.println(perfectbutton.getText());
		
	Thread.sleep(1000);	
	driver.close();
	}

}
