package SpringSearch;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class Interceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String str=request.getParameter("querybox");
		if(str.isBlank()) {
			response.setContentType("text/html");
			response.getWriter().println("<h1>Plz Search anything!!!</h1>");
			return false;
		}
		System.out.println("Handler method is working!!");
		return true;
	}

}
