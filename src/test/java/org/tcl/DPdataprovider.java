package org.tcl;

import org.testng.annotations.DataProvider;

public class DPdataprovider {
@DataProvider(name="tc0")
public static Object[][] datafortc0() {
	return new Object[][] {{"mobiles"},{"watches"},{"handbags"}};
}
@DataProvider(name="tc1")
public static Object[][] data() {
	return new Object[][] {{"hello","welcome"},{"dear","comrate"}};

}

}
