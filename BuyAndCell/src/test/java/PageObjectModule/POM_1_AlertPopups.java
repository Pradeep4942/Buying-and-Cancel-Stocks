package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_AlertPopups 
{
	@FindBy(xpath = "(//button[@type='button'])[14]") private WebElement ClickOnOK;
	@FindBy(xpath ="//button[text()='Ok']")private WebElement Confirm;
	
	public POM_1_AlertPopups(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public void AlertPopups() throws InterruptedException 
	{
		Thread.sleep(7000);
		ClickOnOK.click();	
	}
	
	public void ClickOnOKBtn() throws InterruptedException 
	{
		Thread.sleep(7000);
		Confirm.click();
	}

}
