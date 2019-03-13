package selenium.page.list;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.common.list.CommonMethod;
import selenium.common.list.SetupDriver;

public class Story2Page {
	
	CommonMethod utils = new CommonMethod();
	SetupDriver obj = new SetupDriver();
	
	WebDriver driver;
	
	public void openPage(String URL) {
		driver = obj.getChromeDriver();
		driver.get(URL);
	}
	public void closePage() {
		driver.close();
	}
	public String getAlertText(String xPath1) {
		driver.findElement(By.xpath(xPath1)).click();
		
		Alert alert = driver.switchTo().alert();
		String ret = alert.getText();
		alert.accept();
		
		return ret;
	}
}
