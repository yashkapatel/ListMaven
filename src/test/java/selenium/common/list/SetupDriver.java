package selenium.common.list;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetupDriver {
	WebDriver driver;
	
	public WebDriver getChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\Mohwk_college\\Selenium\\selenium-driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    return driver;
	}
}
