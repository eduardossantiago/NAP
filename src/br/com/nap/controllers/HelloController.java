package br.com.nap.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {


@RequestMapping("helloworld")
	public String hello(Model model) {
		
	
		model.addAttribute("parametroteste", "ola");
		return "HelloWorld";
	}
}
