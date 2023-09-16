package ComPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import ComWrapper.SeleniumWrapper;

public class SingnUp extends SeleniumWrapper{

	
	@FindBy(id="signin2")
	WebElement signoption;
	@FindBy(id="sign-username")
	WebElement username;
	@FindBy(id="sign-password")
	WebElement password;
	@FindBy(xpath="//button[text()='Sign up']")
	WebElement signbutton;
	
	
	
	
	public void clicksign() {
			clickelements(signoption);
	}
	
	public void setusername(String name) {
		sendvalue(username, name);
	}
	public void setpass(String word) {
		sendvalue(password, word);
	}
	public void clicksignbutton() {
		clickelements(signbutton);
	}
}