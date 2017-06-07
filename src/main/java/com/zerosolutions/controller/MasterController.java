package com.zerosolutions.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MasterController {

	@GetMapping({"/", "/loginPage"})
	public ModelAndView login(@RequestParam(value = "error",required = false) String error,
			@RequestParam(value = "logout",	required = false) String logout){
		
		ModelAndView mv = new ModelAndView();
		if (error != null) {
			mv.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			mv.addObject("message", "Logged out from JournalDEV successfully.");
		}

		mv.setViewName("loginPage");
		return mv;
	}
	
	@GetMapping("/homePage")
	public ModelAndView homePage() {
		ModelAndView model = new ModelAndView();
		model.setViewName("homePage");
		return model;
	}
}
