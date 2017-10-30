package edu.colostate.cs.cs414.skynet_gym.domain.people.info;

import java.io.Serializable;

/**
 * Stores an address
 * 
 * @author Mike Allan
 *
 */
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 445192361382543216L;
	private String street1;
	private String street2;
	private String provOrState;
	private String city;
	private String zipCode;
	private String type;
	
	public Address(String street1,
			String street2,
			String provOrState,
			String city,
			String zipCode,
			String type){
		
		this.setAddress(street1,
				street2,
				provOrState,
				city,
				zipCode,
				type);
	}
	
	public boolean equals(Object o){
		try {
			return (this.toString().equals(Address.class.cast(o).toString()));
		} catch (java.lang.ClassCastException e) {
			return false;
		} catch (java.lang.NullPointerException e) {
			return false;
		}
	}
	
	public String toString(){
		return (this.street1 + ":" +
				this.street2 + ":" +
		        this.provOrState + ":" +
		        this.city + ":" +
		        this.zipCode + ":" +
		        this.type);
	}
	
	protected void setAddress(String street1,
			String street2,
			String provOrState,
			String city,
			String zipCode,
			String type){
		
		this.setStreet1(street1);
		this.setStreet2(street2);
		this.setProvOrState(provOrState);
		this.setCity(city);
		this.setZipCode(zipCode);
		this.setType(type);
		
	}
	
	public String getStreet1() {
		return street1;
	}

	protected void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	protected void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getProvOrState() {
		return provOrState;
	}

	protected void setProvOrState(String provOrState) {
		this.provOrState = provOrState;
	}

	public String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	protected void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getType() {
		return type;
	}

	protected void setType(String type) {
		this.type = type;
	}

}
