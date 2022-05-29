package in.tom.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.tom.services.Add_Services;

@Controller
public class Add_Controller {
    
	@RequestMapping("/add")
	public ModelAndView getAdd(@RequestParam("n1") int a,@RequestParam("n2")int b,HttpServletRequest request,HttpServletResponse response) {
		
		Add_Services adding=new Add_Services();
		int c=adding.addMen(a,b);
		
		ModelAndView mv=new ModelAndView();
		System.out.println(c+ "HERE");
		//mv.setViewName("add_result");
		//mv.addObject("result_Men",c);
		mv.setViewName("add_result");
		mv.addObject("result_Men",c);
		return mv;
	}
}
