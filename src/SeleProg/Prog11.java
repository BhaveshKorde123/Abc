package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog11 {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
        
  //     WebElement xy = driver.findElement(By.xpath("//input[@value='m']"));
  //     System.out.println(xy.isDisplayed());
  //     System.out.println(xy.isEnabled());
 //      xy.click();
  //     System.out.println(xy.isSelected());
       
       WebElement xyz = driver.findElement(By.xpath("//input[@value='f']"));
       xyz.click();
       System.out.println(xyz.isDisplayed());
       System.out.println(xyz.isEnabled());
       System.out.println(xyz.isSelected());
       
       
       driver.close();
	}
}
