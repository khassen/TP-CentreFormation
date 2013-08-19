package fr.treeptik.centreformation.service.impl;

import java.util.List;

import fr.treeptik.centreformation.dao.GenericDAO;
import fr.treeptik.centreformation.exception.DAOException;
import fr.treeptik.centreformation.exception.ServiceException;
import fr.treeptik.centreformation.service.GenericService;

public abstract class GenericServiceImpl< T,PK, D extends GenericDAO<T, PK>> implements GenericService<T, PK>{

	protected abstract D getDao();
	
	@Override
	public T save(T entite) throws ServiceException {
		try {
			getDao().save(entite);
			return entite;
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public void remove(T entite) throws ServiceException {
		try {
			getDao().remove(entite);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public T findById(PK id) throws ServiceException {
		try {
			return getDao().findById(id);
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}

	@Override
	public List<T> findAll() throws ServiceException {
		try {
			return getDao().findAll();
		} catch (DAOException e) {
			throw new ServiceException(e.getMessage(), e.getCause());
		}
	}
}
	


