package ComTest;

import org.testng.annotations.Test;

import ComWrapper.LogWrapper;
import ComWrapper.SeleniumWrapper;

public class LogOutTesr extends SeleniumWrapper{
	@Test(priority = 5)
	public void out() {
		LogWrapper log=new LogWrapper();
	log.logout();
	}
	}


