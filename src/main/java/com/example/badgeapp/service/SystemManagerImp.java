package com.example.badgeapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.example.badgeapp.API.Response.BadgeApiListSystemResponse;
import com.example.badgeapp.API.Response.BadgeApiSystemResponse;
import com.example.badgeapp.auth.generateHmac;
import com.example.badgeapp.classes.System;
import com.example.badgeapp.classes.response.SystemResponse;

@Component
public class SystemManagerImp implements SystemManagerInterface {
	private static final long serialVersionUID = 1L;
	private RestTemplate restTemplate = new RestTemplate();
	private generateHmac hmac = new generateHmac();
	
	@Override
	public ResponseEntity<BadgeApiListSystemResponse> getSystems() {
		
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);

		HttpEntity<System> entity = new HttpEntity<System>(headers);

		String URL = "http://192.168.205.140:8080/systems/";
				
		ResponseEntity<BadgeApiListSystemResponse> result = restTemplate
				.exchange(URL, HttpMethod.GET, entity,
						BadgeApiListSystemResponse.class);

	//	System.out.println(result.getBody().toString());

		return result;
	}

	@Override
	public ResponseEntity<BadgeApiSystemResponse> getSystem(String slug) {
	
		// Prepare acceptable media type
				List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
				acceptableMediaTypes.add(MediaType.APPLICATION_XML);
				acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

				// Prepare header
				HttpHeaders headers = new HttpHeaders();
				headers.setAccept(acceptableMediaTypes);

				HttpEntity<System> entity = new HttpEntity<System>(headers);

				String URL = "http://192.168.205.140:8080/systems/" + slug;
						
				ResponseEntity<BadgeApiSystemResponse> result = restTemplate
						.exchange(URL, HttpMethod.GET, entity,
								BadgeApiSystemResponse.class);

			//	System.out.println(result.getBody().toString());

				
		return result;
	}

	@Override
	public ResponseEntity<SystemResponse> addSystem (System system) {
		
		
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
		
		// Prepare header

		
		HttpHeaders headers = new HttpHeaders();
		/*
		String path = "http://192.168.205.140:8080/systems" ;
		String sig = hmac.getHmac("POST", path);
		headers.add("signature", sig);
		headers.add("path", path);
		*/
		headers.setAccept(acceptableMediaTypes);
		
		HttpEntity<System> entity = new HttpEntity<System>(system, headers);
		
		
		
		
		String URL = "http://192.168.205.140:8080/systems";
		
		ResponseEntity<SystemResponse> result = restTemplate.exchange(
				URL, HttpMethod.POST, entity, SystemResponse.class);
	
		
		
		java.lang.System.out.println(result.getBody().toString());
			
		return result;
	}

/*	
	@Override
	public void addSystemAnt(SystemClass system) {
		
		
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
		
		// Prepare header

		
		HttpHeaders headers = new HttpHeaders();
		String path = "/systems" ;
		String sig = hmac.getHmac("POST", path);
		headers.add("signature", sig);
		headers.setAccept(acceptableMediaTypes);
		
		HttpEntity<SystemClass> entity = new HttpEntity<SystemClass>(system, headers);
		
		
		
		
		String URL = "http://192.168.205.140:8080/systems";
		
		ResponseEntity<SystemResponse> result = restTemplate.exchange(
				URL, HttpMethod.POST, entity, SystemResponse.class);
	
		
		
		java.lang.System.out.println(result.getBody().toString());
			

	}
*/
	@Override
	public boolean modifySystem(String system, String name, String url,
			String description, String email, String imageUrl) {
		
		
		// Prepare acceptable media type
				List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
				acceptableMediaTypes.add(MediaType.APPLICATION_XML);
				acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
				
				
				// Prepare header
				System s = getSystem(system).getBody().getSystem();
				
				//System sc = new System(system,name,url, description, email,imageUrl);
				s.setName(name);
				s.setEmail(email);
				s.setUrl(url);
				s.setEmail(email);
				s.setImageUrl(imageUrl);
				
				HttpHeaders headers = new HttpHeaders();
				String path = "/systems/" + system;
				String sig = hmac.getHmac("PUT", path);
				headers.add("signature", sig);
				headers.setAccept(acceptableMediaTypes);
				
				HttpEntity<System> entity = new HttpEntity<System>(s, headers);
				
				
				
				
				String URL = "http://192.168.205.140:8080/systems/" + system;
				
				ResponseEntity<SystemResponse> result = restTemplate.exchange(
						URL, HttpMethod.PUT, entity, SystemResponse.class);
			
				
				
				java.lang.System.out.println(result.getBody().toString());
					
		return false;
	}


	
	

}
