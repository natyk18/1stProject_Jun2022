package variousConcepts2;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {
	
	WebDriver driver;
	
	@Before
public void init(){
	
	System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
  @Test
	public void testLocator() {
	
		driver.findElement(By.name("firstname")).sendKeys("selenium");
		driver.findElement(By.id("sex-0")).click();
		//driver.findElement(By.id("photo")).sendKeys("C:\\Users\\natal\\OneDrive\\Desktop\\1selenium project");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
	//	driver.findElement(By.partialLinkText("OS-API")).click();
		driver.findElement(By.cssSelector("input#exp-5")).click();
	//	driver.findElement(By.cssSelector("input[id='tool-2']")).click();
		driver.findElement(By.cssSelector("input[name='tool'][value='Selenium Webdriver']")).click();
		driver.findElement(By.cssSelector("a[href$='http://www.objectspy.space']")).click();
}
}
