package Com.SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExButLink {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver dr = new ChromeDriver(co);
		dr.get("https://www.hyrtutorials.com/p/basic-controls.html");
		
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@id='femalerb']")).click();
	//	dr.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		dr.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChkbx = dr.findElement(By.id("hindichbx"));
		hindiChkbx.click();
		if(hindiChkbx.isSelected())
			hindiChkbx.click();
		Thread.sleep(3000);
		dr.findElement(By.id("registerbtn")).click();
		System.out.println(dr.findElement(By.id("msg")).getText());
		dr.quit();
		
	}

}
