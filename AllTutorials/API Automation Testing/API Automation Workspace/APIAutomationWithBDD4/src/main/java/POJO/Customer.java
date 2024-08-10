package POJO;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Customer {

	public String cust_fName;
	
	public String cust_lName;
	
	public String cust_billingAddress;
	
	public String product_Name;

	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	public double product_price;
	
	@JsonInclude(JsonInclude.Include.NON_DEFAULT)
	public int product_Discount;

	public String product_info;

	public String getCust_fName() {
		return cust_fName;
	}

	public void setCust_fName(String cust_fName) {
		this.cust_fName = cust_fName;
	}

	public String getCust_lName() {
		return cust_lName;
	}

	public void setCust_lName(String cust_lName) {
		this.cust_lName = cust_lName;
	}

	public String getCust_billingAddress() {
		return cust_billingAddress;
	}

	public void setCust_billingAddress(String cust_billingAddress) {
		this.cust_billingAddress = cust_billingAddress;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public double getProduct_price() {
		return product_price;
	}

	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}

	public int getProduct_Discount() {
		return product_Discount;
	}

	public void setProduct_Discount(int product_Discount) {
		this.product_Discount = product_Discount;
	}

	public String getProduct_info() {
		return product_info;
	}

	public void setProduct_info(String product_info) {
		this.product_info = product_info;
	}

	
}
