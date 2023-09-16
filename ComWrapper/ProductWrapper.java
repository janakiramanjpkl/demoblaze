package ComWrapper;

import org.openqa.selenium.support.PageFactory;

import ComPage.ProductSelectionPage;

public class ProductWrapper extends SeleniumWrapper {
public void productwrapper() {
	try {
		ProductSelectionPage select=PageFactory.initElements(driver, ProductSelectionPage.class);
	select.selectphoneoption();
	select.phone();
	select.movetocart();
	select.viewitem();
	
	
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
