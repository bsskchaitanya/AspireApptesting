package testcases;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.ApplicationsPage;
import POM.InventoryPage;
import POM.LoginPage;
import POM.ManufactureOrderCreatonPage;
import POM.ManufactureOrdersPage;
import POM.ProductCreationPage;
import POM.ProductManagementPage;
import POM.ProductUpdateQuantity;
import POM.ProductsPage;
import utilities.base;

public class testcases extends base {
	@Test
	public void createaccount() throws IOException, InterruptedException {

		WebDriver d = initialmethd();
		Properties prop = getProperties();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyyhhmmss");
		String formatteddate = sdf.format(date);
		String prodName="DummyProducts"+"_"+formatteddate; // some random name
		Wait w = new WebDriverWait(d, Duration.ofSeconds(20));
		String url = prop.getProperty("url");
		String username = prop.getProperty("username");
		String password = prop.getProperty("password");
		d.get(url);
		LoginPage loginPage= new LoginPage(d);
		loginPage.getUsername().sendKeys(username);
		loginPage.getPassword().sendKeys(password);
		loginPage.getSubmit().click();
		ApplicationsPage applicationsPage = new ApplicationsPage(d);
		w.until(ExpectedConditions.visibilityOfElementLocated(applicationsPage.getInventory()));
		applicationsPage.getInventoryElement().click();
		InventoryPage inventoryPage=new InventoryPage(d);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(inventoryPage.getproductoptions()));
		inventoryPage.getproductMenubar().click();
		inventoryPage.getproductselect().click();
		Thread.sleep(3000);
		ProductsPage ProductsPage= new ProductsPage(d);
		w.until(ExpectedConditions.visibilityOf(ProductsPage.getcreatebutton()));
		ProductsPage.getcreatebutton().click();
		ProductCreationPage productCreationPage = new ProductCreationPage(d);
		w.until(ExpectedConditions.visibilityOfElementLocated(productCreationPage.getprodNameby()));
		productCreationPage.getprodName().sendKeys(prodName);
		productCreationPage.getsaveButton().click();
		Thread.sleep(3000);
		inventoryPage.getproductMenubar().click();
		inventoryPage.getproductselect().click();
		w.until(ExpectedConditions.visibilityOfElementLocated(ProductsPage.getSearchBy()));
		ProductsPage.getSearch().sendKeys(prodName);
		ProductsPage.getSearch().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		List<WebElement> elements = ProductsPage.getRetrieveProducts();
		for (WebElement e : elements) {
			if (e.getText().equalsIgnoreCase(prodName)) {
				e.click();
				break;
			}
		}
		Thread.sleep(3000);
		ProductManagementPage productManagementPage = new ProductManagementPage(d);
		productManagementPage.selectUpdateQuantity();
		Thread.sleep(3000);
		ProductUpdateQuantity productUpdateQuantity = new ProductUpdateQuantity(d);
		productUpdateQuantity.getCreateButton().click();
		Thread.sleep(3000);
		productUpdateQuantity.getStockName().sendKeys("WH/Stock");
		Thread.sleep(8000);
		productUpdateQuantity.getStockName().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		productUpdateQuantity.getQuantity().clear();
		productUpdateQuantity.getQuantity().sendKeys("10000.00");
		productUpdateQuantity.getSaveButton().click();
		Thread.sleep(3000);
		inventoryPage.getApplications().click();
		applicationsPage.getManufacturingElement().click();
		Thread.sleep(3000);
		ManufactureOrdersPage manufactureOrdersPage = new ManufactureOrdersPage(d);
		Thread.sleep(3000);
		manufactureOrdersPage.getcreateButtonElement().click();
		ManufactureOrderCreatonPage manufactureOrderCreatonPage = new ManufactureOrderCreatonPage(d);
		Thread.sleep(3000);
		manufactureOrderCreatonPage.getnameElement().sendKeys(prodName);
		Thread.sleep(3000);
		manufactureOrderCreatonPage.getnameElement().sendKeys(Keys.ENTER);
		manufactureOrderCreatonPage.getquantityElement().clear();
		manufactureOrderCreatonPage.getquantityElement().sendKeys("1000.00");
		manufactureOrderCreatonPage.getquantityElement().sendKeys(Keys.ENTER);
		manufactureOrderCreatonPage.getaddALineElement().click();
		Thread.sleep(6000);
		manufactureOrderCreatonPage.getprodNameElement().sendKeys(prodName);
		Thread.sleep(3000);
		manufactureOrderCreatonPage.getprodNameElement().sendKeys(Keys.ENTER);
		manufactureOrderCreatonPage.getprodquantityElement().clear();
		manufactureOrderCreatonPage.getprodquantityElement().sendKeys("1000.00");
		manufactureOrderCreatonPage.getaction_confirmElement().click();
		Thread.sleep(3000);
		manufactureOrderCreatonPage.getsaveElement().click();
			}

}
