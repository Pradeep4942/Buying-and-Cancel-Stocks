package Library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
   public WebDriver driver ;
   
   public void OpenBrawser ()
   {
	   System.setProperty("webdriver.chrome.driver",
				"C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		
	  driver = new ChromeDriver();  
	  driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
	  
   }

}
