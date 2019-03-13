package selenium.test.list;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.page.list.Story1Page;

public class Story1Test {

	@Test
	public void ActionTestAmazon() {

		Story1Page obj = new Story1Page();
		obj.openPage("https://www.amazon.com/");
		List<WebElement> hoveredList = obj.getHoveredAmazonList();

		for (int i = 0; i < hoveredList.size(); i++) {
			System.out.println(hoveredList.get(i).getText());
		}
		System.out.println("success");
		obj.closePage();
		System.out.println();
	}

	@Test
	public void ActionTestFlipkart() {
		/** Flipkart test **/
		Story1Page obj = new Story1Page();

		obj.openPage("https://www.flipkart.com/");

		List<WebElement> hoveredList = obj.getHoveredFlipkartList();

		System.out.println(hoveredList.size());
		for (int i = 0; i < hoveredList.size(); i++) {
			System.out.println(hoveredList.get(i).getAttribute("title"));
		}
		System.out.println("success");
		obj.closePage();

		obj.printProperties();
	}

}
