package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_SearchSBIN 
{
	@FindBy(xpath = "//div[@class='search_bar']") private WebElement ClickSearch;
	@FindBy(xpath = "//input[@class='form-control ui-autocomplete-input']")private WebElement SearchSBIN;
//	@FindBy(xpath ="//ul[@id='ui-id-1']")private WebElement namesbin;
	@FindBy(xpath ="(//li[@class='ui-menu-item'])[1]") private WebElement namesbin;
	@FindBy(xpath = "(//a[@class='btn btn-filled'])[2]") private WebElement clickonSBINbtn;
	public POM_1_SearchSBIN(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnSearch () throws InterruptedException
	{
		Thread.sleep(3000);
		ClickSearch.click();
	}
	
	public void SearchStock (String SBIN) throws InterruptedException
	{   
		Thread.sleep(3000);
		SearchSBIN.sendKeys(SBIN);
	}
	
	public void SelectSBIN (WebDriver driver) throws InterruptedException
	{
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.click(namesbin).perform();
		//namesbin.click();
	}
	
	public void ClickOnBuy ()
	{
		clickonSBINbtn.click();
	}

}
