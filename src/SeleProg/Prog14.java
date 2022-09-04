package SeleProg;    //Date=10/07/2022

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Prog14 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://is.rediff.com/signup/register");
        
        //DayDate
        WebElement dayDropDown = driver.findElement(By.xpath("//select[@name='date_day']"));
        Select s=new Select(dayDropDown);
        s.selectByIndex(01);
        Thread.sleep(2000);
        s.selectByValue("05");
      
        //Month
        WebElement selMonthDropDown = driver.findElement(By.xpath("//select[@name='date_mon']"));
        Select d=new Select(selMonthDropDown);
        d.selectByIndex(5);
        Thread.sleep(2000);
        d.selectByVisibleText("FEB");
       
        //Year
        WebElement selYearDropDown = driver.findElement(By.xpath("//select[@name='Date_Year']"));
        Select w=new Select(selYearDropDown);
        w.selectByValue("1993");
        
        
	}

}
