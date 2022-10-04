package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class POM_1_ChildBrowser 
{
	@FindBy(xpath ="//input[@id='txtBuySellPopQuantity']") private WebElement SelectQuantity;
	@FindBy(xpath = "//input[@id='txtBuySellPopPrice']") private WebElement SendPrice;
	@FindBy(xpath ="//select[@id='ddlBuySellPopProductType']")private  WebElement SelectIntraday;
	@FindBy(xpath = "(//button[text()='SUBMIT'])[1]")private WebElement ClickOnSubmitBtn;
	
	
	public POM_1_ChildBrowser(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectquantity () throws InterruptedException
	{
		Thread.sleep(3000);
		SelectQuantity.clear();
		Thread.sleep(3000);
		SelectQuantity.sendKeys("10");
	}
	
	public void selectprice (String Price) throws InterruptedException
	{
		SendPrice.clear();
		Thread.sleep(3000);
		SendPrice.sendKeys(Price);
	}
	
	public void selectTypeOfStock () throws InterruptedException
	{
		Thread.sleep(3000);
		Select select = new Select(SelectIntraday);
		select.selectByVisibleText("AMO INTRADAY");
	}
	
	public void ClickOnSubmit ()
	{
		ClickOnSubmitBtn.click();
	}
	
	
}
