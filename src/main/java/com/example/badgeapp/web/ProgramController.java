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

import com.example.badgeapp.API.Response.BadgeApiListProgramResponse;
import com.example.badgeapp.API.Response.BadgeApiProgramResponse;
import com.example.badgeapp.classes.Program;
import com.example.badgeapp.service.ProgramManagerInterface;

@Controller
public class ProgramController {
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ProgramManagerInterface programManager;
	
	@RequestMapping(value = "/programlist.htm")
	public ModelAndView handleRequestprogramList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String now = (new Date()).toString();
		logger.info("Returning hello view with " + now);

		Map<String, Object> myModel = new HashMap<String, Object>();
		myModel.put("now", now);
		
		
		try {
			
			ResponseEntity<BadgeApiListProgramResponse> result = programManager.getPrograms();
			myModel.put("programs", result.getBody().getPrograms());

		} catch (Exception e) {
			logger.error(e);
		}
		return new ModelAndView("programlist", "model", myModel);
	}
	@RequestMapping(value= "/modifyprogram/{programId}.htm",method=RequestMethod.POST)	
	public String formModifyprogram(@PathVariable("programId") String id, @ModelAttribute("modifyprogram")Program modify)

    {

        programManager.modifyProgram(id, modify.getName(), modify.getUrl(),modify.getDescription(),
                    modify.getEmail(), modify.getImageUrl());
       

        
       

        return "redirect:/programlist.htm";
    }
	
	@RequestMapping(value="/modifyprogram/{programId}.htm",method=RequestMethod.GET)
    protected ModelAndView formModifyPSys(@PathVariable("programId") String id)
            throws ServletException {

		ModelAndView model = new ModelAndView();
		try {
			
			ResponseEntity<BadgeApiProgramResponse> result = programManager.getProgram(id);
			Program s = result.getBody().getProgram();
			model.addObject("modifyprogram", s);
	    	model.setViewName("modifyprogram");
			//myModel.put("badges", result.getBody().getBadges());

		} catch (Exception e) {
			logger.error(e);
		}
    	
    	return model;
    }
	
	@RequestMapping(value="/addprogram.htm", method = RequestMethod.POST) //Cualquier Post tiene que devolver redirect
    public String processAddNewProduct(@ModelAttribute("addprogram")Program newprogram)
    {
       	programManager.addProgram(newprogram);
        
        return "redirect:/hello.htm"; //No se puede pasar un ModelAndVIew 
    }
    
  
    @RequestMapping(value="/addprogram.htm",method=RequestMethod.GET)
    protected String  getAddNewProductForm(Model model){
    	Program newprogram = new Program();
   
    	model.addAttribute("addProgram",newprogram);
    	return "addprogram";
    }

}