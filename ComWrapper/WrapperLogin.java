package ComWrapper;

import org.openqa.selenium.support.PageFactory;

import ComPage.LoginPage;

public class WrapperLogin extends SeleniumWrapper {
public void loginpagewrapper() {
	try {
		LoginPage loo=PageFactory.initElements(driver, LoginPage.class);
	loo.clickloginoption();
	loo.enterusername("karthickjpkl@gmail.com");
	loo.enterpassword("Abi@jani143");
	loo.clicklogin();
	
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
