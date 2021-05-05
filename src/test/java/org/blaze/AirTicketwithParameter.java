package org.blaze;

import org.baseclass.BaseClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AirTicketwithParameter extends BaseClass {
	@Parameters({"departure","destination"})
	@Test
	private void tc0(String s1,String s2) {
	getDriver();
	launchUrl("https://blazedemo.com/");
	ImplicitWait();
	FirstPageAirTicket f=new FirstPageAirTicket();
	enterText(f.getSelect1(), s1);
	enterText(f.getSelect2(), s2);
	btnClick(f.getFindFlight());
	}
	@Test
	private void tc1() {

		SecondPageAirTicket s=new SecondPageAirTicket();
		btnClick(s.getChooseflight3());
	}
	
	@Parameters({"firstname","address","city","state","zipcode","cardtype","ccnumber","month","year","nameoncard"})
	@Test
	private void tc2(String s1,String s2,String s3,String s4,String s5,String s6,String s7,String s8,String s9,String s10) throws Throwable {
	ThirdPageAirTicket t=new ThirdPageAirTicket();
	enterText(t.getName(), s1);
	enterText(t.getAddress(), s2);
	enterText(t.getCity(), s3);
	enterText(t.getState(), s4);
	enterText(t.getZipcode(), s5);
	enterText(t.getVisaCard(), s6);
	enterText(t.getCreditCardNo(), s7);
	enterText(t.getCreditCardMonth(), s8);
	enterText(t.getCreditCardYear(), s9);
	enterText(t.getNameOnCard(), s10);
	btnClick(t.getFinalSubmit());
	writeDataToExcel("ExcelData", "data", 18, 16, getText(t.getOrderId()));
	System.out.println("done");
	}

}
