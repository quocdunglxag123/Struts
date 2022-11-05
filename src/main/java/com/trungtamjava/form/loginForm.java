package com.trungtamjava.form;

import org.apache.struts.action.ActionForm;

public class loginForm extends ActionForm{
	private String customerId;
	private String password;
	private String error;
	public loginForm() {}
	public loginForm(String customerId, String password, String error) {
		super();
		this.customerId = customerId;
		this.password = password;
		this.error = error;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
}
