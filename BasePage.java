package refactored;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.junit.BeforeClass;
//import org.junit.AfterClass;


public class BasePage extends BaseTest{
	
	public WebDriver connectURL (WebDriver driver, String URL ) {
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("The page directed "+URL);
		return driver;
	}
	
	public void clickButton(String xpath,WebDriver webdrv) throws Throwable {
		webdrv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(webdrv, Duration.ofSeconds(20));
		try {wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();}
		catch (Throwable e) {throw(e);}
		System.out.println("Button clicked");}
	
	public void writeTextToInput(String xpath, String text,WebDriver webdrv) throws Throwable{
		WebDriverWait wait = new WebDriverWait(webdrv, Duration.ofSeconds(20));
		try {wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).sendKeys(text);}
		catch (Throwable e) {throw(e);}
		System.out.println("Text written " + text);}
	
	
	public String readTextFromInput(String xpath,WebDriver webdrv) throws Throwable{
		WebDriverWait wait = new WebDriverWait(webdrv, Duration.ofSeconds(20));
		String text = "";
		try {text = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))).getText();}
		catch (Throwable e) {throw(e);}
		return text;}
	
	public Boolean elementIsPresent(String xpath,WebDriver webdrv) throws Throwable{
		WebDriverWait wait = new WebDriverWait(webdrv, Duration.ofSeconds(20));
		try {wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));}
		catch (Throwable e) { throw(e);}
		System.out.println("Element present");
		return true;}
	
	public void dropDownButtonClick(String xpath,String itemXpath, WebDriver webdrv) throws Throwable {
		webdrv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(webdrv, Duration.ofSeconds(20));
		try {wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath))).click();}
		catch (Throwable e) {throw(e);}
		System.out.println("Menu revealed");
		try {wait.until(ExpectedConditions.elementToBeClickable(By.xpath(itemXpath))).click();}
		catch (Throwable e) {throw(e);}
		System.out.println("Button clicked");}

}
