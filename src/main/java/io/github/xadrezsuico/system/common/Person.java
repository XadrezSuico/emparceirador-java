package io.github.xadrezsuico.system.common;

import java.util.Date;

public class Person {
	private int id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private String registryNumber;
	private String city;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getRegistryNumber() {
		return registryNumber;
	}
	public void setRegistryNumber(String registryNumber) {
		this.registryNumber = registryNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
