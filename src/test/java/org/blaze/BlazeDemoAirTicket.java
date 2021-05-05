package org.blaze;

import org.baseclass.BaseClass;
import org.testng.annotations.Test;

public class BlazeDemoAirTicket extends BaseClass {
	
@Test
private void tc0() {
getDriver();
launchUrl("https://blazedemo.com/");
ImplicitWait();
FirstPageAirTicket f=new FirstPageAirTicket();
selectByindex(f.getSelect1(), 3);
selectByindex(f.getSelect2(), 2);
btnClick(f.getFindFlight());
}
@Test
private void tc1() {

	SecondPageAirTicket s=new SecondPageAirTicket();
	btnClick(s.getChooseflight3());
}
@Test
private void tc2() throws Throwable {
ThirdPageAirTicket t=new ThirdPageAirTicket();
enterText(t.getName(), "joyce");
enterText(t.getAddress(), "675/Johny street");
enterText(t.getCity(), "washington");
enterText(t.getState(), "DC");
enterText(t.getZipcode(), "2345676");
selectByindex(t.getVisaCard(), 2);
enterText(t.getCreditCardNo(), "123456789009876543");
enterText(t.getCreditCardMonth(), "11");
enterText(t.getCreditCardYear(), "2022");
enterText(t.getNameOnCard(), "Jingle");
btnClick(t.getFinalSubmit());
writeDataToExcel("ExcelData", "data", 18, 8, getText(t.getOrderId()));
System.out.println("done");
}
}
