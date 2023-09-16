package ComPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ComWrapper.SeleniumWrapper;

public class LoginPage extends SeleniumWrapper {
@FindBy(id="login2")
WebElement loginoption;

@FindBy(id="loginusername")
WebElement loginuser;

@FindBy(id="loginpassword")
WebElement loginpass;

@FindBy(xpath="//button[text()='Log in']")
WebElement clickloginbutton;



public void clickloginoption() {
	clickelements(loginoption);
}
public void enterusername(String name) {
	sendvalue(clickloginbutton, name);
}
public void enterpassword(String password) {
	sendvalue(loginpass, password);
}
public void clicklogin() {
	clickelements(clickloginbutton);
}

}
