package org.tcl;

import org.baseclass.BaseClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing3 extends BaseClass {

@Test(dataProvider="value")
private void tc2(String s) {
	browserconfig();
	launchUrl("https://www.amazon.in/");
	enterText(findelementById("twotabsearchtextbox"), s);
	btnClick(findelementById("nav-search-submit-button"));

}
@DataProvider(name="value")
public Object[][] gtvalue() {
	return new Object[][] {{"lenovo laptop"},{"wrist watches"},{"iphone"}};	
}

}
