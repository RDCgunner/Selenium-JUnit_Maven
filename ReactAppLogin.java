package refactored;

import org.openqa.selenium.WebDriver;


public class ReactAppLogin extends BasePage{
	
	public ReactAppLogin (WebDriver driver) {
		this.driver=driver;
		}

	public void sleepOneSecond() {
		try {Thread.sleep(1500);} 
		catch(InterruptedException e) {System.out.println("Sleep interrupted");}
		}

	public boolean DefaultLoginButton(WebDriver driver) {
		try {clickButton("//*[contains(text(),'Default Login')]",driver);}
		catch (Throwable e) {System.out.println(e);
							return false;}
		return true;
		}
	
	public boolean OnPremiseLoginButton(WebDriver driver) {
		try {clickButton("//*[contains(text(),'On Premise Login')]",driver);}
		catch (Throwable e) {System.out.println(e);
							return false;}
		return true;
		}
	
	public boolean isDefaultLoginPage() {
		boolean found = false;
		try {found =elementIsPresent("//h3[text()='Default Login']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return found;
		}
	
	public boolean isLoginPage() {
		boolean found = false;
		try {found =elementIsPresent("//h3[text()='Login']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return found;
		}
	
	public boolean isOnPremiseLoginPage() {
		boolean found = false;
		try {found =elementIsPresent("//h3[text()='On Premise Login']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return found;
		}
	
	public boolean isWorkspaceSelectionPage() {
		boolean found = false;
		try {found =elementIsPresent("//h3[text()='Select workspace']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return found;
		}
	
	public boolean checkFailedLogin() {
		boolean found = false;
		try {found =elementIsPresent("//*[contains(text(),'No active account found with the given credentials')]", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return found;
		}
	
	public boolean fillUsername (String email,WebDriver driver) {
		try {writeTextToInput("//*[@name='email']",email, driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean fillPassword (String password,WebDriver driver) {
		try {writeTextToInput("//*[@name='password']",password, driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean tryToLoginButton(WebDriver driver) {
		try {clickButton("//*[text()='Login']//parent::button",driver);}
		catch (Throwable e) {System.out.println(e);
							return false;}
		return true;
		}
	
	
	

	
}
