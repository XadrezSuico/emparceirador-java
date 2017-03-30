package io.github.xadrezsuico.system.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import io.github.xadrezsuico.system.model.Entity;
/**
 * Classe abstract implementando design pattern DAO
 * 
 * @author jhoestevam
 *
 * @param <T>
 */
public abstract class AbstractDAO<T extends Entity> implements Abstract<T>{

	private EntityManager entityManager;
	
	protected Class<T> entityClass;
	
	public AbstractDAO(){
	}
	
	public AbstractDAO(Class<T> entityClass){
		this.entityClass = entityClass;
	}
	
	public EntityManager getEntityManager(){
		if(entityManager == null){
			EntityManagerFactory factory = Persistence.createEntityManagerFactory(null);
			
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	@Override
	public void toSave(T entity){
		if(entity == null){
			return;
		}
		
		EntityManager entityMan = getEntityManager();
		EntityTransaction entityTransaction = entityMan.getTransaction();
		
		entityTransaction.begin();
		
		if(entity.getId() != null){
			entityMan.merge(entity);
		}else{
			entityMan.persist(entity);
		}
		
		entityTransaction.commit();
	}
	
	@Override
	public T update(T entity){
		if(entity == null){
			return null;
		}
		
		EntityManager entityMan = getEntityManager();
		EntityTransaction entityTransaction = entityMan.getTransaction();
		
		entityTransaction.begin();
		
		if (entity.getId() != null) {
			entity = entityMan.merge(entity);
		}else{
			entityMan.persist(entity);
		}
		
		entityTransaction.commit();
		
		return entity;
	}
	
	@Override
	public void remove(T entity){
		if(entity == null){
			return;
		}
		
		EntityManager entityMan = getEntityManager();
		EntityTransaction entityTransaction = entityMan.getTransaction();
		
		entityTransaction.begin();
		
		entityMan.remove(entity);
		
		entityTransaction.commit();
	}
}
