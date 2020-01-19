package sunday;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement eleSource = driver.findElementById("src");
		eleSource.clear();
		eleSource.sendKeys("Chennai");
		Thread.sleep(3000);
		eleSource.sendKeys(Keys.TAB);
		
		WebElement eleDestination = driver.findElementById("dest");
		eleDestination.clear();
		eleDestination.sendKeys("Trichy");
		Thread.sleep(3000);
		eleDestination.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		

	}

}
