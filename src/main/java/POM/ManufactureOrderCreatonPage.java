package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManufactureOrderCreatonPage {
	WebDriver d;
	private By name=By.xpath("//div[@name='product_id']//a[@role='button']//preceding::input[@type='text']");
	private By quantity=By.cssSelector("input[name='product_qty'][id*='o_field_input_'][type='text']");
	private By addALine=By.xpath("//a[text()='Add a line']");
	private By prodName=By.xpath("(//div[@name='product_id']//a[@role='button']//preceding::input[@type='text'])[11]");
	private By prodquantity=By.cssSelector("input[name='product_uom_qty']");
	private By action_confirm=By.cssSelector("button[name='action_confirm'] span");
	private By button_mark_done=By.xpath("//button[@name='button_mark_done']//span[text()='Mark as Done']");
	private By accept=By.cssSelector("button[name='process'] span");
	private By save=By.cssSelector("button[type='button'][accesskey='s']");
	public ManufactureOrderCreatonPage(WebDriver d){
		this.d =d;
	}
	public WebElement getnameElement() {
		return d.findElement(name);
	}
	public WebElement getquantityElement() {
		return d.findElement(quantity);
	}
	public WebElement getaddALineElement() {
		return d.findElement(addALine);
	}
	public WebElement getprodNameElement() {
		return d.findElement(prodName);
	}
	public WebElement getprodquantityElement() {
		return d.findElement(prodquantity);
	}
	public WebElement getaction_confirmElement() {
		return d.findElement(action_confirm);
	}
	public WebElement getbutton_mark_doneElement() {
		return d.findElement(button_mark_done);
	}
	public WebElement getacceptElement() {
		return d.findElement(accept);
	}
	public WebElement getsaveElement() {
		return d.findElement(save);
	}
}
