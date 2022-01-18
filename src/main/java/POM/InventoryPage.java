package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage {
	WebDriver d;
	private By options=By.cssSelector("ul[class='o_menu_sections'] a.dropdown-toggle.o-no-caret.o_menu_header_lvl_1");
	private By productselect=By.xpath("//a[@class='dropdown-item o_menu_entry_lvl_2']//span[text()='Products'] ");
	private By applications=By.cssSelector("a[title='Applications']");
	
	public InventoryPage(WebDriver d){
		this.d =d;
	}
	public By getproductoptions() {
		return options;
	}
	public WebElement getproductMenubar() {
	List<WebElement> items =d.findElements(options);
	WebElement ele=null;
	for(WebElement item : items){
		if(item.getText().contains("Products")){
			ele= item;
		}
	}
		return ele;
	}
	public WebElement getproductselect() {
		return d.findElement(productselect);
	}
	public WebElement getApplications() {
		return d.findElement(applications);
	}
}
