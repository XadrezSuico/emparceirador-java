package io.github.xadrezsuico.system.common;

public class Match {
	private final Player player1;
	private final Player player2;
	private int result;
	
	public Match(Player player1, Player player2){
		this.player1 = player1;
		this.player2 = player2;
	}
	
	public Player getPlayer1() {
		return player1;
	}
	public Player getPlayer2() {
		return player2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
}
