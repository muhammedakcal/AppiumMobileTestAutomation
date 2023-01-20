package tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass extends ExtentReportsDemo {


	static AppiumDriver<MobileElement> driver;
	static Properties prop;

	public Properties init_properties() throws IOException {
	    prop = new Properties();
		FileInputStream ip= new FileInputStream(".src/test/resources/apps/app.properties");
		prop.load(ip);
		return prop;


	}
	@BeforeTest
	public void setup() throws IOException {

		DesiredCapabilities caps = new DesiredCapabilities();

		init_properties();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, prop.getProperty("PLATFORM_NAME"));
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, prop.getProperty("PLATFORM_VERSION"));
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("PLATFORM_VERSION"));
		caps.setCapability(MobileCapabilityType.UDID, prop.getProperty("UDID"));
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, prop.getProperty("NEW_COMMAND_TIMEOUT"));
		caps.setCapability(MobileCapabilityType.APP, prop.getProperty("APP"));
		caps.setCapability(MobileCapabilityType.BROWSER_NAME, prop.getProperty("BROWSER_NAME"));

		try {
			URL url = new URL(prop.getProperty("URL"));

			driver = new AppiumDriver<MobileElement>(caps);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		} catch (MalformedURLException e) {
			System.out.println("Cause is : " + e.getCause());
			System.out.println("Error Message : " + e.getMessage());
			e.printStackTrace();
		}


	}


	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();

	}



}

