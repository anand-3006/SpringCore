package SpringSearch;

import org.springframework.stereotype.Controller;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ApplController {
@RequestMapping("/A1")
	public String method() {
		return "application";
	}
//@RequestMapping(path="/handle" ,method = RequestMethod.POST)
//public String method2(@RequestParam("name")String name,@RequestParam("id")Long id) {
//	System.out.println(name);
//	System.out.println(id);
//	return "";
	@RequestMapping(path = "/handle",method = RequestMethod.POST)
	public String method3(@ModelAttribute("user") User user,BindingResult result) {
		if(result.hasErrors()) {
			return"application";
		}
		System.out.println(user);//it will print User toString method
		System.out.println(user.getAddress());//it will print Address to string method
		return"Success";
	}

}
