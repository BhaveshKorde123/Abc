package SeleProg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\SelPr\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://is.rediff.com/signup/register");
		
	WebElement link_1Rediff = driver.findElement(By.xpath("//a[@class='ft11']"));
	System.out.println(link_1Rediff.getText());
	
	WebElement grey1bar = driver.findElement(By.xpath("//div[@class='greybar']"));
	System.out.println(grey1bar.isDisplayed());
	
	WebElement regHereLink = driver.findElement(By.xpath("//b[text()='New User? Register here']"));
	System.out.println(regHereLink.isDisplayed());
	
	WebElement grey2 = driver.findElement(By.xpath("//p[@class='grey1']"));
	System.out.println(grey2.isDisplayed());
	
	WebElement fullNameText = driver.findElement(By.xpath("(//div[@class='col1'][1])"));
	System.out.println(fullNameText.isDisplayed());
	
	WebElement emaiIdText = driver.findElement(By.xpath("//div[text()='Your current email ID']"));
	System.out.println(emaiIdText.isDisplayed());
	
	WebElement grey3 = driver.findElement(By.xpath("//p[@class=\"sm1 grey1\"]"));
	System.out.println(grey3.isDisplayed());
	
	WebElement passText = driver.findElement(By.xpath("//div[text()='New password']"));
	System.out.println(passText.isDisplayed());
	
	WebElement repassText = driver.findElement(By.xpath("//div[text()='Retype password']"));
	System.out.println(repassText.isDisplayed());
	
	WebElement genderText = driver.findElement(By.xpath("//div[text()='Gender:']"));
	System.out.println(genderText.isDisplayed());
	
	WebElement dateOBText = driver.findElement(By.xpath("//div[text()='Date of Birth']"));
	System.out.println(dateOBText.isDisplayed());
	
	WebElement locText = driver.findElement(By.xpath("//div[text()='Location']"));
	System.out.println(locText.isDisplayed());
	
	WebElement schText = driver.findElement(By.xpath("//div[text()='School']"));
	System.out.println(schText.isDisplayed());
	
	WebElement colText = driver.findElement(By.xpath("//div[text()='College']"));
	System.out.println(colText.isDisplayed());
	
	WebElement enerCapText = driver.findElement(By.xpath("//div[text()='Enter the code given in the above image']"));
	System.out.println(enerCapText.isDisplayed());
	
	WebElement invLink = driver.findElement(By.xpath("//a[text()='Investor Information']"));
	System.out.println(invLink.getText());
	
	WebElement advWithUsLink = driver.findElement(By.xpath("//a[text()='Advertise with us']"));
	System.out.println(genderText.getText());
	
	WebElement discLink = driver.findElement(By.xpath("//a[text()='Disclaimer']"));
	System.out.println(advWithUsLink.getText());
	
	WebElement priPolLink = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
	System.out.println(priPolLink.getText());
	
	WebElement feedLink = driver.findElement(By.xpath("//a[text()='Feedback']"));
	System.out.println(feedLink.getText());
	
	WebElement termOfUseLink = driver.findElement(By.xpath("//a[text()='Terms of Use']"));
	System.out.println(termOfUseLink.getText());
	
	WebElement signUpBtn = driver.findElement(By.xpath("//input[@value='Sign up']"));
	System.out.println(signUpBtn.getText());

	
	WebElement fullNameTextBox = driver.findElement(By.xpath("((//input[@type='text'])[1])"));
	fullNameTextBox.sendKeys("Bhavesh Korde");
	
	WebElement emaiIdTextBox = driver.findElement(By.xpath("//input[@name='emailid']"));
	emaiIdTextBox.sendKeys("kordebhavesh@gmail.com");
	
	WebElement passTextBox = driver.findElement(By.xpath("//input[@name='pass']"));
	passTextBox.sendKeys("Sham@0000");
	
	WebElement repassTextBox = driver.findElement(By.xpath("//input[@name='repass']"));
	repassTextBox.sendKeys("Sham@0000");
	
	WebElement locTextBox = driver.findElement(By.xpath("//input[@name='city']"));
	locTextBox.sendKeys("Amravati");
	
	WebElement schTextBox = driver.findElement(By.xpath("//input[@name='school']"));
	schTextBox.sendKeys("XUVPS");
	
	WebElement colTextBox = driver.findElement(By.xpath("//input[@name='college']"));
	colTextBox.sendKeys("MPL");
	
	driver.close();
	
	
	}
	
	

}
