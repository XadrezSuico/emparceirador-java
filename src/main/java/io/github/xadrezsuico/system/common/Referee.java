package io.github.xadrezsuico.system.common;

public class Referee extends Person {
	private String categoryRe;
	private int idRe;
	private boolean main;
	
	
	public String getCategoryRe() {
		return categoryRe;
	}
	public void setCategoryRe(String categoryRe) {
		this.categoryRe = categoryRe;
	}
	public int getIdRe() {
		return idRe;
	}
	public void setIdRe(int idRe) {
		this.idRe = idRe;
	}
	public boolean isMain() {
		return main;
	}
	public void setMain(boolean main) {
		this.main = main;
	}
}
