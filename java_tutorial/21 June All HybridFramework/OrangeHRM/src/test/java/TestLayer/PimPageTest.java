package TestLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import BaseLayer.BaseClass;
import PageLayer.PimPage;
import UtilityLayer.ExcelReader;

@Test(groups={"PimPage","endToEndAdminTest"}, dependsOnGroups="HomePage")
public class PimPageTest extends BaseClass{
	PimPage pimPage;
	@Test(priority=1)
	public void validatePimUrl()
	{
		pimPage = new PimPage();
		String actualUrl = pimPage.checkPimUrl();
		Assert.assertEquals(actualUrl.contains("pim"), true);
	}
	
	@Test(priority=2, dataProvider="orangeHrmTestData")
	public void validatePimPageFunctionality(String Fname, String Mname, String Lname, String Country, String Gender) throws InterruptedException
	{
		pimPage.pimPageFunctionality(Fname, Mname, Lname, Country, Gender);
	}
	
	@DataProvider(name="orangeHrmTestData")
	public Object[][] getTestData() throws IOException
	{
		ExcelReader obj = new ExcelReader(System.getProperty("user.dir")+"/src/main/java/TestData/OrangeHrmTestData1.xlsx");
		Object [][] data = obj.getAllSheetTestData(0);
		return data;
	}

}
