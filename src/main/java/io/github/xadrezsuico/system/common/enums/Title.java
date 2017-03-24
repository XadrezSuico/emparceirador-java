package io.github.xadrezsuico.system.common.enums;

public enum Title {
	CM("Candidate Master", Sex.MALE);
	
	private String name;
	private Sex sex;
	
	private Title(String name, Sex sex){
		this.name = name;
		this.sex = sex;
	}
}
