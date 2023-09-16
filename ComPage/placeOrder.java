package ComPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ComWrapper.SeleniumWrapper;

public class placeOrder  extends SeleniumWrapper{
	@FindBy(xpath="//button[text()='Place Order']")
	WebElement placeorder;
	
	public void order() {
		clickelements(placeorder);
	}
}
