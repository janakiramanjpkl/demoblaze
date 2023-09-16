package ComTest;

import org.testng.annotations.Test;

import ComWrapper.SeleniumWrapper;
import ComWrapper.Signwrapper;

public class SignupTest extends SeleniumWrapper {
 Signwrapper sign= new Signwrapper();
 @Test(priority =1)
 public void validationsignup() {
	 launchbrowser("https://www.demoblaze.com/");
	 sign.signinrapper();
 }

public void homevalidation() {
	homepageverification("https://www.demoblaze.com/");
}


}
