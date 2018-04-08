package com.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.daoapi.NurseryDao;
import com.entities.Nursery;

@Repository("NurseryDao")
@Transactional
public class NurseryImpl implements NurseryDao {

	@Autowired
	SessionFactory session;
	
	@SuppressWarnings("unchecked")
	public List<Nursery> list() {
		return session.getCurrentSession().createQuery("from Nursery").list();
	}
}
