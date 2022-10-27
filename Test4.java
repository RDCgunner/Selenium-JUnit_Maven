package refactored;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class reactTC4 {
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
		this.Testpage.DefaultLoginButton(this.driver);
		this.Testpage.fillUsername("demo@sensix.xyz",this.driver);
		this.Testpage.fillPassword("5RR2h841Pms",this.driver);
		this.Testpage.tryToLoginButton(this.driver);
		Assert.assertTrue(this.Testpage.isWorkspaceSelectionPage());
	}
	
	@After 
	public void afterTest()
	{
		this.Testpage.closeDriver(this.driver);
	}
}
