package io.github.xadrezsuico.system.common;

import java.util.HashMap;
import java.util.Map;

import io.github.xadrezsuico.system.common.interfaces.PlayerInterface;

public class Tournament implements PlayerInterface {
	private int id;
	private String name;
	private String level;
	private Map<Integer, Player> players;
	
	
	public Tournament(){
		players = new HashMap<Integer,Player>();
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	public void addPlayer(Player player) {
		if(!players.containsKey(player.getId())){
			players.put(player.getId(), player);
		}
	}
	public void editPlayer(Player player) {
		if(players.containsKey(player.getId())){
			players.remove(player.getId());
			players.put(player.getId(), player);
		}
	}
	public Player getPlayer(int id) {
		if(players.containsKey(id)){
			return players.get(id);
		}
		return null;
	}
	public void removePlayer(int id) {
		if(players.containsKey(id)){
			players.remove(id);
		}
	}
}
