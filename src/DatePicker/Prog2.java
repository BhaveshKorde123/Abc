package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String actMonthYear = monthYear.getText();
		System.out.println(actMonthYear);
		String month=actMonthYear.split(" ")[0];
		String year=actMonthYear.split(" ")[1];
		
		String d="10", m="April", y="2023";
		while(!(month.equals(m) && year.equals(y)))
		{
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			
			WebElement monthYear1 = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			String actMonthYear1 = monthYear1.getText();
			 month = actMonthYear1.split(" ")[0];
		     year = actMonthYear1.split(" ")[1];
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='"+d+"']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
