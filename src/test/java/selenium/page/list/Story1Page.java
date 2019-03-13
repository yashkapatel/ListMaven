package selenium.page.list;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import selenium.common.list.CommonMethod;
import selenium.common.list.SetupDriver;

public class Story1Page {
	
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
	
	public List<WebElement> getHoveredAmazonList() {
		List<WebElement> hoveredList = utils.getHoveredList(driver,"//*[@id='nav-link-shopall']/span[2]","//*[@id=\"nav-flyout-shopAll\"]/div[2]/a/span");
		return hoveredList;
	}
	public List<WebElement> getHoveredFlipkartList() {
		List<WebElement> hoveredList = utils.getHoveredList(driver,"//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/span","//*[@id=\"container\"]/div/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li/a");
		return hoveredList;
	}
	public void printProperties() {
		System.out.println(utils.getPropertyValue("dbusername")); 
		System.out.println(utils.getPropertyValue("dbpassword"));
	}
}
