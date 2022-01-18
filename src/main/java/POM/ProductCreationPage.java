package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductCreationPage {
	WebDriver d;
	private By prodName=By.cssSelector("input.o_field_char.o_field_widget.o_input.o_field_translate.o_required_modifier");
	private By saveButton=By.xpath("//button[contains(text(),'Save')]");
	private By UpdateQuantity=By.cssSelector("button[type='button'] span");
	
	public ProductCreationPage(WebDriver d){
		this.d =d;
	}
	public By getprodNameby() {
		return prodName;
	}
	public WebElement getprodName() {
		return d.findElement(prodName);
	}
	public WebElement getsaveButton() {
		return d.findElement(saveButton);
	}
}
