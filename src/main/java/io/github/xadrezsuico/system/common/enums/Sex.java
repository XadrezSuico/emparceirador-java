package io.github.xadrezsuico.system.common.enums;

public enum Sex {
	MALE(1, "Male"),
	FEMALE(2, "Female");
	
	private int id;
	private String sex;
	
	private Sex(int id, String sex){
		this.id = id;
		this.sex = sex;
	}
	
	public int getId(){
		return id;
	}
	
	public String getSex(){
		return sex;
	}
}
