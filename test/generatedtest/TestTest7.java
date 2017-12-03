import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest7 {
	WebDriver driver;
	WebElement element;
	List<WebElement> listWebElement;
	Select dropdown;
	@Test
	public void test0(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		String var1 ;
		String var2 ;
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr" );
		var1 =   driver.findElement(By.xpath("//*[@class='actu_home_ctner_inner_cell1_titre']"))
		.getText()
		 ;
		var2 =   driver.findElement(By.xpath("//*[@class='actu_home_ctner_inner_cell1_titre']")).findElement(By.xpath(".."))
		.getAttribute("pathname")
		 ;
		driver.get( "http://www.imt-atlantique.fr/fr/rechercher" );
		element = driver.findElement(By.xpath("//*[@id='edit-search-api-fulltext']"))
		;
		element.sendKeys( var1 );
		element = driver.findElement(By.xpath("//input[@value='Appliquer les filtres']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//a[@href='"+var2+"']"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
}

