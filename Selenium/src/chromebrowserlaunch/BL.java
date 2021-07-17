package chromebrowserlaunch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BL {
	
	public static void main(String[]arg) throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://220.156.188.223:9990/Pms");
	driver.manage().window().maximize();

	driver.findElementById("inlineRadio2").click();

	driver.findElementByName("username").sendKeys("mprgpvno");

	driver.findElementByName("password").sendKeys("@12345");

	driver.findElement(By.cssSelector("button[class='btn btn-primary conbutton']")).click();	
	
	WebDriverWait popupwait = new WebDriverWait(driver,9);
	try {
	popupwait.until(ExpectedConditions.alertIsPresent());
    Alert alert = driver.switchTo().alert();
    System.out.println(alert.getText());
    alert.accept(); 
    }
	
	catch (NoAlertPresentException noe ){
	System.out.println("no pupup found");
			
			
}
	}
	
}   
