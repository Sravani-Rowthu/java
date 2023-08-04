package com.sra.hibernate.entity;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Column;
@Entity
public class Address 
{
	@Id
	@Column(name="address_id")
	private int addressId;
	@Column(name="hno")
	private String houseNo;
	@Column(name="street")
	private String streetName;
	@Column(name="city")
	private String cityName;
	@Column(name="state")
	private String stateName;
	@OneToOne(mappedBy="address")
	Person person;
	
	public Address() {}
	public Address(int addressId, String houseNo, String streetName, String cityName, String stateName) 
	{
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.stateName = stateName;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return cityName;
	}
	public void setCity(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
}
