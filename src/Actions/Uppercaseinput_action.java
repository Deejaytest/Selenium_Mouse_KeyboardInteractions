package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uppercaseinput_action {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\c-deepak.jindal\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Implicit wait
		driver.get("https://www.amazon.com/");
		Actions a = new Actions(driver);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(searchbox).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	}
}
