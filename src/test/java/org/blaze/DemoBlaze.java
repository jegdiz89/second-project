package org.blaze;

import org.baseclass.BaseClass;
import org.junit.Test;
import org.openqa.selenium.Alert;

public class DemoBlaze extends BaseClass  {
	
	@Test
	public void tc0() throws InterruptedException {
		getDriver();
		launchUrl("https://demoblaze.com/index.html");
		HomePage page=new HomePage();
		btnClick(page.getSignIn());
		enterText(page.getUserName(), "jegdiz");
		enterText(page.getPassWord(), "jegdiz");
		btnClick(page.getLogin());
		Thread.sleep(6000);
		btnClick(page.getMobile());
		Thread.sleep(6000);
		btnClick(page.getAddtoCart());
		Thread.sleep(6000);
		AL_getText();

	}

}
