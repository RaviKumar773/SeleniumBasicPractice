package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleTextBoxes {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(co);
		dr.get("https://github.com/login");
		
		WebElement userNameTxt= dr.findElement(By.id("login_field"));
		if(userNameTxt.isDisplayed()) {
			if(userNameTxt.isEnabled()) {
				userNameTxt.sendKeys("viresh");
				String enteredTxt = userNameTxt.getAttribute("value");
				System.out.println(enteredTxt);
				Thread.sleep(3000);
				userNameTxt.sendKeys(" Kumar");
				Thread.sleep(3000);
				userNameTxt.clear();
			}
			else
				System.err.println("username is not enabled");
		}
		else {
			System.err.println("user name is not displayed");
		}
		dr.quit();
		
		
	}

}
