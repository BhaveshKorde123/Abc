package SeleProg;
//contains method-xpath-//input[contains(@attributeName,'attValueSameCharOnly')]
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
 //       driver.manage().window().maximize();
        driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
        driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Bhavesh");
        
        
        Thread.sleep(4000);
        driver.close();
	}

}
