package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class Prog1_railYatri {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("8668368044");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("kordebhavesh@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='irtct-acc-detail']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='username-id']")).sendKeys("Korde852");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='usr_pwd']")).sendKeys("Bhavesh@123");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='f_name_field']")).sendKeys("Bhavesh Namdevrao Korde");
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//button[contains(text(),' Selec')]")); //using contains method
		WebElement labelDob = driver.findElement(By.xpath("//label[@id='f_name_label']"));
		JavascriptExecutor je=((JavascriptExecutor)driver);
		je.executeScript("arguments[0].scrollIntoView();",labelDob);
		
		WebElement selDropDwn = driver.findElement(By.xpath("//button[normalize-space(text())='Select Occupation']")); //using normalize-space	
		Actions a=new Actions(driver);
		a.moveToElement(selDropDwn).click().build().perform();
		for(int i=0;i<6;i++) 
		{
			Thread.sleep(500);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		Thread.sleep(500);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()='Male']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//p[text()='Unmarried']")).click();
		Thread.sleep(500);
		
		WebElement countrDropDwn = driver.findElement(By.xpath("//button[text()='India']"));
		Thread.sleep(500);
		Actions a1=new Actions(driver);
		a.moveToElement(countrDropDwn).click().build().perform();;
		for(int i=0;i<1;i++)
		{
			Thread.sleep(500);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		Thread.sleep(500);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		
		WebElement secQutDropDwn = driver.findElement(By.xpath("//button[normalize-space(text())='What is your pet name?']"));
		Actions a2=new Actions(driver);
		a.moveToElement(secQutDropDwn).click().build().perform();;
		for(int i=0;i<3;i++)
		{
			Thread.sleep(500);
			a.sendKeys(Keys.DOWN).build().perform();
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//input[@id='sec_ans_field']")).sendKeys("Arun Kadam");
		Thread.sleep(500);
		driver.findElement(By.xpath("//button[@id='prsnl-dtl-for-acc']")).click();
		Thread.sleep(500);
		
		
    driver.close();
	}

}
