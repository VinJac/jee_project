package com.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Nursery;
import com.servicesapi.LoginService;

/*
 * Session controller
 * Related to login, logout and redirection features
 */
@Controller
@RequestMapping("/")
public class SessionController {
	
	// automatically gets the loginService bean behind the api
	@Autowired
	LoginService loginService;
	
	/*
	 * Simply returns the login page
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLoginPage() {
		return "login";
	}
	
	/*
	 * Handles login
	 * if we could login, set the nursery's name in session
	 * else, redirects back to login page
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, @ModelAttribute("nursery")Nursery nursery) {
		
		// if we could log in
		if(loginService.canLogin(nursery)) {
			// set the nursery name in current session
			session.setAttribute("nurseryName", nursery.getNurseryName());
			// redirect to the attendance tab of home
			return "redirect:/home/attendance";
		}
		// else redirect back to the login screen
		return "redirect:/";
	}

}
