package com.mark.human;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")!= null) {
			Integer count = (Integer) session.getAttribute("count");
			session.setAttribute("count", count+1);
		}
		else if(session.getAttribute("count")== null) {
			session.setAttribute("count", 0);
		}
		return "home.jsp";
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
	@RequestMapping("/time")
	public String time(Model model) {
    	//Displaying current time in 12 hour format with AM/PM
    	DateFormat dateFormat = new SimpleDateFormat("hh.mm aa");
    	String dateString = dateFormat.format(new Date()).toString();
    	System.out.println("Current time in AM/PM: "+dateString);
		model.addAttribute("time", dateString);
		return "time.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
    	//Displaying current date and time in 12 hour format with AM/PM
    	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy");
    	String dateString2 = dateFormat2.format(new Date()).toString();
    	System.out.println("Current date"+dateString2);
		model.addAttribute("date", dateString2);
		return "date.jsp";
	}
	
}
