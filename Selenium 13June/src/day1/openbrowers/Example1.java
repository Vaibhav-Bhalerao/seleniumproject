package day1.openbrowers;

import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) {
		String dir= System.getProperty("user.dir");
        String executablePath= dir+"\\Executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",executablePath);
        ChromeDriver cdriver= new ChromeDriver();
	}

}
