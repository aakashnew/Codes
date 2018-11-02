package com.bean;

import java.io.Serializable;

public class Product implements Serializable {
private int productId;
private String productName;
private int productQuantity;
private int productCost;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public int getProductQuantity() {
	return productQuantity;
}
public void setProductQuantity(int productQuantity) {
	this.productQuantity = productQuantity;
}
public int getProductCost() {
	return productCost;
}
public void setProductCost(int productCost) {
	this.productCost = productCost;
}
}