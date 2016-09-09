package com.psl.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="addr")
public class Address {
	
	@Value(value="Nagpur")
	private String city;
	
	@Value(value="FC Rd")
	private String street;
	
	@Value(value="131324")
	private String zip;
	public Address(){
		System.out.println("in default constructor of Address");
	}
	
public Address(String city, String street, String zip) {
	System.out.println("in Parameterised constructor of Address");
	this.city = city;
	this.street = street;
	this.zip = zip;
}


public String getCity() {
return city;
}


public void setCity(String city) {
System.out.println("in setCity");
this.city = city;
}


public String getStreet() {
return street;
}


public void setStreet(String street) {
System.out.println("in setStreet");
this.street = street;
}


public String getZip() {
return zip;
}


public void setZip(String zip) {
System.out.println("in setZip");
this.zip = zip;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + ", zip=" + zip
			+ "]";
}

}

