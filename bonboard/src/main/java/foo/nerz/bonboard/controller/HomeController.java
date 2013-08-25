package foo.nerz.bonboard.controller;

import java.io.File;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

import foo.nerz.bonboard.entity.Users;







/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	Gson gson = new Gson();
	
	
	@RequestMapping("contact")
	 public String welcome()
	 {
	  return "contact";
	 }


	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		logger.debug("##### Auth "+SecurityContextHolder.getContext().getAuthentication().isAuthenticated());

		ModelAndView model = new ModelAndView("home");
	
		
		return setHeader(model);

		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView loregistergin(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("register");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/about_us", method = RequestMethod.GET)
	public ModelAndView aboutUs(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("aboutUs");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/advisory", method = RequestMethod.GET)
	public ModelAndView advisory(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("advisory");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/partners", method = RequestMethod.GET)
	public ModelAndView partners(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("partners");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/about/staff", method = RequestMethod.GET)
	public ModelAndView staff(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("staff");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/i_nostri_servizi_per_voi", method = RequestMethod.GET)
	public ModelAndView servizi(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("servizi");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/offerta_modulare", method = RequestMethod.GET)
	public ModelAndView modulare(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("modulare");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/servizi/personalizzazione_dei_servizi", method = RequestMethod.GET)
	public ModelAndView personalizzazione(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("personalizzazione");
		return setHeader(model);
	}
	
	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ModelAndView blog(Locale locale) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView model = new ModelAndView("blog");
		return setHeader(model);
	}

	

	

	
//	@RequestMapping(value="page", method = RequestMethod.GET, params= "page")
//	public String getPage(@RequestParam(value = "page") String page){
//		logger.info("request for the page "+page);
//		
//		return "generated"+File.separator+page;
//	}
	
	
	
	/*
	 * Modificha l'header in base al login.
	 * L'autenticazione fa ricaricare automaticamente la pagina
	 * corrente
	 */
	
	
	private ModelAndView setHeader(ModelAndView model){
		if(getUsers() == null)model.addObject("authenticated",Boolean.FALSE);
		else{
			model.addObject("authenticated",Boolean.TRUE);
			model.addObject("username",getUsers().getUsername());
		}
		return model;
	}
    
    
    private ResponseEntity<String> createJsonResponse( Object o )
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String json = gson.toJson( o );
        return new ResponseEntity<String>( json, headers, HttpStatus.CREATED );
    }
    
    private User getUsers(){
		if(SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof String){
			return null;
		}else{
			return (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
    }
	
}
