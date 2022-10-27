package refactored;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;

	public WebDriver BaseTestCreate() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		return driver;
	}
	
	public void closeDriver(WebDriver driver) {
		this.driver=driver;
		driver.close();
	}
}
