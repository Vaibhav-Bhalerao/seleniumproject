package day4.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homework {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\EclipsePractice\\workspace\\Selenium 13June\\executables\\geckodriver.exe");
	FirefoxDriver fdriver = new FirefoxDriver();
	fdriver.get("https://demosite.executeautomation.com/Login.html");
	
	String actualTitle = fdriver.getTitle();
	System.out.println("Actual page Title is:" +actualTitle);
	System.out.println("Title length is:" +actualTitle.length());
	
	String actualUrl = fdriver.getCurrentUrl();
	String expectedUrl= "https://demosite.executeautomation.com/Login.html";
	System.out.println("Actual Url is:" +actualUrl);
	System.out.println("Expected Url is:" +expectedUrl);
	System.out.println("Url validation :" +actualUrl.contains(expectedUrl));
	
	WebElement username = fdriver.findElementByName("UserName");
	username.sendKeys("execution");
	
	WebElement pwd = fdriver.findElementByName("Password");
	pwd.sendKeys("admin");
	
	WebElement loginbtn = fdriver.findElementByName("Login");
	loginbtn.click();
}

}
