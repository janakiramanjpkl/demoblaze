package ComWrapper;

import org.openqa.selenium.support.PageFactory;

import ComPage.placeOrder;

public class PlaceWrapper extends SeleniumWrapper {
public void orderreview() {
	placeOrder od=PageFactory.initElements(driver,placeOrder.class);

od.order();

}
}
