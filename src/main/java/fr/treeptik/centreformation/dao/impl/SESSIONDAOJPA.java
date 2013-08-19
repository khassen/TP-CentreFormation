package fr.treeptik.centreformation.dao.impl;

import org.springframework.stereotype.Repository;

import fr.treeptik.centreformation.dao.SESSIONDAO;
import fr.treeptik.centreformation.model.SESSION;

@Repository
public class SESSIONDAOJPA extends GenericDAOJPA<SESSION, Integer> implements
		SESSIONDAO {

	public SESSIONDAOJPA() {
		super(SESSION.class);
		// TODO Auto-generated constructor stub
	}

}
