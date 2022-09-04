package SeleProg;
//getFirstSlectedOptions method = he return that value which is on first position among selected options 
import org.openqa.selenium.By;                                       //which is present in UI
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog18 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		
		driver.switchTo().frame("iframeResult");
	
		
		WebElement a=driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(a);
		s.selectByValue("saab");
		s.selectByValue("opel");
		s.selectByValue("volvo");
		
		
		s.getFirstSelectedOption();
		System.out.println(s.getFirstSelectedOption().getText());
		
	driver.close();
	}

	

}
