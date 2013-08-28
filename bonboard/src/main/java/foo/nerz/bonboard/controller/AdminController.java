package foo.nerz.bonboard.controller;

import java.util.Locale;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import foo.nerz.bonboard.util.GenericController;


@Controller
@RequestMapping("/admin")
public class AdminController extends GenericController {

	
	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0]);

		ModelAndView model = new ModelAndView("dashboard");
		
		
		return setHeader(model);

		
	}
	
}
