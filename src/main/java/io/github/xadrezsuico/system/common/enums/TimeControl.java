package io.github.xadrezsuico.system.common.enums;

public enum TimeControl {
	
	BTZ("Blitz"),
	RPD("Rapid"),
	STD("Standard");

	private String name;
	
	private TimeControl(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
}
