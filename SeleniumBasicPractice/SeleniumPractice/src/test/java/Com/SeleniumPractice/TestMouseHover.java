package Com.SeleniumPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMouseHover {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/");
		Thread.sleep(3000);
		//String parentWindowHandle = driver.getWindowHandle();
		WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Selenium Practice')]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(), 'Dropdowns')]")). click();
		Thread.sleep(2000);
		//Set<String> windowHandles = driver.getWindowHandles();
		//driver.navigateTo("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		//driver.switchTo().window("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement courseNameDropdown = driver.findElement(By.xpath("//select[@id='course']"));
		Select courseNames = new Select(courseNameDropdown);
		List<WebElement> options = courseNames.getOptions();
		for(WebElement courseName : options) {
			System.out.println(courseName.getText());
		}
		driver.quit();

	}

}
