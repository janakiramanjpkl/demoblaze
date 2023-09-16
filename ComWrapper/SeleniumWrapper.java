package ComWrapper;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.Timeout;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWrapper {
	
	public static WebDriver driver=null;
	
	
	public void launchbrowser(String url) {
		try {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().wait(10);
			driver.get(url);
			driver.manage().window().maximize();
		} 
		catch(Exception ex) {
			ex.printStackTrace();
			System.out.println("Problem while launching url");
		}
	}
	public void waitforele(WebElement ele,int num) {
		try {
			WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(num));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
		catch(Exception ex) {
			ex.printStackTrace();
		}
}
	

public void sendvalue(WebElement ele,String value) {
	try{
		ele.click();
		ele.clear();
		ele.sendKeys(value);
	}
	catch(Exception ex) {
		ex.printStackTrace();
}} 
public void clickelements(WebElement ele) {
	try {
		ele.click();
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
 

public void homepageverification(String url) {
	try {
		launchbrowser(url);
		String actual="PRODUCTSTORE";
		String expected=driver.getTitle();
		System.out.println(actual.equalsIgnoreCase(expected));
	}
	catch(Exception ex) {
		ex.printStackTrace();
	}
}









}

