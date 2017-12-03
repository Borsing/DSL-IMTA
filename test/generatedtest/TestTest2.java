import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest2 {
	WebDriver driver;
	WebElement element;
	List<WebElement> listWebElement;
	Select dropdown;
	@Test
	public void test0(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr" );
		element = driver.findElement(By.xpath("//a[contains(text(),'Toutes les actualités')]"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//a[contains(text(),'Accueil')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
}

