package selenium.test.list;

import org.testng.annotations.Test;

import selenium.page.list.Story2Page;

public class Story2Test {
	
	@Test
	public void ActionTestAmazon() {

		Story2Page obj = new Story2Page();
		obj.openPage("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		String alertText = obj.getAlertText("//*[@id='content']/p[8]/button");
		System.out.println(alertText);
		System.out.println("success");
		obj.closePage();
	}

}
