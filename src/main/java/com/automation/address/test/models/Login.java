package com.automation.address.test.models;

public class Login {
	String email;
	String clave;
	
	public String getEmail() {
		return email;
	}

	public String getClave() {
		return clave;
	}

	public Login(String email, String clave) {
		super();
		this.email = email;
		this.clave = clave;
	}

}
