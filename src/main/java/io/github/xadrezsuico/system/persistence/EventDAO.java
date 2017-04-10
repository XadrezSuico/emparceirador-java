package io.github.xadrezsuico.system.persistence;

import io.github.xadrezsuico.system.common.Event;

public class EventDAO extends AbstractDAO<Event>{

	public EventDAO() {
		super(Event.class);
	}
}
