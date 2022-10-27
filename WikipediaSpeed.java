package refactored;

import org.openqa.selenium.WebDriver;

public class WikipediaSpeed extends BasePage{
	
	public WikipediaSpeed (WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean writeWordInSearchField (String word,WebDriver driver) {
		try {writeTextToInput("//*[@id='searchInput']",word, driver);}
		catch (Throwable e) {System.out.println(e);
//		driver.close();
		return false;
		}
		return true;}
	
	public boolean searchForWord(WebDriver driver) {
		try {clickButton("//*[@class='searchButton']",driver);}
		catch (Throwable e) {System.out.println(e);
//		driver.close();
		return false;
		}
		return true;
	}
	
	public boolean checkTitle(String titlexpath,WebDriver driver) {
		boolean site_loaded = false;
		try {site_loaded =elementIsPresent(titlexpath, driver);}
		catch (Throwable e) {System.out.println(e);
//		driver.close();
		return false;
		}
		return site_loaded;
	}
	
}
