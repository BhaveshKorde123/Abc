package SeleProg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog9 {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
       
        driver.findElement(By.xpath("//a[text()='Privacy Policy']")).click();

        driver.close();
	}
}
