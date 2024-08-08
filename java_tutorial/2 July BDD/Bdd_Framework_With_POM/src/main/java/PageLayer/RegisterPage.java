package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass{
 @FindBy(name="ctl00$ContentPlaceHolder1$ddlTitle")
	private WebElement title;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtFName")	
 private WebElement name;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtLName")
 private WebElement surname;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtAddress")	
 private WebElement address1;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtAddress2")	
 private WebElement address2;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtCity")	
 private WebElement city;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$ddlCountry")	
 private WebElement country;
 
 @FindBy(xpath="//option[text()='MAHARASHTRA']/parent::selectA")	
 private WebElement state;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$ddlDistrict")	
 private WebElement district;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtNationality")	
 private WebElement nationality;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtPinCode")	
 private WebElement pincoad;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtEmail")	
 private WebElement email;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtMobileNum")	
 private WebElement mobileNo;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$ddlQuestions")	
 private WebElement question;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtAnswer")	
 private WebElement answers;
 
 @FindBys(@FindBy(xpath="//td[text()='Choose your User Type:']/following::input[@type='radio']"))	
 private List<WebElement> listuserType;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtUserId")	
 private WebElement userId;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtPassword")	
 private WebElement password;
 
 @FindBy(name="ctl00$ContentPlaceHolder1$txtConfirmPwd")	
 private WebElement confirmPassword;
 
 public RegisterPage()
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void Aser_enter_valid_title(String Title)
 {
	 HandleDropDown.selectByVisibleText(title, Title);
 }
 public void User_enter_name_and_surname(String Name,String SurName)
 {
	Wait.sendKeys(name, Name);
	Wait.sendKeys(surname, SurName);
 }
 public void User_enter_valid_address1_address2_city(String Address1,String Address2,String City)
 {
	 Wait.sendKeys(address1, Address1);
	 Wait.sendKeys(address2, Address2);
	 Wait.sendKeys(city, City);
 }
 public void USer_enter_country_state_and_district(String Country,String State)
 {
	 HandleDropDown.selectByVisibleText(country, null);
	 HandleDropDown.selectByVisibleText(country, Country);
	 
 }
 public void User_enter_nationality_and_pincoad(String Nationality,String Pincoad)
 {
	 Wait.sendKeys(nationality, Nationality);
	 Wait.sendKeys(pincoad, Pincoad);
 }
 public void User_enter_emailid_MobileNo(String EmailId,String MobileNO)
 {
	 Wait.sendKeys(email, EmailId);
	 Wait.sendKeys(mobileNo, MobileNO);
 }
 public void USer_enter_validate_question_and_answer(String Questions,String Answer)
 {
	 HandleDropDown.selectByVisibleText(question, Questions);
	 Wait.sendKeys(answers, Answer);
 }
 public void User_enter_valiod_user_type(String ListUser)
 {
	 for(WebElement abc:listuserType)
	 {
		 String value = abc.getText();
		 if(value.equalsIgnoreCase(ListUser))
			 abc.click();
		 break;
	 }
 }
 public void User_enter_UserId_Password_confirmPassword(String UserId,String Password,String ConfirmPassword)
 {
	 Wait.sendKeys(userId, UserId);
	 Wait.sendKeys(password, Password);
	 Wait.sendKeys(confirmPassword, ConfirmPassword);
 }
}



















