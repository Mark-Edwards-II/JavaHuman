package com.mark.human;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@RequestMapping("helloindex")
	public String index() {
		return "index stuff";
	}
	
	@RequestMapping("/human")
	public String human() {
		return "human";
	}
	@RequestMapping("/hello/")
	public String jspIn(@RequestParam(value="name", required=false) String searchQuery, Model model) {
		if(searchQuery == null) searchQuery = "Human";
		model.addAttribute("name", searchQuery);
		return "index.jsp";
	}
}
