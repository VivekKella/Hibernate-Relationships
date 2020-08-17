package io.solitx;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID no;

	private String city;

	private String street;

	private String pincode;

	public UUID getNo() {
		return no;
	}

	public void setNo(UUID no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [no=" + no + ", city=" + city + ", street=" + street + ", pincode=" + pincode + "]";
	}

	public Address(String city, String street, String pincode) {
		super();
		this.city = city;
		this.street = street;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
