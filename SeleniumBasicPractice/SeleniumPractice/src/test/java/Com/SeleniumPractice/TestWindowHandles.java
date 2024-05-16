package Com.SeleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestWindowHandles {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		Thread.sleep(2000);
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window is : "+ parentWindowHandle + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle :windowHandles) {
			if(!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ravi");
				Thread.sleep(2000);
				driver.close();
				Thread.sleep(2000);
			}
			//System.out.println(handle + driver.getTitle());
		}
		driver.switchTo().window(parentWindowHandle);
		//driver.navigate().to(parentWindowHandle);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("RaviKumar");
		Thread.sleep(2000);
		driver.quit();

	}

}
