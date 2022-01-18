package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductUpdateQuantity {
	WebDriver d;
	private By createButton=By.cssSelector("button[type='button'][accesskey='c']");
	private By stockName=By.cssSelector("div[name='location_id'] input[type='text']");
	private By quantity=By.cssSelector("input[name='inventory_quantity']");
	private By saveButton=By.cssSelector("button[type='button'][accesskey='s']");
	
	public ProductUpdateQuantity(WebDriver d){
		this.d =d;
	}
	public WebElement getCreateButton() {
		return d.findElement(createButton);
	}
	public WebElement getStockName() {
		return d.findElement(stockName);
	}
	public WebElement getQuantity() {
		return d.findElement(quantity);
	}
	public WebElement getSaveButton() {
		return d.findElement(saveButton);
	}
}
