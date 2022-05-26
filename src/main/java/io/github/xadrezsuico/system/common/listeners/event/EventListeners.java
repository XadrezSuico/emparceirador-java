package io.github.xadrezsuico.system.common.listeners.event;

import java.util.ArrayList;
import java.util.List;

public class EventListeners {
	
	public EventListeners() {
		 this.newEventListeners = new ArrayList<NewEventListener>();
	}
	
	/* 
	 * NEW EVENT LISTENER
	 */
	List<NewEventListener> newEventListeners;
	
	public void addNewEventListener(NewEventListener newEventListener) {
		this.newEventListeners.add(newEventListener);
	}
	
	public void handleNewEventListeners() {
		newEventListeners.forEach((newEventListener) -> {
			newEventListener.newEventListener();
		});
	}
	
	
	
}
