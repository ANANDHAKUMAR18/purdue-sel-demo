package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class BasicValidation extends BaseTest{

	
	@Test
	public void urlTest() {
		String expectedResult = "https://www.facebook.com/";
		String actualResult = driver.getCurrentUrl();
		assertTrue(expectedResult.equals(actualResult), "Mismatch in the url");
	}
}
