package HandleWebTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	static WebDriver driver;
	
	public static void readSmallTable() throws Exception {
		
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/");
		
		List<WebElement> row = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul"));
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='hmbseindicestable show']//ul[1]//li"));
		
		System.out.println(row.size());
		System.out.println(column.size());
		
		Thread.sleep(1000);
		
		for(int i=0;i<row.size();i++)
		{
			System.out.println(row.get(i).getText());
		}
		
		for(int i=0;i<column.size();i++)
		{
			System.out.println(column.get(i).getText());
		}
	}
		
		
		public static void readCompleteTable() throws Exception{
			
	    driver.manage().window().maximize();
		driver.get("https://money.rediff.com/indices?src=moneyhome_bseIndices_more");
		driver.findElement(By.xpath("//a[@id='showMoreLess']")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='dataTable']//tr"));
		List<WebElement> columns = driver.findElements(By.xpath("//table[@id='dataTable']//tr//th"));
		
		System.out.println(rows.size());
		System.out.println(columns.size());
		
		Thread.sleep(1000);
		
		for(int i=0;i<rows.size();i++)
		{
			System.out.println(rows.get(i).getText());
		
		}
		
		for(int i=0;i<columns.size();i++)
		{
			System.out.println(columns.get(i).getText());
		}
	}
		
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.driver.chromedriver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
			 driver =new ChromeDriver();
			
//            Prog1.readSmallTable();
//            Prog1.readCompleteTable();
            
              readSmallTable();
              readCompleteTable();
		
		
	 Thread.sleep(2000);
     driver.close();
	}

}
