package com.bolsadeideas.spring.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class IndexController {

	@GetMapping({"/index", "/", "/home", ""})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola spring framework!");
		return "index";
	}
}
