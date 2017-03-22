package io.github.xadrezsuico.system.common.interfaces;

import io.github.xadrezsuico.system.common.Player;

public interface PlayerInterface {
	public void addPlayer(Player player);
	public void editPlayer(Player player);
	public Player getPlayer(int id);
	public void removePlayer(int id);
}
