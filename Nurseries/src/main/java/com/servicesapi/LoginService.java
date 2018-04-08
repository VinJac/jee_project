package com.servicesapi;

import com.entities.Nursery;

/*
 * Login service API
 */
public interface LoginService {
	// returns true if the given nursery is in the database (and therefore can log in)
	// false otherwise
	public boolean canLogin(Nursery nursery);
}
