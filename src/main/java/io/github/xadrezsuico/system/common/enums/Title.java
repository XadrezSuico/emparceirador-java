package io.github.xadrezsuico.system.common.enums;

public enum Title {
	
	// Male Titles
	CM("Candidate Master", Sex.MALE),
	FM("FIDE Master", Sex.MALE),
	IM("International Master", Sex.MALE),
	GM("Grandmaster", Sex.MALE),
	
	// Woman Titles
	WCM("Woman Candidate Master", Sex.FEMALE),
	WFM("Woman FIDE Master", Sex.FEMALE),
	WIM("Woman International Master", Sex.FEMALE),
	WGM("Woman Grandmaster", Sex.FEMALE);
	
	private String name;
	private Sex sex;
	
	private Title(String name, Sex sex){
		this.name = name;
		this.sex = sex;
	}
	
	public String getName(){
		return this.name;
	}
	public Sex getSex(){
		return this.sex;
	}
}
