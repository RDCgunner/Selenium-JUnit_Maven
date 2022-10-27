package refactored;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;

public class checkSiteSpeed {
	WikipediaSpeed Testpage;
	WebDriver driver;
	
	@Before
	public void beforeTest() {
		BaseTest setupDriver= new BaseTest();
		this.driver=setupDriver.BaseTestCreate();
		this.Testpage= new WikipediaSpeed(this.driver);}
		
	@Test
	public void test() {
		long stopwatch=System.currentTimeMillis();
		this.Testpage.connectURL(this.driver, "https://en.wikipedia.org/");
		this.Testpage.writeWordInSearchField("go game",this.driver);
		this.Testpage.searchForWord(this.driver);
		this.Testpage.checkTitle("//*[contains(text(),'Go (game)')]/parent::h1",this.driver);
		long duration_en = System.currentTimeMillis()- stopwatch;
		stopwatch=System.currentTimeMillis();
		this.Testpage.connectURL(this.driver, "https://de.wikipedia.org/");
		this.Testpage.writeWordInSearchField("Go (Spiel)",this.driver);
		this.Testpage.searchForWord(this.driver);
		this.Testpage.checkTitle("//*[contains(text(),'Go (Spiel)')]/parent::h1",this.driver);
		long duration_de = System.currentTimeMillis()- stopwatch;
		System.out.println("Value (ms) of site EN: "+duration_en+" vs DE: "+duration_de);
	}
	
	
	@After 
	public void afterTest()
	{
		this.Testpage.closeDriver(this.driver);
	}
	
}
