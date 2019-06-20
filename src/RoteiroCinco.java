import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoteiroCinco {

	@Test
	public void roteiro_cinco_rodrigo_e_douglas() throws InterruptedException {		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver_win32/chromedriver.exe");		
		WebDriver browser = new ChromeDriver();
		
		// Abrir o site: https://www.wikipedia.org/
		browser.get("https://www.wikipedia.org/");
		Thread.sleep(5000);
		
		// Clicar no link: Polski
	    browser.findElement(By.xpath("//a[@href='//pl.wikipedia.org/']")).click();
	    Thread.sleep(5000);
	    
	    // No campo de busca (localizado no canto superior direito da tela), digite: Testowanie oprogramowania
	    WebElement searchBox = browser.findElement(By.name("search"));
	    searchBox.sendKeys("Testowanie oprogramowania");
	    searchBox.submit();
	    Thread.sleep(5000);
	    
	    // Abrir o site: https://google.com
	    browser.get("https://www.google.com");
	    Thread.sleep(5000);
	    
	    // No campo de busca, digite: Puchar Świata, Polska
	    WebElement element = browser.findElement(By.name("q"));
	    element.sendKeys("Puchar Świata, Polska");
	    
	    // Clique no botão: Pesquisa Google
	    element.submit();
	    Thread.sleep(5000);
	    
	    // Clique na aba: Notícias
	    browser.findElement(By.cssSelector("a[class='q qs']")).click();
	    Thread.sleep(5000);
	    
		browser.close();
	}
}
