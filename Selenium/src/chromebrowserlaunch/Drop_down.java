package chromebrowserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_down extends BL {
	
	
	public static void main(String[]arg)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Drop_down drop= new Drop_down();
		WebElement drop1 = driver.findElement(By.name("TextM"));
	    drop.drop_down_selection(drop1, 1);
		
		
	}
	public void drop_down_selection(WebElement element, int indexno)
	{
		
	}
	
}
