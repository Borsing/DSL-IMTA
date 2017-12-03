import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest1 {
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
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//a[@title='Toutes les actualit�s' and contains(text(),'Toutes les actualit�s')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
}

