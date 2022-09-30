package day4.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\EclipsePractice\\workspace\\Selenium 13June\\executables\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/");
		
		String actualTitle= driver.getTitle();
		
		System.out.println("Actual actiTIME page title is:"+actualTitle);
		//System.out.println("Expected actiTIME page title is:"+expectedTitle);
		//System.out.println("actiTIME title validation:"+actualTitle.equals(expectedTitle));
		System.out.println("page title length"+actualTitle.length());
		
		String actualUrl= driver.getCurrentUrl();
		String expectedUrl= "https://demo.actitime.com/";
		System.out.println("Actual actitime page url is:" +actualUrl);
		System.out.println("Expected actitime page url is:" +expectedUrl);
		System.out.println("actitime Url Varification:"+actualUrl.contains(expectedUrl));
	
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("admin");
		WebElement pwd= driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		WebElement loginbt= driver.findElement(By.id("loginButton"));
		loginbt.click();
		
		//driver.close();

   }
}