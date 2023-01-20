package appiumAndroidAutomation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class AndroidCalculatorTest {


	static AppiumDriver<MobileElement> driver;


	public static void main(String[] args) {


		try {

			openCalculator();
			calculatorOperation();

		} 

		catch (Exception exp) {
			System.out.println(exp.getCause());
			System.out.println(exp.getMessage());
			exp.printStackTrace();
		}
	}
	public static void openCalculator() throws MalformedURLException {


		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "$(device name)");
		cap.setCapability("udid", "$(device id)"); // Command - adb devices: List of connected devices 
		cap.setCapability("platformName", "$(platfor name: Android/IOS)");
		cap.setCapability("platformVersion", "$(Android Version)"); // See Android Version in your phone
		cap.setCapability("appPackage", "$(com.myos.calculator)"); // Install - [App Info] - in the pLaystore to see the app package directory
		cap.setCapability("appActivity", "$(com.myos.calculator/Calculator)"); // See the activities in the - [App Info] -


		
		URL url = new URL("http://127.0.0.1:4723/wd/hub"); // enter the port number

		driver = new AppiumDriver<MobileElement>(url,cap);

		System.out.println("Application Started..");




	}

	public static void calculatorOperation() {

		MobileElement one = driver.findElement(By.id("com.myos.calculator2:id/digit1")); 
		MobileElement two = driver.findElement(By.id("com.myos.calculator2:id/digit2")); 
		MobileElement plus = driver.findElement(By.id("com.myos.calculator2:id/plus")); 
		MobileElement equals = driver.findElement(By.id("com.myos.calculator2:id/equals")); 
		MobileElement result = driver.findElement(By.className("android.widget.EditText"));

		one.click();
		plus.click();
		two.click();
		equals.click();

		String res = result.getText();

		System.out.println("\n Result is: " + res);
	}
}
