package org.extend;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtReport {
	WebDriver driver;
	ExtentReports extentReports;
	ExtentHtmlReporter extentHtmlReporter;
	ExtentTest createtest;
	
@Test
private void facebook() throws IOException {
	createtest=extentReports.createTest("validating fb india");
	createtest.log(Status.INFO, "Validating FB");	
driver.get("https://www.facebook.com/");

if(driver.getCurrentUrl().contains("Faacebook"))
{
	createtest.log(Status.PASS, "This is an valid URL");}

else
{
	createtest.log(Status.FAIL, "This is an Invalid URL");
	TakesScreenshot ts =(TakesScreenshot)driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("fb1.png");
FileHandler.copy(src,dest);
	createtest.addScreenCaptureFromPath("fb1.png");
		
}
}
@Test
private void facebook1() throws IOException {
	createtest=extentReports.createTest("validating fb england");
	createtest.log(Status.INFO, "Validating FB ENGLAND");
driver.get("https://en-gb.facebook.com/");

if(driver.getTitle().contains("log in or sign up"))
{
	createtest.log(Status.PASS, "Thisis an valid URL");}
else
{
	createtest.log(Status.FAIL, "This is an Invalid URL");
	TakesScreenshot ts =(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File dest=new File("fb2.png");
FileHandler.copy(src ,dest);
	createtest.addScreenCaptureFromPath("fb2.png");	
}
}
@BeforeSuite
private void beforesuite() throws SecurityException, IOException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\eclipse-workspace\\NestGentest\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	extentReports =new ExtentReports();
	extentHtmlReporter=new ExtentHtmlReporter("Facebook.html");
	extentReports.attachReporter(extentHtmlReporter);
}
@AfterSuite
private void aftersuite() {
extentReports.flush();

} 
}
 