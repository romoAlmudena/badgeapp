package com.example.badgeapp.service;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;

import com.example.badgeapp.API.Response.BadgeApiListProgramResponse;
import com.example.badgeapp.API.Response.BadgeApiProgramResponse;
import com.example.badgeapp.classes.Program;


public interface ProgramManagerInterface extends Serializable{

	public  ResponseEntity<BadgeApiListProgramResponse> getPrograms();
    
    public  ResponseEntity<BadgeApiProgramResponse> getProgram (String slug);
	
    public void addProgram(Program newProgram);
    
    public boolean modifyProgram(String program , String name, String url,String description, String email, String imageUrl);
}
