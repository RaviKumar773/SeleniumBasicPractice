package Com.SeleniumPractice;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadTimeOut {
	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		//driver.get("https://www.hyrtutorials.com/");
		driver.get("https://www.royalmansour.com/en/");
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("PageLoad time: "+duration.toMillis() + " milli seconds");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
