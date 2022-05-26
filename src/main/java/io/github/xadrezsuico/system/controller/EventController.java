package io.github.xadrezsuico.system.controller;

import io.github.xadrezsuico.system.common.listeners.event.EventListeners;
import io.github.xadrezsuico.system.common.listeners.event.NewEventListener;
import io.github.xadrezsuico.system.view.EventView;

public class EventController extends EventListeners{
	private static EventController event_controller;
	public static EventController getInstance() {
		if(event_controller == null) {
			event_controller = new EventController();
		}
		
		return event_controller;
	}
	
	public void newEvent() {
		EventView event_view = new EventView();
		event_view.setVisible(true);
	}

	public void open(String string) {
		this.handleNewEventListeners();
	}
	
	
	
}
