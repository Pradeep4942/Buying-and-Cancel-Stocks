package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_CancelOrders 
{
	@FindBy(xpath = "//input[@id='chkSelectAll']")private WebElement SelecttheOrder;
	@FindBy(xpath = "//button[text()='CANCEL ALL']")private WebElement Clickoncancel;
	
	public POM_1_CancelOrders(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void SelecAllOrders() throws InterruptedException 
	{
		Thread.sleep(7000);
		SelecttheOrder.click();
	}
	
	public void ClickOnCancelBtn() throws InterruptedException
	{
		Thread.sleep(4000);
		Clickoncancel.click();
	}

}
