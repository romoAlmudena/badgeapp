package com.example.badgeapp.service;

import java.io.Serializable;

import org.springframework.http.ResponseEntity;

import com.example.badgeapp.API.Response.BadgeApiListSystemResponse;
import com.example.badgeapp.API.Response.BadgeApiSystemResponse;
import com.example.badgeapp.classes.System ;
import com.example.badgeapp.classes.response.SystemResponse;

public interface SystemManagerInterface extends Serializable{

	public  ResponseEntity<BadgeApiListSystemResponse> getSystems();
    
    public  ResponseEntity<BadgeApiSystemResponse> getSystem (String slug);
	
    public ResponseEntity<SystemResponse> addSystem(System newSystem);
    
    //system,name,url, description, email,imageUrl

    public boolean modifySystem(String system , String name, String url,String description, String email, String imageUrl);
}
