package SeleProg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog17 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",	"chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	}

}
