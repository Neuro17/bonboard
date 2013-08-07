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

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.google.gson.Gson;







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
	public ModelAndView home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("home");
		return modell;
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
//		
//		model.addAttribute("serverTime", formattedDate );
		
		
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public ModelAndView loregistergin(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("register");
		return modell;
	}
	
	@RequestMapping(value = "/about/about_us", method = RequestMethod.GET)
	public ModelAndView aboutUs(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("aboutUs");
		return modell;
	}
	
	@RequestMapping(value = "/about/advisory", method = RequestMethod.GET)
	public ModelAndView advisory(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("advisory");
		return modell;
	}
	
	@RequestMapping(value = "/about/partners", method = RequestMethod.GET)
	public ModelAndView partners(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("partners");
		return modell;
	}
	
	@RequestMapping(value = "/about/staff", method = RequestMethod.GET)
	public ModelAndView staff(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("staff");
		return modell;
	}
	
	@RequestMapping(value = "/servizi/i_nostri_servizi_per_voi", method = RequestMethod.GET)
	public ModelAndView servizi(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("servizi");
		return modell;
	}
	
	@RequestMapping(value = "/servizi/offerta_modulare", method = RequestMethod.GET)
	public ModelAndView modulare(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("modulare");
		return modell;
	}
	
	@RequestMapping(value = "/servizi/personalizzazione_dei_servizi", method = RequestMethod.GET)
	public ModelAndView personalizzazione(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		ModelAndView modell = new ModelAndView("personalizzazione");
		return modell;
	}
	

	

	

	
//	@RequestMapping(value="page", method = RequestMethod.GET, params= "page")
//	public String getPage(@RequestParam(value = "page") String page){
//		logger.info("request for the page "+page);
//		
//		return "generated"+File.separator+page;
//	}
	
	
	
	
	
    
    
    private ResponseEntity<String> createJsonResponse( Object o )
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        String json = gson.toJson( o );
        return new ResponseEntity<String>( json, headers, HttpStatus.CREATED );
    }
    
//    private Users getUsers(){
//		User user = (User)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//	    String name = user.getUsername(); //get logged in username
//	    Users u=new Users(user.getUsername(),user.getPassword(),user.isEnabled(),null);
//	    return u;
//    }
	
}
