package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.ContactPage;

public class ContactPageTest extends BaseClass {

	// use pre condition annotation
	// create test case using @Test annotations
	// call associated method from Page Layer Package by creating object of
	// Associated classes.
	// add assertion using hard assert
	// use post condition annotation
	private static ContactPage contactPage;

	@Test(priority = 1)
	public void validateUserOnContactPage() {
		contactPage = new ContactPage();
		String actualUrl = contactPage.contactPageFunctionality();
		Assert.assertEquals(actualUrl.contains("contacts"), true);
	}

	@Test(priority = 2)
	public void validateCreateNewContact() {
		contactPage.createNewContact("Rohini", "Shinde", "abc", "On Hold");
	}

	@Test(priority = 3)
	public void validateDeleteContact() {
		contactPage.deleteContactFunctionality();
	}

}
