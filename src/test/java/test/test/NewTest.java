package test.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	WebElement driver;
	@Test
	public void f() {
		/**
		 * List<WebElement> tb = driver.findElements(By.xpath("//input[@type=\"text\"]"));
		for (WebElement c : tb) {
			String n=c.getAttribute("name");
			Assert.assertEquals(n,"q");
		}
		*/
	}

	@BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "/Users/vishalchauhan/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
			driver.get(Constant.url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
			System.out.println(driver.getTitle());
			

			
			//driver.quit();
			
  }

	@AfterTest
	public void afterTest() {
	
	}

}
