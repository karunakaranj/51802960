package com.BankLoan.model;

import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

@Table(name="customer")

public class Customer {
@Id
@Table(name= "Customer_Details")

@GeneratedValue(strategy =GenerationType.AUTO)
	
private int  CustomerID;
public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerPhn() {
		return CustomerPhn;
	}
	public void setCustomerPhn(String customerPhn) {
		CustomerPhn = customerPhn;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
private String  CustomerName;
private String CustomerPhn;
private String CustomerAddress;
private String CustomerType;
	
	

}
