package SpringMVC.Controller;


import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.bytebuddy.asm.Advice.Local;

@Controller
public class Controlletr {
	@RequestMapping("/home")//we need to add /home on localhost/8080/SpringMVC/home
	public String home(Model AS) {
		AS.addAttribute("A","The King");
		AS.addAttribute("B",4658);
		List<String> names=new ArrayList<String>();
		names.add("Satish");
		names.add("Mahesh");
		AS.addAttribute("AC",names);
		return "index";
	}
	@RequestMapping("/AS")
	public ModelAndView Anand() {
		System.out.println("this is my controllere here we are using ModelAndView method!!");
		ModelAndView modela=new ModelAndView();
		modela.addObject("na","this is the king");
		modela.addObject("an",88);
		modela.setViewName("anands");
		LocalDateTime now = LocalDateTime.now();
		modela.addObject("timi",now);
		List<Object> O=new ArrayList<Object>();
		O.add("Anands");
		O.add(12);
		modela.addObject("Ob",O);
		return modela;
	}
}
