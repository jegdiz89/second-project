package org.blaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPageAirTicket extends BaseClass {
	public FirstPageAirTicket() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(xpath="//select[@name='fromPort']"),@FindBy(xpath="(//select[@class='form-inline'])[1]")})
	private WebElement Select1;
	
	@FindAll({@FindBy(xpath="//select[@name='toPort']"),@FindBy(xpath="(//select[@class='form-inline'])[2]")})
	private WebElement Select2;
	
	@FindAll({@FindBy(xpath="//input[@type='submit']"),@FindBy(xpath="//input[@class='btn btn-primary']"),@FindBy(xpath="//input[@value='Find Flights']")})
	private WebElement FindFlight;

	public WebElement getSelect1() {
		return Select1;
	}

	public WebElement getSelect2() {
		return Select2;
	}

	public WebElement getFindFlight() {
		return FindFlight;
	}

	
	}

