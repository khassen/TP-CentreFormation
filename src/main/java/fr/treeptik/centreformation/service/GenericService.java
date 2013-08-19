package fr.treeptik.centreformation.service;

import java.util.List;

import fr.treeptik.centreformation.exception.ServiceException;

public interface GenericService<T,PK> {
	
	
	T save(T entite) throws ServiceException;
	void remove(T entite) throws ServiceException;
	T findById(PK id) throws ServiceException;
	List<T> findAll() throws ServiceException;

}
