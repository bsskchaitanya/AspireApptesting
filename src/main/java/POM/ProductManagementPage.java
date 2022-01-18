package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductManagementPage {
	WebDriver d;
	private By totalbuttons=By.cssSelector("button[type='button'] span");
	
	public ProductManagementPage(WebDriver d){
		this.d =d;
	}
	public void selectUpdateQuantity() {
		List<WebElement> prodelements = d.findElements(totalbuttons);
		for (WebElement e : prodelements) {
			if (e.getText().equalsIgnoreCase("Update Quantity")) {
				e.click();
				break;
			}

		}
	}
}
