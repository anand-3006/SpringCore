package SpringSearch;

import java.lang.ProcessBuilder.Redirect;

import javax.naming.Binding;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchCont {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("this home method is working!!");
		return "home";
	}
	
	////using RedirectiveView
//	@RequestMapping("/search")
//	public RedirectView search(@RequestParam("querybox") String query) {
//		String url="https://www.google.com/search?q=" + query;
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(url);
//		return redirectView;
//	}
	////using redirective prefix
	@RequestMapping("/search")
	public String AS(@RequestParam("querybox") String query) {
		if(query.isEmpty()) {
			return "redirect:/home";
		}
		System.out.println("the query is fetching using redirective prefix");
		return "redirect:https://www.google.com/search?q="+query;
	}
}
