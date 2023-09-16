package ComTest;

import org.testng.annotations.Test;

import ComWrapper.PlaceWrapper;
import ComWrapper.SeleniumWrapper;

public class PlaceOrderTest extends SeleniumWrapper {
@Test(priority = 4)
public void validationplaceorder() {
	PlaceWrapper place=new PlaceWrapper();
	place.orderreview();
}


}
