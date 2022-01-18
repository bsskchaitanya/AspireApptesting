package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ManufactureOrdersPage {
	WebDriver d;
	private By createButton=By.cssSelector("button[type='button'][accesskey='c']");
	public ManufactureOrdersPage(WebDriver d){
		this.d =d;
	}
	public WebElement getcreateButtonElement() {
		return d.findElement(createButton);
	}
}
