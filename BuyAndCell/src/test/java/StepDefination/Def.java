package StepDefination;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import Library.BaseClass;
import Library.UtilityClass;
import PageObjectModule.POM_1_AlertPopups;
import PageObjectModule.POM_1_CancelOrders;
import PageObjectModule.POM_1_ChildBrowser;
import PageObjectModule.POM_1_ClosePopup;
import PageObjectModule.POM_1_ConfirmPopups;
import PageObjectModule.POM_1_LoginPage;
import PageObjectModule.POM_1_SearchSBIN;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Def extends BaseClass 
{
	POM_1_LoginPage login1;
	POM_1_ClosePopup login2;
	POM_1_SearchSBIN login3;
	POM_1_ChildBrowser login4 ;
	POM_1_ConfirmPopups login5;
	POM_1_CancelOrders login6;
	POM_1_AlertPopups login7;
	
	@Given("User can lauch chrome Browser")
	public void user_can_lauch_chrome_browser()
	{
	    OpenBrawser();
	    login1 = new POM_1_LoginPage(driver);
	    login2 = new POM_1_ClosePopup(driver);
	    login3 = new POM_1_SearchSBIN(driver);
	    login4 = new POM_1_ChildBrowser(driver);
	    login5 = new POM_1_ConfirmPopups(driver);
	    login6 = new POM_1_CancelOrders(driver);
	    login7 = new POM_1_AlertPopups(driver);
	}

	@When("User Open the AngleBroking login webpage URL. {string}")
	public void user_open_the_angle_broking_login_webpage_url(String URL)
	{
	   driver.get(URL); 
	}

	@Then("User pass the UserID and Password")
	public void user_pass_the_user_id_and_password() throws EncryptedDocumentException, IOException 
	{
	    login1.USERID(UtilityClass.ExcelSheet(0, 0));
	    login1.PASSWORD(UtilityClass.ExcelSheet(0, 1));
	}

	@Then("Click on  Signin button")
	public void click_on_signin_button()
	{
	 login1.CLICKSIGNIN();  
	}

	@When("Shows hidden division popups and Close it")
	public void shows_hidden_division_popups_and_close_it() throws InterruptedException
	{
		login2.ClosePopups();
	    
	}

	@Then("Click on Search icon and search sbin Stock. {string}")
	public void click_on_search_icon_and_search_sbin_stock(String StockSBIN) throws InterruptedException
	{
	   login3.ClickOnSearch();
	   login3.SearchStock(StockSBIN);
	   
	}

	@Then("Select sbin NSE")
	public void select_sbin_nse() throws InterruptedException 
	{
		login3.SelectSBIN(driver);
	}

	@Then("Click on Buy button")
	public void click_on_buy_button() 
	{
		login3.ClickOnBuy();
	}

	@When("Shows SBIN Chied Brawser popups and select the quantity")
	public void shows_sbin_chied_brawser_popups_and_select_the_quantity() throws InterruptedException 
	{
		login4.selectquantity();
	}

	@Then("Select the Price clear first and type ne price {string} and Select the Product type AMO INTRADAY")
	public void select_the_price_clear_first_and_type_ne_price_and_select_the_product_type_amo_intraday(String price) throws InterruptedException
	{
	   login4.selectprice(price);
	   login4.selectTypeOfStock();
	}

	@Then("Click on Submit button")
	public void click_on_submit_button()
	{
	   login4.ClickOnSubmit();
	}

	@Then("Open new small window click on Confirm button")
	public void open_new_small_window_click_on_confirm_button() throws InterruptedException
	{
	   login5.ClickOnConfirm(driver);
	}

	@When("Confirm the stock and select that stock and click on cancle all button")
	public void confirm_the_stock_and_select_that_stock_and_click_on_cancle_all_button() throws InterruptedException 
	{
	   login6.SelecAllOrders();
	   login6.ClickOnCancelBtn();
	}

	@Then("Open alert popups click on OK button")
	public void open_alert_popups_click_on_ok_button() throws InterruptedException
	{
	    login7.AlertPopups();
	}

	@Then("Show the new popups give the message Order cancelld successfully click on OK button")
	public void show_the_new_popups_give_the_message_order_cancelld_successfully_click_on_ok_button() throws InterruptedException 
	{
	   login7.ClickOnOKBtn();
	}
	
	@Then("Close the Browser")
	public void close_the_browser()
	{
	    driver.close();
	}

}
