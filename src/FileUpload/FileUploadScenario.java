package FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadScenario {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='upfile']")).sendKeys("E:\\Soft Testing\\ExcelData & IMP\\bnk1.txt");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.close();
	}

}
