package firstpage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstclass {
public static void main(String arg[])
{
System.setProperty("webdriver.chrome.driver","F:\\eclipse\\chromedriver.exe");	
ChromeDriver driver=new ChromeDriver();
driver.get("https://teqip-pms.gov.in/logi");
driver.manage().window().maximize();
driver.findElements((By) driver.findElementById(""));
}
}
