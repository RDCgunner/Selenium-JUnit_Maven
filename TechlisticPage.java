package refactored;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TechlisticPage extends BasePage{
	
	public TechlisticPage (WebDriver driver) {
		this.driver=driver;
	}

	public boolean addSeleniumUserFirstName (String firstName,WebDriver driver) {
		try {writeTextToInput("//input[@name='firstname']",firstName, driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean addSeleniumUserLastName (String lastname,WebDriver driver) {
		try {writeTextToInput("//input[@name='lastname']",lastname, driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean addSeleniumUserFemale (WebDriver driver) {
		try {clickButton("//input[@name='sex' and @value='Female']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean addSeleniumUserMale (WebDriver driver) {
		try {clickButton("//input[@name='sex' and @value='Male']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean addSeleniumUserYoX(int years,WebDriver driver) {
		switch (years){
			case 1:
				try {clickButton("//input[@id='exp-0']", driver);}
				catch (Throwable e) {System.out.println(e);
									return false;}
			case 2:
				try {clickButton("//input[@id='exp-1']", driver);}
				catch (Throwable e) {System.out.println(e);
									return false;}
			case 3:
				try {clickButton("//input[@id='exp-2']", driver);}
				catch (Throwable e) {System.out.println(e);
									return false;}		
		}
		return true;
		}
	
	public boolean addSeleniumUserProfessionAutomation (WebDriver driver) {
		try {clickButton("//input[@id='profession-1']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	public boolean addSeleniumUserToolSeleniumWD (WebDriver driver) {
		try {clickButton("//input[@id='tool-2']", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	
	
	public boolean addCompleteUser(String firstname, 
									String lastname, 
									int years,
									WebDriver driver ) {
		try {writeTextToInput("//input[@name='firstname']",firstname, driver);
			writeTextToInput("//input[@name='lastname']",lastname, driver);
			clickButton("//input[@name='sex' and @value='Female']", driver);
			switch (years) {
			case 1:
				clickButton("//input[@id='exp-0']", driver);
			case 2:
				clickButton("//input[@id='exp-1']", driver);	
			case 3:
				clickButton("//input[@id='exp-2']", driver);
			}
			clickButton("//input[@id='profession-1']", driver);
			clickButton("//input[@id='tool-2']", driver);
			driver.findElement(By.id("submit")).click();
			driver.findElement(By.name("firstname")).clear();
			driver.findElement(By.name("lastname")).clear();
			}
		catch (Throwable e) {System.out.println(e);
		return false;
		}
		return true;}
	
	
	public boolean checkSubmissionOK() {
		boolean test_complete = false;
		try {test_complete =elementIsPresent("//*[contains(text(),'AUTOMATION PRACTICE ME')]", driver);}
		catch (Throwable e) {System.out.println(e);
		return false;}
		return test_complete;
	}
	
	
}
