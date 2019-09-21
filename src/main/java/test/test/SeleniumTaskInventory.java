package test.test;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.lang.System;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTaskInventory {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vishalchauhan/Downloads/chromedriver");
		System.out.println(System.getProperty("user.dir"));
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/resources/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000,TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		List<WebElement> tb = driver.findElements(By.xpath("//input[@type=\"text\"]"));
		for (WebElement c : tb) {
			String n;
			n = c.getAttribute("name");
			
		}
		driver.close();
		
	}

}
