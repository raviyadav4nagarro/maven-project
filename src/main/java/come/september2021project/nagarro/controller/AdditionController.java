package come.september2021project.nagarro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditionController {
	
	@RequestMapping(value="/Addition")
	public ModelAndView add(HttpServletRequest req,HttpServletResponse resp) {
		ModelAndView mv = new ModelAndView();
		int a = Integer.parseInt(req.getParameter("var1"));
		int b = Integer.parseInt(req.getParameter("var2"));
		int c = a + b;
		mv.addObject("Result",c);
		mv.setViewName("AdditionResult");
    	return mv;
	}

}
