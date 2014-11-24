package com.example.badgeapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
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

import com.example.badgeapp.API.Response.BadgeApiListSystemResponse;
import com.example.badgeapp.API.Response.BadgeApiSystemResponse;
import com.example.badgeapp.classes.response.SystemResponse;
import com.example.badgeapp.classes.System;
import com.example.badgeapp.service.SystemManagerInterface;

@Controller
public class SystemController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private SystemManagerInterface systemManager;
	
	@RequestMapping(value = "/systemlist.htm")
	public ModelAndView handleRequestSystemList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		
		
		try {
			
			ResponseEntity<BadgeApiListSystemResponse> result = systemManager.getSystems();
			myModel.put("systems", result.getBody().getSystems());

		} catch (Exception e) {
			logger.error(e);
		}
		return new ModelAndView("systemlist", "model", myModel);
	}
	@RequestMapping(value= "/modifysystem/{systemId}.htm",method=RequestMethod.POST)	
	public String formModifySystem(@PathVariable("systemId") String id, @ModelAttribute("modifySystem")System modify)

    {
		//    //system,name,url, description, email,imageUrl
 //		
		java.lang.System.out.println(modify.getDescription());
        systemManager.modifySystem(id, modify.getName(), modify.getUrl(),modify.getDescription(),
                    modify.getEmail(), modify.getImageUrl());
       

        
       

        return "redirect:/systemlist.htm";
    }
	
	@RequestMapping(value="/modifysystem/{systemId}.htm",method=RequestMethod.GET)
    protected ModelAndView formModifyPSys(@PathVariable("systemId") String id)
            throws ServletException {

		ModelAndView model = new ModelAndView();
		try {
			
			ResponseEntity<BadgeApiSystemResponse> result = systemManager.getSystem(id);
			System s = result.getBody().getSystem();
			model.addObject("modifySystem", s);
	    	model.setViewName("modifysystem");
			//myModel.put("badges", result.getBody().getBadges());

		} catch (Exception e) {
			logger.error(e);
		}
    	
    	return model;
    }
	
	@RequestMapping(value="/addsystem.htm", method = RequestMethod.POST) //Cualquier Post tiene que devolver redirect
    public String processAddNewProduct(@ModelAttribute("addSystem")System newSystem)
    {
		ResponseEntity<SystemResponse> resoponseSystem = systemManager.addSystem(newSystem);
        if (resoponseSystem.getBody().getStatus().equals("created"))
        	return "redirect:/systemlist.htm"; //No se puede pasar un ModelAndVIew 
        return "redirect:/systemerror.htm";
    }
    
	   @RequestMapping(value="/systemcorrect.htm",method=RequestMethod.GET)
	    protected ModelAndView confirmSystemCreated(Model model){
	    	
	   
	    	
		   return new ModelAndView("systemcorrect", "model", model);
	    }
    @RequestMapping(value="/addsystem.htm",method=RequestMethod.GET)
    protected String  getAddNewProductForm(Model model){
    	System newSystem = new System();
   
    	model.addAttribute("addSystem",newSystem);
    	return "addsystem";
    }

}
