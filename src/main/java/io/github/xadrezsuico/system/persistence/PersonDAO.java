package io.github.xadrezsuico.system.persistence;

import io.github.xadrezsuico.system.common.Person;

public class PersonDAO extends AbstractDAO<Person> {
	
	public PersonDAO(){
		super(Person.class);
	}
}
