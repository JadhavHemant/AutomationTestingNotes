package PageLayer;

import org.openqa.selenium.By;

import BaseLayer.BaseClass;

public class CompanyPage extends BaseClass{
	
	public void clickOnCompanyLink()
	{
		driver.findElement(By.xpath("//a[@href='/companies']")).click();
	}
	public void clickOnCreateButton()
	{
		driver.findElement(By.xpath("//a[@href='/companies/new']")).click();
	}
	
    public void createCompany(String Name,String website,String Add,String email)
    {
    	driver.findElement(By.name("name")).sendKeys(Name);
		driver.findElement(By.name("url")).sendKeys(website);
		driver.findElement(By.name("address")).sendKeys(Add);
		driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys(email);
    }
    
    public void clickOnSaveButton()
    {
    	driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
}
