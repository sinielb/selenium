package test.web.clase;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Choucairtesting {
	
	private WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.magneto365.com/es/empleos/choucair");
		
	}
	
	@Test
	public void testChoucairPage() {
		
		WebElement searchbox = driver.findElement(By.name("search[search_query]"));
		
		searchbox.clear();
		
		searchbox.sendKeys("Automatizador de pruebas");
		
		searchbox.submit();
		
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		assertEquals("Automatizador de pruebas",driver.getTitle());
		
	}
	

}
