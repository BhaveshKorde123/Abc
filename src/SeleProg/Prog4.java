package SeleProg;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("http://www.facebook.com/");
	       Thread.sleep(1000);
	       
	       Dimension abc=new Dimension (800,600);
           driver.manage().window().setSize(abc);
           Thread.sleep(2000);
	       
	       driver.close();
	}

}
