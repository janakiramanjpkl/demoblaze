package ComTest;

import org.testng.annotations.Test;

import ComWrapper.ProductWrapper;
import ComWrapper.SeleniumWrapper;

public class ProductSelectionTest extends SeleniumWrapper {
	@Test(priority = 3)
	public void productvalidation() {
		try {
			ProductWrapper product=new ProductWrapper();
		
		product.productwrapper();
		}
		catch(Exception ex ) {
			ex.printStackTrace();
		}
	}

}
