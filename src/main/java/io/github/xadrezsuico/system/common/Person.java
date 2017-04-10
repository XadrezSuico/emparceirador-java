package io.github.xadrezsuico.system.common;

import java.util.Date;

import javax.persistence.Entity;

import io.github.xadrezsuico.system.common.enums.Sex;

@Entity
public class Person extends io.github.xadrezsuico.system.model.HibernateEntity{
	
	private Integer id;
	private String firstname;
	private String lastname;
	private Date birthday;
	private String registryNumber;
	private String city;
	private Sex sex;
	
	public Person() {
	}
	
	@Override
	public Integer getId() {
		return id;
	}
	
	@Override
	public void setId(Integer id) {
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
	public Sex getSex() {
		return sex;
	}
	public void setSex(Sex sex) {
		this.sex = sex;
	}
	
}
