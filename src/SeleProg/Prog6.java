package SeleProg;
//x-path=by id, name, className, type
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://is.rediff.com/signup/register");
	       
	       driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Bhavesh Korde");
	       driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("kordebhavesh@gmail.com");
	       driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Bhavesh@1234");
	       driver.findElement(By.xpath("//input[@id='repass']")).sendKeys("Bhavesh@1234");
	       driver.findElement(By.xpath("//input[@id='signup_city']")).sendKeys("Amravati");
	       driver.findElement(By.xpath("//input[@id='school']")).sendKeys("S. G. Boy's Hight School");
           driver.findElement(By.xpath("//input[@name='college']")).sendKeys("MPL College");
          
           driver.findElement(By.xpath("//a[text()='Advertise with us']")).click();             //link
	       
	   //input[@id='abc']=x-path    

	}

}
