package com.automation.address.test.models;

public class DatosRegistroDireccion {
	String firstName;
	String lastName;
	String company;
	String address;
	String addressLineTwo;
	String city;
	String state;
	String postalCode;
	String homePhone;
	String mobilePhone;
	String additionalInformation ;
	String title;
	
	public DatosRegistroDireccion(String firstName, String lastName, String company, String address,
			String addressLineTwo, String city, String state, String postalCode, String homePhone, String mobilePhone,
			String additionalInformation, String title) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.company = company;
		this.address = address;
		this.addressLineTwo = addressLineTwo;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.homePhone = homePhone;
		this.mobilePhone = mobilePhone;
		this.additionalInformation = additionalInformation;
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress() {
		return address;
	}

	public String getAddressLineTwo() {
		return addressLineTwo;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public String getAdditionalInformation() {
		return additionalInformation;
	}

	public String getTitle() {
		return title;
	}
		
}
