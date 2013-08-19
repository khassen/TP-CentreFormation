package fr.treeptik.centreformation.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.treeptik.centreformation.dao.GenericDAO;
import fr.treeptik.centreformation.exception.DAOException;

public class GenericDAOJPA<T, PK> implements GenericDAO<T, PK> {

	@PersistenceContext
	private EntityManager entityManager;

	private Class<T> type;

	public GenericDAOJPA(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public T save(T entite) throws DAOException {
		entityManager.persist(entite);
		return entite;
	}

	@Override
	public void remove(T entite) throws DAOException {
		//entite = entityManager.find(type, id);
		// entityManager.remove(entite);

		entityManager.createQuery("delete from" + type.getSimpleName()
				+ "o where o.id= :id", type);
	}

	public T findById(PK id) throws DAOException {

		return entityManager.find(type, id);
	}

	@Override
	public List<T> findAll() throws DAOException {
		return entityManager.createQuery(
				"select o from" + type.getSimpleName() + "o", type)
				.getResultList();

	}
}
