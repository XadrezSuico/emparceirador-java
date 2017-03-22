package io.github.xadrezsuico.system.common.interfaces;

import io.github.xadrezsuico.system.common.Tournament;

public interface TournamentInterface {
	public void addTournament(Tournament tournament);
	public void editTournament(Tournament tournament);
	public Tournament getTournament(int id);
	public void removeTournament(int id);
}
