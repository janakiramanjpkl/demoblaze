package ComTest;

import org.testng.annotations.Test;

import ComWrapper.SeleniumWrapper;
import ComWrapper.WrapperLogin;

public class LoginpageTest extends SeleniumWrapper {
@Test(priority = 2)
	public void loginpagevalidation() {
	WrapperLogin wl=new WrapperLogin();
wl.loginpagewrapper();	
}
}
