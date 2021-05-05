package org.tcl;

import org.baseclass.BaseClass;
import org.openqa.selenium.support.ByIdOrName;
import org.testng.annotations.Test;

public class Runprong extends BaseClass {
@Test(dataProvider="tc0",dataProviderClass=DPdataprovider.class)
private void tc0(String s) {
browserconfig();
launchUrl("https://www.amazon.in/");
enterText(findelementById("twotabsearchtextbox"), s);
btnClick(findelementById("nav-search-submit-button"));
}
@Test(dataProvider="tc1",dataProviderClass=DPdataprovider.class)
private void tc1(String s,String s1) {
	browserconfig();
	launchUrl("https://www.facebook.com/");
	enterText(findelementById("email"), s);
	enterText(findelementById("pass"), s1);
}
}
