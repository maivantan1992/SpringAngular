package com.sample.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class HBSpBasicDAO<E, PK extends Serializable> extends
		HibernateDaoSupport {
	private Class<E> persistentClass;

	public HBSpBasicDAO(final Class<E> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Autowired
	public void initSessionFatory(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	public E get(PK id) {
		return this.getHibernateTemplate().get(this.persistentClass, id);
	}
	
	public List<E> getAll()
	{
		return this.getHibernateTemplate().loadAll(this.persistentClass);
	}
	
	@SuppressWarnings("unchecked")
	public PK insert(E entity)
	{
		return (PK) this.getHibernateTemplate().save(entity);
	}
	
	@Transactional(readOnly=false)
	public E update(E entity){		
		this.getHibernateTemplate().merge(entity);
		//this.getHibernateTemplate().flush();
		return entity;
	}
	
	
}
