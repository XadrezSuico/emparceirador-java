package io.github.xadrezsuico.system.common;

public class Player extends Person {
	private int localRa;
	private String localId;
	private int countryRa;
	private String countryId;
	private int intlRa;
	private String intlId;
	private String federation;
	private String club;
	private String title;
	private Boolean active;
	private int lateEntry;
	private int withdraw;
	private double bonus;
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public int[] getByes() {
		return byes;
	}
	public void setByes(int[] byes) {
		this.byes = byes;
	}
	private int[] byes;
	
		
	public int getLateEntry() {
		return lateEntry;
	}
	public void setLateEntry(int lateEntry) {
		this.lateEntry = lateEntry;
	}
	public int getWithdraw() {
		return withdraw;
	}
	public void setWithdraw(int withdraw) {
		this.withdraw = withdraw;
	}
	public int getLocalRa() {
		return localRa;
	}
	public void setLocalRa(int localRa) {
		this.localRa = localRa;
	}
	public String getLocalId() {
		return localId;
	}
	public void setLocalId(String localId) {
		this.localId = localId;
	}
	public int getCountryRa() {
		return countryRa;
	}
	public void setCountryRa(int countryRa) {
		this.countryRa = countryRa;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public int getIntlRa() {
		return intlRa;
	}
	public void setIntlRa(int intlRa) {
		this.intlRa = intlRa;
	}
	public String getIntlId() {
		return intlId;
	}
	public void setIntlId(String intlId) {
		this.intlId = intlId;
	}
	public String getFederation() {
		return federation;
	}
	public void setFederation(String federation) {
		this.federation = federation;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Boolean getActive() {
		return active;
	}
	public void setActive(Boolean active) {
		this.active = active;
	}
}
