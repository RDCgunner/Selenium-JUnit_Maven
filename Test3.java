package refactored;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class reactTC1 {
	
	ReactAppLogin Testpage;
	WebDriver driver;

	@Before
	public void beforeTest() {
		BaseTest setupDriver= new BaseTest();
		this.driver=setupDriver.BaseTestCreate();
		this.Testpage= new ReactAppLogin(this.driver);
		this.Testpage.connectURL(this.driver, "https://app.sensix.xyz");
	}

	@Test
	public void test() {
		Assert.assertTrue(this.Testpage.isLoginPage());
	}
	
	@After 
	public void afterTest()
	{
		this.Testpage.closeDriver(this.driver);
	}









}
