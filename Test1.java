package refactored;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert;

public class addSeleniumUsers {
	TechlisticPage Testpage;
	WebDriver driver;

	
	@Before
	public void beforeTest() {
		BaseTest setupDriver= new BaseTest();
		this.driver=setupDriver.BaseTestCreate();
		this.Testpage= new TechlisticPage(this.driver);
		this.Testpage.connectURL(this.driver, "https://www.techlistic.com/p/selenium-practice-form.html");
	}

	@Test
	public void test() {
//		Assert.assertTrue(this.Testpage.addSeleniumUserFirstName("ANA", this.driver));
//		Assert.assertTrue(this.Testpage.addSeleniumUserLastName("STONE", this.driver));
//		Assert.assertTrue(this.Testpage.addSeleniumUserFemale(this.driver));
//		Assert.assertTrue(this.Testpage.addSeleniumUserMale(this.driver));
//		Assert.assertTrue(this.Testpage.addSeleniumUserYoX(2,this.driver));
		
		this.Testpage.addCompleteUser("Ana","Stone",1,this.driver);
		this.Testpage.addCompleteUser("Jane","Turner",2,this.driver);
		this.Testpage.addCompleteUser("Lisa","Warden",3,this.driver);
		Assert.assertTrue(this.Testpage.checkSubmissionOK());
	}
	
	@After 
	public void afterTest()
	{
		this.Testpage.closeDriver(this.driver);
	}

}
