package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog5 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.get("https://is.rediff.com/signup/register");
       
       WebElement fullNameTextbox = driver.findElement(By.tagName("input"));
       fullNameTextbox.sendKeys("Bhavesh Korde");
       
       WebElement currentEmailIdTextbox = driver.findElement(By.name("emailid"));
       currentEmailIdTextbox.sendKeys("kordebhavesh@gmail.com");
       
       WebElement emailIPassTextbox = driver.findElement(By.id("pass"));
       emailIPassTextbox.sendKeys("kort@5657");
    
       WebElement emailRepassTextbox = driver.findElement(By.name("repass"));
       emailRepassTextbox.sendKeys("kort@5657");
       
       WebElement locationTextbox = driver.findElement(By.id("signup_city"));
       locationTextbox.sendKeys("Amravati");
       
       WebElement schoolTextbox = driver.findElement(By.name("school"));
       schoolTextbox.sendKeys("Swami Narayan High School");
       
       WebElement collegeNamedTextbox = driver.findElement(By.id("college"));
       collegeNamedTextbox.sendKeys("MPL Junior College");
       
       WebElement linkAvtWithUs = driver.findElement(By.linkText("Advertise with us"));
       linkAvtWithUs.click();
       
       WebElement partiLinkClick=driver.findElement(By.partialLinkText("Investor"));
       partiLinkClick.click();
    
	}

	
}
