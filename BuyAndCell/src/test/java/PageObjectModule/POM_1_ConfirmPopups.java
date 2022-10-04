package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_ConfirmPopups 
{
	@FindBy(xpath = "//button[@id='btnConfrimBuySellPop']")private WebElement ClickOnConfirmBtn;
	
	public POM_1_ConfirmPopups(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void ClickOnConfirm(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(7000);
		ClickOnConfirmBtn.click();
	}


}
