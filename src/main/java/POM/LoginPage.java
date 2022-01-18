package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	WebDriver d;
	private By username=By.cssSelector("input#login");
	private By password=By.cssSelector("input#password");
	private By submit=By.cssSelector("button[type='submit']");
	public LoginPage(WebDriver d){
		this.d =d;
	}
	public WebElement getUsername() {
		return d.findElement(username);
	}
	public WebElement getPassword() {
		return d.findElement(password);
	}
	public WebElement getSubmit() {
		return d.findElement(submit);
	}
}
