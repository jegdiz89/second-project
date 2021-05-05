package org.blaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPageAirTicket extends BaseClass {
	public ThirdPageAirTicket() {
	PageFactory.initElements(driver, this);
	}

	@FindAll({@FindBy(id="inputName"),@FindBy(name="inputName"),@FindBy(xpath="//input[@placeholder='First Last']")})
	private WebElement Name;
	
	@FindAll({@FindBy(id="address"),@FindBy(name="address"),@FindBy(xpath="//input[@placeholder='123 Main St.']")})
	private WebElement Address;
	
	@FindAll({@FindBy(id="city"),@FindBy(name="city"),@FindBy(xpath="//input[@placeholder='Anytown']")})
	private WebElement City;
	
	@FindAll({@FindBy(id="state"),@FindBy(name="state"),@FindBy(xpath="//input[@placeholder='State']")})
	private WebElement State;
	
	@FindAll({@FindBy(id="zipCode"),@FindBy(name="zipCode"),@FindBy(xpath="//input[@placeholder='12345']")})
	private WebElement Zipcode;
	
	@FindAll({@FindBy(xpath="//select[@class='form-inline']"),@FindBy(xpath="//select[@name='cardType']")})
	private WebElement CardType;
	
	@FindAll({@FindBy(id="creditCardNumber"),@FindBy(name="creditCardNumber"),@FindBy(xpath="//input[@placeholder='Credit Card Number']")})
	private WebElement CreditCardNo;
	
	@FindAll({@FindBy(id="creditCardMonth"),@FindBy(name="creditCardMonth"),@FindBy(xpath="//input[@placeholder='Month']")})
	private WebElement CreditCardMonth;
	
	@FindAll({@FindBy(id="creditCardYear"),@FindBy(name="creditCardYear"),@FindBy(xpath="//input[@placeholder='Year']")})
	private WebElement CreditCardYear;
	
	@FindAll({@FindBy(id="nameOnCard"),@FindBy(name="nameOnCard"),@FindBy(xpath="//input[@placeholder='John Smith']")})
	private WebElement NameOnCard;
	
	@FindAll({@FindBy(xpath="//input[@class='btn btn-primary']"),@FindBy(xpath="//input[@type='submit']"),@FindBy(xpath="//input[@value='Purchase Flight']")})
	private WebElement FinalSubmit;
	
	@FindBy(xpath="//td[normalize-space()='Id']//following::td[1]")
	private WebElement OrderId;

	public WebElement getName() {
		return Name;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCity() {
		return City;
	}

	public WebElement getState() {
		return State;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	public WebElement getVisaCard() {
		return CardType;
	}

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	public WebElement getCreditCardMonth() {
		return CreditCardMonth;
	}

	public WebElement getCreditCardYear() {
		return CreditCardYear;
	}

	public WebElement getNameOnCard() {
		return NameOnCard;
	}

	public WebElement getFinalSubmit() {
		return FinalSubmit;
	}

	public WebElement getOrderId() {
		return OrderId;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
