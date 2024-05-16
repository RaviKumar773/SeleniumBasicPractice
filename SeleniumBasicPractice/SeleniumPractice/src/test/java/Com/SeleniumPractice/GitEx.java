package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GitEx {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(co);
		dr.get("https://github.com/login");
		System.out.println(dr.getTitle());
		WebElement loginField = dr.findElement(By.id("login_field"));
		highlight(dr, loginField);
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.name("password")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.className("header-logo")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.linkText("Forgot password?")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.partialLinkText("an account")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.xpath("//label[contains(text(),' Username or email address')]")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.cssSelector("input[name='commit']")));
		Thread.sleep(5000);
		highlight(dr, dr.findElement(By.tagName("h1")));
		Thread.sleep(5000);
		dr.quit();
		
	}
	
	public static void highlight(WebDriver dri,WebElement e) {
		JavascriptExecutor jse= (JavascriptExecutor)dri;
		jse.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", e);
	}

}
