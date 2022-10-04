package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_ClosePopup 
{
	@FindBy(xpath = "//button[@id='tabclose']") private WebElement ClickClose;
	
	public POM_1_ClosePopup(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ClosePopups () throws InterruptedException
	{
		Thread.sleep(7000);
		ClickClose.click();
	}

}
