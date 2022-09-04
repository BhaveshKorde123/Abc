package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog10 {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
        
       String s = driver.findElement(By.xpath("//a[text()='Terms of Use']")).getText();
        System.out.println("Text="+s);
        
        driver.close();
	}
}
