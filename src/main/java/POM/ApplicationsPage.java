package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ApplicationsPage {
	WebDriver d;
	private By Inventory=By.cssSelector("a[id='result_app_1']");
	private By Manufacturing=By.cssSelector("a[id='result_app_2']");
	
	public By getInventory() {
		return Inventory;
	}
	public ApplicationsPage(WebDriver d){
		this.d =d;
	}
	public WebElement getInventoryElement() {
		return d.findElement(Inventory);
	}
	public WebElement getManufacturingElement() {
		return d.findElement(Manufacturing);
	}
}
