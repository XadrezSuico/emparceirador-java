package io.github.xadrezsuico.system;

import io.github.xadrezsuico.system.view.MainView;

public class Main {
	public Main(){
		MainView main = new MainView();
		main.setVisible(true);
	}
	
	public static void main(String[] args){
		new Main();
	}
}
