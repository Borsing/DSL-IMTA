import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import org.junit.Assert;

public class TestTest {
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
		.findElement(By.xpath("//a[@title='Toutes les actualités' and contains(text(),'Toutes les actualités')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
	@Test
	public void test1(){
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
	@Test
	public void test2(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr" );
		element = driver.findElement(By.xpath("//a[contains(text(),'Toutes les actualités')]"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.xpath("//img[@alt='Accueil']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//a[@title='Toutes les actualités']"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
	@Test
	public void test3(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr/rechercher" );
		element = driver.findElement(By.xpath("//input[@id='edit-search-api-fulltext']"))
		;
		element.sendKeys( "Donald Trump" );
		element = driver.findElement(By.xpath("//*[@id='edit-submit-recherche2']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		element = driver.findElement(By.tagName("body"))
		.findElement(By.xpath("//div[contains(text(),'Aucun résultat ne correspond à votre recherche')]"))
		;
		Assert.assertNotNull(element);
		driver.quit();
	}
	@Test
	public void test4(){
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
	@Test
	public void test5(){
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
	@Test
	public void test6(){
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
	@Test
	public void test7(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		String var1 ;
		String var2 ;
		driver = new  ChromeDriver();
		driver.get( "http://www.imt-atlantique.fr/fr/rechercher" );
		element = driver.findElement(By.xpath("//*[@id='edit-search-api-fulltext']"))
		;
		element.sendKeys( "2007" );
		element = driver.findElement(By.xpath("//input[@value='Appliquer les filtres']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		var1 =   Integer.toString(driver.findElements(By.xpath("//div[@class='views-row']"))
		.size())
		 ;
		element = driver.findElement(By.xpath("//select[@id='edit-selecteur']"))
		;
		dropdown = new Select(element);
		dropdown.selectByVisibleText( "Le mois dernier" );
				
		element = driver.findElement(By.xpath("//input[@value='Appliquer les filtres']"))
		;
		((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
		var2 =   Integer.toString(driver.findElements(By.xpath("//div[@class='views-row']"))
		.size())
		 ;
		Assert.assertEquals( var1 ,  var2 );
		driver.quit();
	}
	@Test
	public void test8(){
		if(System.getenv("chromedriver")!= null)
			System.setProperty("webdriver.chrome.driver", System.getenv("chromedriver"));
		driver = new  ChromeDriver();
		myFunction( "Communiqués de Presse" );
		myFunction( "Dossiers de Presse" );
		myFunction( "Visuels pour la Presse" );
		myFunction( "La presse en parle " );
		myFunction( "Tribunes de presse" );
		myFunction( "Les palmarès" );
		driver.quit();
	}
	public void myFunction(String param1) {
	driver.get( "http://www.imt-atlantique.fr/fr" );
	element = driver.findElement(By.xpath("//a[contains(text(),'"+param1+"')]"))
	;
	((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	element = driver.findElement(By.tagName("body"))
	.findElement(By.xpath("//a[@title='Imprimer']"))
	;
	Assert.assertNotNull(element);
	element = driver.findElement(By.xpath("//a[@title='Imprimer']"))
	;
	((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	}
}

