package io.github.xadrezsuico.system.common;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import io.github.xadrezsuico.system.common.interfaces.TournamentInterface;
import io.github.xadrezsuico.system.model.HibernateEntity;

@Entity
@Table(name = "EVENT")
public class Event extends HibernateEntity implements TournamentInterface{
	
	@Id
	@SequenceGenerator(name = "ID_EVENT", sequenceName = "GEN_ID_EVENT", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_EVENT")
	@Column(name = "ID", nullable = false, precision = 0, scale = -126)
	private int id;
	
	@Column(name = "NOME")
	private String name;
	
	@Column(name = "DATA_INICIO")
	private Date dateInit;
	
	@Column(name = "DATA_TERMINO")
	private Date dateEnd;
	
	@Column(name = "TORNEIO")
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

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}
}
