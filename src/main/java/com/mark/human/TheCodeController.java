package com.mark.human;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	@RequestMapping("/thecode")
	public String whatIsTheCode(HttpSession session) {
		
		return "codeform.jsp";
	}
	@RequestMapping(value="/validatecode", method=RequestMethod.POST)
	public String validateCode(@RequestParam(value="code") String code, RedirectAttributes error) {
		if(code.equals("Bushido")) return "success.jsp";
		else {
			error.addFlashAttribute("error", "You must train harder!");
			return "redirect:/thecode";
			}
	}
}
