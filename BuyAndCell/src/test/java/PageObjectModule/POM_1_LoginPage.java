package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_1_LoginPage
{
	@FindBy(xpath = "//input[@id='txtUserID']") private WebElement userID;
	@FindBy(xpath = "//input[@id='txtTradingPassword']") private WebElement Passworld;
	@FindBy(xpath = "//a[@id='loginBtn']") private WebElement ClickOnSignin;
	
	public POM_1_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void USERID (String username)
	{
		userID.sendKeys(username);
	}
	
	public void PASSWORD (String password)
	{
		Passworld.sendKeys(password);
	}
	
	public void CLICKSIGNIN ()
	{
		ClickOnSignin.click();
	}

}
