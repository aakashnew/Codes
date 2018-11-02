package com.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class AddProductForm  extends ActionForm{
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
	/*public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		  ActionErrors errors = new ActionErrors();
		  if (productName == null || productName.length() < 1 ) {
		      errors.add("productName", new ActionMessage("product.err.name.productname"));
		      // TODO: add 'error.name.required' key to your resources
		  }    
		
		  if (productQuantity == 0 || productQuantity < 1) {
		      errors.add("productQuantity", new ActionMessage("product.err.productquantity.required"));
		      // TODO: add 'error.name.required' key to your resources
		  }
		  else if (productCost < 1) {
		  errors.add("productCost", new ActionMessage("product.err.productcost.required"));
		  }
		  return errors;
		}
*/	
}
