package selenium.test.list;

import org.testng.annotations.Test;

import selenium.page.list.Story2Page;

public class Story2Test {
	
	@Test
	public void ActionTest() {

		Story2Page obj = new Story2Page();
		obj.openPage("https://www.jquery-az.com/javascript/demo.php?ex=151.0_1");
		String alertText = obj.getAlertText(".indtd button");
		System.out.println(alertText);
		System.out.println("success");
		obj.closePage();
	}

}
