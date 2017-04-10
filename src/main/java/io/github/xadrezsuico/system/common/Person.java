package io.github.xadrezsuico.system.common;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.github.xadrezsuico.system.common.enums.Sex;
import io.github.xadrezsuico.system.model.HibernateEntity;

@Entity
@Table(name = "PERSON")
public class Person extends HibernateEntity{
	
	@Id
	@SequenceGenerator(name = "ID_PERSON", sequenceName = "GEN_ID_PERSON", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PERSON")
	@Column(name = "ID", nullable = false, precision = 0, scale = -126)
	private Integer id;
	
	@Column(name = "FIRST_NAME")
	private String firstname;
	
	@Column(name = "LAST_NAME")
	private String lastname;
	
	@Column(name = "BIRTHDAY")
	private Date birthday;
	
	@Column(name = "NUMBER")
	private String registryNumber;
	
	@Column(name = "CITY")
	private String city;
	
	@Column(name = "SEX")
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
