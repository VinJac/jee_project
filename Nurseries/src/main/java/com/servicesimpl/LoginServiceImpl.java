package com.servicesimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.daoapi.NurseryDao;
import com.entities.Nursery;
import com.servicesapi.LoginService;

@Repository("LoginService")
public class LoginServiceImpl implements LoginService {
	
	// automatically gets the nursery data access object's implementation bean
	@Autowired
	NurseryDao nurseryDao;
	
	// we can log in if the nursery is in the list of the database's ones
	public boolean canLogin(Nursery nursery) {
		return (nurseryDao.list()).contains(nursery);
	}

}
