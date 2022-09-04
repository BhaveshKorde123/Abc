package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		Thread.sleep(2000);
		WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
		date.click();
		
		String d="20", m="May", y="2023";
		WebElement monthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		System.out.println(monthYear.getText());
		
		String actMonthYear=monthYear.getText();
		  String month=actMonthYear.split(" ")[0];
		  String year=actMonthYear.split(" ")[1];
		
		while(!(month.equals(m) && year.equals(y)))
		{
			   Thread.sleep(1000);
			  driver.findElement(By.xpath("//span[text()='Next']")).click();
			   
			  WebElement monthYear1=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			  actMonthYear = monthYear1.getText();
			   month = actMonthYear.split(" ")[0];
			   year = actMonthYear.split(" ")[1];
			  System.out.println(month + " " + year); 		  
		}
		driver.findElement(By.xpath("//a[text()='"+ d +"']")).click();
//		driver.findElement(By.xpath("//a[text()='" + d + "']")).click();
		
}
}