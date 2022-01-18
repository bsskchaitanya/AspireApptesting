package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
	WebDriver d;
	private By createbutton=By.cssSelector("button[type='button'][accesskey='c']");
	private By search=By.cssSelector("input[type='text']");
	private By retrieveProducts=By.cssSelector("strong[class='o_kanban_record_title']");
	private By titles=By.cssSelector("strong[class='o_kanban_record_title']");
	public ProductsPage(WebDriver d){
		this.d =d;
	}
	public By getSearchBy() {
		return search;
	}

	public WebElement getcreatebutton() {
		return d.findElement(createbutton);
	}
	public WebElement getSearch() {
		return d.findElement(search);
	}
	public List<WebElement> getRetrieveProducts() {
		return d.findElements(retrieveProducts);
	}
}
