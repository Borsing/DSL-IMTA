import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest6 {
	WebDriver driver;
	WebElement element;
	List<WebElement> listWebElement;
	Select dropdown;
	@Test
	public void test0(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr/rechercher" );
		element = driver.findElement(By.xpath("//*[@id='edit-search-api-fulltext']"))
		;
		element.sendKeys( "2007" );
		element = driver.findElement(By.xpath("//select[@id='edit-selecteur']"))
		;
		dropdown = new Select(element);
		dropdown.selectByVisibleText( "Le mois dernier" );
				
		element = driver.findElement(By.xpath("//input[@value='Appliquer les filtres']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//div[contains(text(),'Aucun résultat ne correspond à votre recherche')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
}

