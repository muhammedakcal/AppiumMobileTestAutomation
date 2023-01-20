package tests;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Tests extends BaseClass{


	@Test(priority = 1)
	public void testOne() {
		// creates a toggle for the given test, adds all log events under it    
		ExtentTest test1 = extent.createTest("MyFirstTest", "Sample description");

		test1.log(Status.INFO, "Test 1 started");

		driver.get("https://google.com");
		test1.log(Status.PASS, "Navigation completed : " + driver.getCurrentUrl());
		driver.findElement(By.name("q")).sendKeys("Automation");
		test1.log(Status.PASS, "Enter Automation in google search box");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		test1.log(Status.PASS, "Hit the keybord enter");

		test1.log(Status.INFO, "Test 1 completed");
	}

	@Test(priority = 2)
	public void loginTest() {
		driver.navigate().to("https://opemsource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath(".//*[normalize-space(text()) "
				+ "and normalize-space(.)='Login Panel'])[1]/following::span[1]")).click();


		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");

		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();


	}
}
