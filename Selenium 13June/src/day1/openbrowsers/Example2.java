package day1.openbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Example2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL\\Desktop\\EclipsePractice\\workspace\\Selenium 13June\\executables\\geckodriver.exe" );
    FirefoxDriver fdriver= new FirefoxDriver();  
    fdriver.get("https://www.google.com");
    fdriver.close();
	}

}
  