import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest5 {
	WebDriver driver;
	WebElement element;
	List<WebElement> listWebElement;
	Select dropdown;
	@Test
	public void test0(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr/formation/trouver-ma-formation" );
		listWebElement = driver.findElements(By.xpath("//input[@type='checkbox']"))
		;
		for (WebElement e : listWebElement){
			if(e.isSelected())
			  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", e);
		}
		element = driver.findElement(By.xpath("//label[contains(text(),'Anglais')]"))
		;
		if(!element.isSelected()){
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		}
		element = driver.findElement(By.xpath("//label[contains(text(),'A domicile')]"))
		;
		if(!element.isSelected()){
			((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		}
		element = driver.findElement(By.xpath("//input[@value='Appliquer les critères']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//div[contains(text(),'Aucune formation trouvée répondant à vos critères')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
}

