package ComPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ComWrapper.SeleniumWrapper;

public class LogOutPage extends SeleniumWrapper {
@FindBy(id="logout2")
WebElement logout;

public void logoutbutton() {
	clickelements(logout);
}
}
