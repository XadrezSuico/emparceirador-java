package io.github.xadrezsuico.system.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import io.github.xadrezsuico.system.common.interfaces.TournamentInterface;

public class Event implements TournamentInterface{
	private String name;
	private Date dateInit;
	private Date dateEnd;
	
	private Map<Integer, Tournament> tournaments;
	
	public Event(){
		tournaments = new HashMap<Integer, Tournament>();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateInit() {
		return dateInit;
	}
	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}

	@Override
	public void addTournament(Tournament tournament) {
		if(!tournaments.containsKey(tournament.getId())){
			tournaments.put(tournament.getId(), tournament);
		}
	}

	@Override
	public void editTournament(Tournament tournament) {
		if(tournaments.containsKey(tournament.getId())){
			tournaments.remove(tournament.getId());
			tournaments.put(tournament.getId(), tournament);
		}
	}

	@Override
	public Tournament getTournament(int id) {
		if(tournaments.containsKey(id)){
			return tournaments.get(id);
		}
		return null;
	}

	@Override
	public void removeTournament(int id) {
		if(tournaments.containsKey(id)){
			tournaments.remove(id);
		}
	}
}
