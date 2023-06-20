package SpringMVC.Controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AController {
	@RequestMapping("/contact")
	public String hand() {
		System.out.println("this is working");
		return "contact";
	}
	@RequestMapping(path= "/processform", method = RequestMethod.POST)
	public String handelForm(HttpServletRequest request) {
		String em = request.getParameter("email");
		System.out.println("this is user email ");
		return "";
	}
	}	
