package ComWrapper;

import org.openqa.selenium.support.PageFactory;

import ComPage.LogOutPage;

public class LogWrapper extends SeleniumWrapper {
public void logout() {
	LogOutPage page=PageFactory.initElements(driver, LogOutPage.class);
	page.logoutbutton();

}
}
