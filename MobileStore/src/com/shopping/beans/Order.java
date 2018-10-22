package com.shopping.beans;

public class Order {

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	int orderId;
	String email;
	String productName;
	String company;
	String status;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Order(int orderId, String email, String productName, String company, String status) {
		super();
		this.orderId = orderId;
		this.email = email;
		this.productName = productName;
		this.company = company;
		this.status = status;
	}
	
	
	
}
