package qlytics.Regression;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qlytics.Lib.AppLibrary;
import qlytics.Lib.TestBase;

public class LoginUiTest extends TestBase {

	public Logger logger;

	@BeforeClass
	public void setUp() throws IOException {
		appLibrary = new AppLibrary();
		logger = Logger.getLogger("LoginUiTest");
		System.out.println("LoginUiTestStarted");
		PropertyConfigurator.configure("Log4j.properties");
		Reporter.log(
				"<h1><Center><Font face=\"arial\" color=\"Orange\">Log Summary</font></Center><h1><table border=\"1\" bgcolor=\"lightgray\">");

	}

	@Test
	public void LoginPageUi() throws Exception {
		driver = appLibrary.getDriverInstance();
		appLibrary.launchApp("");
		// new LoginPage(driver).LoginPageUi();
		// System.out.println("Verified Successfully ");
		
//		AppLibrary.enterText(driver, "xpath://input[@name='username']", "pepAdmin");
//		AppLibrary.enterText(driver, "xpath://input[@name='password']", "pep1234");
//		AppLibrary.clickElement(driver, "xpath://button[@data-testhook='loginButton']");
//		AppLibrary.clickElement(driver, "xpath:(//i[@class='far fa-edit'])[1]");
//		
//		Actions action = new Actions(driver);
//		// WebdriverWait is used to wait for a frame to be available. Once it is
//		// availble we switch to the frame to achieve our task
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		// To get source locator
//
//		WebElement sourceLocator = driver.findElement(By.xpath("(//i[@class='fas fa-th handle'])[1]"));
//		// To get target locator
//		WebElement targetLocator = driver.findElement(By.xpath("(//i[@class='fas fa-arrow-alt-circle-down new-step-plus mt-2'])[1]"));
//		// dragAndDrop(source, target) method accepts two parameters source and
//		// locator.
//		// used dragAndDrop method to drag and drop the source locator to target
//		// locator
////		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
//		
//
//		Action dragAndDrop = action.clickAndHold(sourceLocator)
//		.moveToElement(targetLocator)
//		.release(targetLocator)
//		.build();
//
//		dragAndDrop.perform();
		
		Actions action = new Actions(driver);
//		// WebdriverWait is used to wait for a frame to be available. Once it is
//		// availble we switch to the frame to achieve our task
//		WebDriverWait wait = new WebDriverWait(driver, 5);
//		// To get source locator
//
		WebElement sourceLocator = driver.findElement(By.xpath("(//li[contains(text(),'draggable')])[2]"));
		// To get target locator
		WebElement targetLocator = driver.findElement(By.xpath("(//div[@class='col-md-3'])[2]"));
////		 dragAndDrop(source, target) method accepts two parameters source and
////		 locator.
////		 used dragAndDrop method to drag and drop the source locator to target
////		 locator
//		action.dragAndDrop(sourceLocator, targetLocator).build().perform();
//	
		
		
		System.out.println("drag and drop");

	}

}
