package io.github.xadrezsuico.system.persistence;

/**Interface abstrata com os metodos DAO do banco
 * 
 * @author jhoestevam
 *
 * @param <T>
 */
public abstract interface Abstract<T> {
	
	public abstract void toSave(T Entity);
	
	public abstract T update(T Entity);
	
	public abstract void remove(T Entity);
	
}
