package Homework1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenFlipkart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Desktop\\EclipsePractice\\workspace\\Selenium 13June\\executables\\chromedriver.exe");
		ChromeDriver cdriver= new ChromeDriver();
		cdriver.get("https://www.flipkart.com");
		

	}

}
