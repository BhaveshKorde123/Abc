package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog4_dragAndDrop {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(2000);
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions a=new Actions(driver);
	    a.moveToElement(img1).clickAndHold().moveToElement(trash).release().build().perform();
	    a.moveToElement(img2).clickAndHold().moveToElement(trash).release().build().perform();
	    a.dragAndDrop(img3, trash).build().perform();
        a.dragAndDrop(img4, trash).build().perform();

	    
    Thread.sleep(1000);
    driver.close();
	}

}
