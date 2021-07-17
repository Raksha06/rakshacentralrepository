package firstpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice1 {
public static void main(String arg[]) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver","F:\\eclipse\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://220.156.188.223:9990/Pms/login");
driver.manage().window().maximize();
WebElement drive1r=driver.findElement(By.cssSelector("input[id='inlineRadio2']"));
drive1r.click();
WebElement drive1s=driver.findElement(By.cssSelector("input[name='username']"));
drive1s.sendKeys("helpdeskuser");;
WebElement drive1t=driver.findElement(By.cssSelector("input[name='password']"));
drive1t.sendKeys("@12345");
WebElement drive1u=driver.findElement(By.cssSelector("button[class='btn btn-primary']"));
drive1u.click();
WebDriverWait w=new WebDriverWait(driver,5);
w.until(ExpectedConditions.elementToBeClickable(drive1u));
}
}
