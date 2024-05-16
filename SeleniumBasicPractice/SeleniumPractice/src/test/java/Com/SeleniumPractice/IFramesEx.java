package Com.SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IFramesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(co);
		dr.manage().window().maximize();
								
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.get("https://www.softwaretestinghelp.com/");

		List frames =  dr.findElements(By.tagName("iframe"));

		int totalFrames = frames.size();

		System.out.println("Total number of Frames on this page:"+ totalFrames);

	//	WebDriver ele = dr.switchTo().frame(dr.findElement(By.name("cnftcomm")));
		String pageSource= dr.getPageSource(); 
		System.out.println("Page Source code is: "+pageSource);
		dr.close();

	}

}
