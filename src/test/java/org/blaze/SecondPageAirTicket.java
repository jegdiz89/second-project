package org.blaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPageAirTicket extends BaseClass {
	public SecondPageAirTicket() {
PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[1]")
	private WebElement chooseflight1;
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[2]")
	private WebElement chooseflight2;
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[3]")
	private WebElement chooseflight3;
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[4]")
	private WebElement chooseflight4;
	
	@FindBy(xpath="(//input[@value='Choose This Flight'])[5]")
	private WebElement chooseflight5;

	public WebElement getChooseflight1() {
		return chooseflight1;
	}

	public WebElement getChooseflight2() {
		return chooseflight2;
	}

	public WebElement getChooseflight3() {
		return chooseflight3;
	}

	public WebElement getChooseflight4() {
		return chooseflight4;
	}

	public WebElement getChooseflight5() {
		return chooseflight5;
	}
	
	
	

}
