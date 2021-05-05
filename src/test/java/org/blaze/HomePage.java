package org.blaze;

import org.baseclass.BaseClass;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id="login2"),@FindBy(xpath="//a[text()='Log in']")})
	private WebElement SignIn;
	
	@FindAll({@FindBy(id="loginusername"),@FindBy(xpath="(//input[@type='text'])[4]")})
	private WebElement userName;
	
	@FindAll({@FindBy(id="loginpassword"),@FindBy(xpath="(//input[@type='password'])[2]")})
	private WebElement passWord;
	
	@FindAll({@FindBy(xpath="(//button[@type='button'])[9]"),@FindBy(xpath="//button[text()='Log in']")})
	private WebElement login;
	
	@FindAll({@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")})
	private WebElement mobile;
	
	@FindAll({@FindBy(xpath="//a[text()='Add to cart']"),@FindBy(xpath="//a[@onclick='addToCart(9)']")})
	private WebElement addtoCart;

	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getAddtoCart() {
		return addtoCart;
	}


}
