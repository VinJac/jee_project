package com.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	/*
	 * Attendance page initialisation
	 * The actions after that will be performed through AJAX
	 */
	@RequestMapping(value = "/attendance", method = RequestMethod.GET)
	public String getAttendancePage(HttpSession session) {
		// if the user has not logged in, redirect to login page
		if(session.getAttribute("nurseryName") == null)
			return "redirect:/";
		return "attendance";
	}

}
