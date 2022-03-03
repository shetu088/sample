package connections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static WebDriver driver;	
	
	public void setup()
	{
	System.setProperty("webdriver.chorme.driver", "C:\\Users\\SHRESSIN\\Downloads\\chromedriver_win32 (3)");
	driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
	}
	
	
}
