package Com.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.chrome.ChromeDriver;

public class TestLibraries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "./Resources/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		EdgeOptions e = new EdgeOptions();
		e.addArguments("--remote-allow-origins=*");
	//	WebDriverManager.chromedriver().setup();
	//	WebDriver dr = new ChromeDriver(co);
		
		WebDriverManager.edgedriver().setup();
		WebDriver dr = new EdgeDriver(e);
		
		dr.get("https://www.google.com/");
		System.out.println(dr.getTitle());
		dr.quit();

	}

}
