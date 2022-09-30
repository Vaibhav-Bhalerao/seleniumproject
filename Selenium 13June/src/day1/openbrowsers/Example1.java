package day1.openbrowsers;
import org.openqa.selenium.chrome.ChromeDriver;
public class Example1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
         ChromeDriver cdriver= new ChromeDriver();
         cdriver.get("https://www.google.com");
        cdriver.close(); 
	}

}
