package com.example.badgeapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.badgeapp.API.Response.BadgeApiBadgeResponse;
import com.example.badgeapp.API.Response.BadgeApiListBadgesResponse;
import com.example.badgeapp.classes.Badge;
import com.example.badgeapp.domain.Category;
import com.example.badgeapp.service.BadgeManagerInterface;
import com.example.badgeapp.service.CategoriesService;


//Cuando quieres que algo lo implemente el controlador
@Controller
public class BadgeController {
	// Creo instancia del loger
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private BadgeManagerInterface badgeManager;
	@Autowired
	private CategoriesService catService;
	
	@RequestMapping(value="/home.htm",method=RequestMethod.GET)
    protected ModelAndView  getAddNewProductForm(Model model){
		
	
		 List<Category> catList = catService.getCategories();
		 model.addAttribute("categories", catList);
    	
		
		return new ModelAndView("home", "model", model);
    }

	@RequestMapping(value = "/badgelist.htm")
	public ModelAndView handleRequestBadgeList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		
		
		try {
			
			ResponseEntity<BadgeApiListBadgesResponse> result = badgeManager.getBadges("badgekit");
			myModel.put("badges", result.getBody().getBadges());

		} catch (Exception e) {
			logger.error(e);
		}
		return new ModelAndView("badgelist", "model", myModel);
	}
	
	
	@RequestMapping(value="/modifybadge/{badgeId}.htm",method=RequestMethod.GET)
    protected ModelAndView formModifyProduct(@PathVariable("badgeId") String id)
            throws ServletException {

		ModelAndView model = new ModelAndView();
		try {
			
			ResponseEntity<BadgeApiBadgeResponse> result = badgeManager.getBadge("badgekit" , id);
			Badge b = result.getBody().getBadge();
			model.addObject("modifyBadge", b);
	    	model.setViewName("modifybadge");
			//myModel.put("badges", result.getBody().getBadges());

		} catch (Exception e) {
			logger.error(e);
		}
    	
    	return model;
    }

	 /**Edit Products (PathVariable)*/
    @RequestMapping(value="/modifybadge/{badgeId}.htm",method=RequestMethod.POST)
    public String formModifyProduct(@PathVariable("badgeId") String id, @ModelAttribute("modifyBadge")Badge modify)

    {
		
        String name = modify.getName();
        String consumerDescription = modify.getConsumerDescription();
        
        badgeManager.modifyBadge("badgekit",id, name, consumerDescription);
       

        
       //return "redirect:/modifyproduct/{prodId}.htm";

        return "redirect:/badgelist.htm";
    }
    
    
    @RequestMapping(value="/addbadge.htm",method=RequestMethod.GET)
    protected String  getAddNewBadgeForm(Model model){
    	Badge newBadge = new Badge();
    	model.addAttribute("newBadge",newBadge);
    	return "addbadge";
    }
    
	public void setProductManager(BadgeManagerInterface productManager) {
		this.badgeManager = productManager;
	}

}
