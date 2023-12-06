package TestSearchWikipediaApp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WikipediaSearchTest {
	public WebDriver driver;
@Test
public void SearchApptest() {
	System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://qawikisearch.ccbp.tech/");
	driver.manage().window().maximize();
	//Find the input field with id searchInput- use (Relative) XPath Locator.
	WebElement e1=driver.findElement(By.xpath("//input[@id='searchInput']"));
	e1.sendKeys("HTML");
	WebElement e2=driver.findElement(By.xpath("//button[@id='submitButton']"));
	e2.click();
	WebDriverWait wait = new WebDriverWait(driver, 60); 
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='searchResults']/div")));
	List<WebElement> list=driver.findElements(By.xpath("//div[@id='searchResults']/div"));
	System.out.println(list.size()+" Results Found");
	driver.quit();
}
}
