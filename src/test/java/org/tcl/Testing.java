package org.tcl;

import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testing extends BaseClass {
	
@Parameters({"username" , "password"})
@Test
private void tc0(String s,String s1) {
	browserconfig();
	launchUrl("https://www.facebook.com/");
	enterText(findelementById("email"), s);
	enterText(findelementById("pass"), s1);
	
}


}
