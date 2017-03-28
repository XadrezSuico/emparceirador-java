package io.github.xadrezsuico.system.model;

import java.io.Serializable;

/**
 * 
 * @author jhoestevam
 */
public abstract class Entity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public abstract Integer getId();
	
	public abstract void setId(Integer id);
	
}
