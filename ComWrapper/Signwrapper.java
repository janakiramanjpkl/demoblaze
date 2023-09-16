package ComWrapper;

import org.openqa.selenium.support.PageFactory;

import ComPage.SingnUp;

public class Signwrapper extends SeleniumWrapper {
public void signinrapper() {
	try {
		SingnUp up=PageFactory.initElements(driver, SingnUp.class);
		up.clicksign();
		up.setusername("karthickjpkl@gmail.com");
		up.setpass("Abi@jani143");
		up.clicksignbutton();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}
