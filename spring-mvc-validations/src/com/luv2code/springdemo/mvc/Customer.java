package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Customer {

	@NotNull(message="is required")
	@Size(min=1)
	private String lastName;
	
	private String firstName;
	
	@Min(value=0 , message= "value should be greate than 0")
	@Max(value=10 , message="value should be lesst than 10")
	private int freePasses;
	
	@Pattern(regexp="[a-zA-Z0-9] {5}", message="ONly enter postal code of length 5 and alphanumeric characters")
	private String postalCode;
	
	
	
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getFreePasses() {
		return freePasses;
	}
	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}
	
	
	
}
