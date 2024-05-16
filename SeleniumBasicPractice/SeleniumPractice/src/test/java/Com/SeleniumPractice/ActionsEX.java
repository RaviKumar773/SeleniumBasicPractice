package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsEX {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']/.")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Organization ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Locations']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Name']/parent::div/parent::div/descendant::input")).sendKeys("Ashitosh");
		driver.findElement(By.xpath("//label[text()='Name']/following::input[1]")).sendKeys(" Kumar");
		driver.findElement(By.xpath("//label[text()='Name']/following::input[2]")).sendKeys("Bangalore");
		
		
		
		

	}

}
