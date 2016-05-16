package web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/person")
public class personController {

	@RequestMapping("/index.htm")
	public ModelAndView index(HttpServletRequest request){
		System.out.println("coming....");
		System.out.println(this.getClass().getResourceAsStream("/"));
		request.setAttribute("title", "welcome");
		return new ModelAndView("/welcome.jsp");
	}
}
