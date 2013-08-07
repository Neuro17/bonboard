package foo.nerz.bonboard.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;

import foo.nerz.bonboard.dao.PostDao;
import foo.nerz.bonboard.entity.Content;
import foo.nerz.bonboard.entity.Post;

@Controller
@RequestMapping("/content")
public class ContentController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	Gson gson = new Gson();
	
	@Autowired
	PostDao postDao;
	
	
	
	
	
	@RequestMapping("/blog")
	 public String blog(Locale locale, Model model)
	 {
		logger.debug("Welcome blog! The client locale is {}.", locale);
		
//		logger.debug(locale.getCountry());
//		logger.debug(locale.getDisplayCountry());
//		logger.debug(locale.getLanguage());
		
		List<Post> blog=postDao.get10PostPaged(1, 1);
		
		List<Content> contents = new ArrayList<Content>();
		
		for(Post c:blog){
			contents.add(new Content(c, locale.getLanguage()));
		}
		
//		for(Content c : contents){
//			System.out.println(c.getBody());
//			System.out.println(c.getnComments());
//			System.out.println(c.getTitle());
//			System.out.println(c.getUser());
//			System.out.println(c.getTime());
//		}
		
		
		
		model.addAttribute("contents", contents);
		
//		for(Post p : blog){
//			System.out.println(p.getTitoloIta());
//			System.out.println(p.getCountComments());
//		}
		
		
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "blog";
	 }
	
	
	@RequestMapping("/press")
	 public String press()
	 {
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "contact";
	 }
	
	
	@RequestMapping("/offerte")
	 public String offerte()
	 {
		//caricare le prime 10 pagine
		
		//controllare la lingua
		
		//popolare la jsp
		
	  return "contact";
	 }
	

}
