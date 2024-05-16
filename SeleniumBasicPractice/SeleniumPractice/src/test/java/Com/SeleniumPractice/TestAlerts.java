package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAlerts {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		
		Thread.sleep(3000);
		
		
		
		  //Alert Box //
		  System.out.println(driver.findElement(By.id("output")).getText()); 
		  driver.findElement(By.id("alertBox")).click(); 
		  System.out.println(driver.switchTo().alert().getText()); 
		  Thread.sleep(2000);
		  driver.switchTo().alert().accept(); 
		  System.out.println(driver.findElement(By.id("output")).getText());
		  
/*		  //Confirm Box //
		  System.out.println(driver.findElement(By.id("output")).getText()); 
		  driver.findElement(By.id("confirmBox")).click(); 
		  System.out.println(driver.switchTo().alert().getText()); 
		  driver.switchTo().alert().accept(); 
		  System.out.println(driver.findElement(By.id("output")).getText());
		  driver.findElement(By.id("confirmBox")).click(); 
		  System.out.println(driver.switchTo().alert().getText()); 
		  driver.switchTo().alert().dismiss(); 
		  System.out.println(driver.findElement(By.id("output")).getText());
		  
		  
			
			  //Prompt Box //
			  System.out.println(driver.findElement(By.id("output")).getText()); 
			  Thread.sleep(2000);
			 // driver.findElement(By.xpath(//button[@id='promptBox'])).click(); 
			  driver.findElement(By.xpath("//button[@id='promptBox']")).click();
			  System.out.println(driver.switchTo().alert().getText()); 
			  driver.switchTo().alert().sendKeys("HYR Tutorials"); 
			  Thread.sleep(2000);
			  driver.switchTo().alert().accept(); 
			  System.out.println(driver.findElement(By.id("output")).getText()); 
			  driver.findElement(By.id("promptBox")).click(); 
			  System.out.println(driver.switchTo().alert().getText()); 
			  Thread.sleep(2000);
			  driver.switchTo().alert().dismiss(); 
			  System.out.println(driver.findElement(By.id("output")).getText());
			 */
				driver.quit();

	}

}
