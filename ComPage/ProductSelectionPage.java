package ComPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ComWrapper.SeleniumWrapper;

public class ProductSelectionPage extends SeleniumWrapper {

	@FindBy(xpath="//a[text()='Phones']")
	WebElement phoneoption;
	
	@FindBy(xpath="//a[text()='Samsung galaxy s6']")
	WebElement mobilecatogery;
	
	@FindBy(xpath="//a[text()='Add to cart']")
	WebElement addcart;
	
	@FindBy(xpath="//a[text()='Cart']")
	WebElement cartview;
	
	public void selectphoneoption() {
		clickelements(phoneoption);
	}
	public void phone() {
		clickelements(mobilecatogery);
	}
	public void movetocart() {
		clickelements(addcart);
	}
	public void viewitem() {
		clickelements(cartview);
	}
}
