package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(co);
		dr.manage().window().maximize();
		dr.get("https://www.google.com/");
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//textarea[@name=\"q\"]")).sendKeys("hello");
		Thread.sleep(3000);
		dr.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		dr.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		dr.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		dr.navigate().refresh();
		Thread.sleep(3000);
		dr.navigate().back();
		Thread.sleep(3000);
		dr.navigate().forward();
		Thread.sleep(3000);
		dr.quit();
		
	}

}
