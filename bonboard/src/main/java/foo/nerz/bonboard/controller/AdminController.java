package foo.nerz.bonboard.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import foo.nerz.bonboard.dao.UserDao;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericController;


@Controller
@RequestMapping("/admin")
public class AdminController extends GenericController {

	@Autowired
	UserDao userDao;
	
	
	// BIAGIO qua è dove dovrai settare le variabili della pagina!
	// come si settano si vede in foo.nerz.bonboard.util.GenericController
	@RequestMapping(value = "dashboard", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().getAuthorities().toArray()[0]);

		// con questa funzione recupero l'oggetto con i dati dell'utente
		
		Users u=userDao.findById(getUsers().getUsername());
		
		//dopo li tiri fuori da u i dati
		logger.debug(u.getEmail());
		
		
		ModelAndView model = new ModelAndView("dashboard");
		
		
		return setHeader(model);

		
	}
	
}
