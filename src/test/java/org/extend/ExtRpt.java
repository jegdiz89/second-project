package org.extend;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtRpt {

	WebDriver driver;
	ExtentReports extentReports;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentTest createtest;

	@BeforeSuite
	private void beforesuite() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ELCOT\\eclipse-workspace\\NestGentest\\Drivers\\chromedriver.exe");
		extentReports = new ExtentReports();
		extentHtmlReporter = new ExtentHtmlReporter("./Ntest/Websearch.html");
		extentReports.attachReporter(extentHtmlReporter);
		driver = new ChromeDriver();

	}

	@Test
	private void opengoogle() throws IOException {

		createtest = extentReports.createTest("Validating Google");
		driver.get("https://www.google.com/");
		createtest.log(Status.INFO, "Expected text is google");
		if (driver.getCurrentUrl().contains("java")) {
			createtest.log(Status.PASS, "The URL is Contains respective Text");
		} else {
			createtest.log(Status.FAIL, "The URL doesnot Contains respective Text");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Java_crash_course\\google.png");
			FileHandler.copy(src, dest);
			createtest.addScreenCaptureFromPath("D:\\Java_crash_course\\google.png");
			
		}

	}

	@Test
	private void openBing() throws IOException {

		createtest = extentReports.createTest("Validatin Bing");
		driver.get("https://www.bing.com/");
		createtest.log(Status.INFO, "Expected site is bing");
		if (driver.getTitle().equals("het")) {
			createtest.log(Status.PASS, "Landed web page is correct");
		} else {
			createtest.log(Status.FAIL, "This is not an correct webpage");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Java_crash_course\\Bing.png");
			FileHandler.copy(screenshotAs, dest);
			createtest.addScreenCaptureFromPath("D:\\Java_crash_course\\Bing.png");
		}
	}

	@Test
	private void openWiki() throws IOException {
		createtest = extentReports.createTest("Validating Wiki");
		driver.get("https://www.wikipedia.org/");
		createtest.log(Status.INFO, "Expected url is wiki");
		WebElement findElement = driver.findElement(By.xpath("//strong[text()='The Free Encyclopedia']"));
		boolean contains = findElement.getText().contains("Free");

		if (contains == true) {
			createtest.log(Status.PASS, "It contains relevant text");
			// TakesScreenshot ts =(TakesScreenshot) driver;
			// File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			// File dest = new File("wik.png");
			// FileHandler.copy(screenshotAs, dest);
			// createtest.addScreenCaptureFromPath("wik1.png");
		} else {
			createtest.log(Status.FAIL, "not contains the text");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("D:\\Java_crash_course\\wik.png");
			FileHandler.copy(screenshotAs, dest);
			createtest.addScreenCaptureFromPath("D:\\Java_crash_course\\wik.png");
		}
	}

	@AfterSuite
	private void aftersuite() {
		extentReports.flush();
	}

}
