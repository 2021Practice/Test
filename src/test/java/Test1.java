import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void Testcase1() {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		driver.get("https://gmail.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("identifierId")).sendKeys("spractice2021@gmail.com");
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(wait.until(ExpectedConditions.elementToBeClickable((By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]"))))).click().perform();
		
		driver.quit();
	}
	
	
	
	
}
