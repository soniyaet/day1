package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.UserModel;

@Controller
public class UserController {
@GetMapping(value="/load")
public String loadPage(Model model) {
	UserModel userModel=new UserModel();
	model.addAttribute("user", userModel);
	return "login";
}
@PostMapping(value="/login")
public ModelAndView loginPage(@Valid @ModelAttribute("user")UserModel userModel,BindingResult result) {
	ModelAndView modelAndView;
	if(result.hasErrors()) {
		return modelAndView=new ModelAndView("login");
	}
 modelAndView=new ModelAndView("loginsuccess");
 return modelAndView;
	
}
}
