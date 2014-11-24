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

import com.example.badgeapp.API.Response.BadgeApiListProgramResponse;
import com.example.badgeapp.API.Response.BadgeApiListSystemResponse;
import com.example.badgeapp.API.Response.BadgeApiProgramResponse;
import com.example.badgeapp.API.Response.BadgeApiSystemResponse;
import com.example.badgeapp.auth.generateHmac;
import com.example.badgeapp.classes.Program;
import com.example.badgeapp.classes.System;

@Component
public class ProgramManagerImp implements ProgramManagerInterface {
	private static final long serialVersionUID = 1L;
	private RestTemplate restTemplate = new RestTemplate();
	private generateHmac hmac = new generateHmac();
	
	@Override
	public ResponseEntity<BadgeApiListProgramResponse> getPrograms() {
		
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);

		HttpEntity<Program> entity = new HttpEntity<Program>(headers);

		String URL = "http://192.168.205.140:8080/systems/badgekit/issuers/spring/programs";
				
		ResponseEntity<BadgeApiListProgramResponse> result = restTemplate
				.exchange(URL, HttpMethod.GET, entity,
						BadgeApiListProgramResponse.class);

	//	System.out.println(result.getBody().toString());

		return result;
	}

	@Override
	public ResponseEntity<BadgeApiProgramResponse> getProgram(String slug) {
	
		// Prepare acceptable media type
				List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
				acceptableMediaTypes.add(MediaType.APPLICATION_XML);
				acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

				// Prepare header
				HttpHeaders headers = new HttpHeaders();
				headers.setAccept(acceptableMediaTypes);

				HttpEntity<Program> entity = new HttpEntity<Program>(headers);

				String URL = "http://192.168.205.140:8080/systems//badgekit/issuers/spring/programs/" + slug;
						
				ResponseEntity<BadgeApiProgramResponse> result = restTemplate
						.exchange(URL, HttpMethod.GET, entity,
								BadgeApiProgramResponse.class);

			//	System.out.println(result.getBody().toString());

				
		return result;
	}

	@Override
	public void addProgram(Program program) {
		
		
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
		
		// Prepare header

		
		HttpHeaders headers = new HttpHeaders();
		String path = "/systems/badgekit/issuers/spring/programs" ;
		String sig = hmac.getHmac("POST", path);
		headers.add("signature", sig);
		headers.setAccept(acceptableMediaTypes);
		
		HttpEntity<Program> entity = new HttpEntity<Program>(program, headers);
		
		
		
		
		String URL = "http://192.168.205.140:8080/systems";
		
		ResponseEntity<Program> result = restTemplate.exchange(
				URL, HttpMethod.POST, entity, Program.class);
	
		
		
		java.lang.System.out.println(result.getBody().toString());
			

	}

	@Override
	public boolean modifyProgram(String program, String name, String url,
			String description, String email, String imageUrl) {
		
		
		// Prepare acceptable media type
				List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
				acceptableMediaTypes.add(MediaType.APPLICATION_XML);
				acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
				
				
				// Prepare header
				Program p  = new Program(program,name,url, description, email,imageUrl);

				
				HttpHeaders headers = new HttpHeaders();
				String path = "/systems/badgekit/issuers/spring/programs/" + program;
				String sig = hmac.getHmac("PUT", path);
				headers.add("signature", sig);
				headers.setAccept(acceptableMediaTypes);
				
				HttpEntity<Program> entity = new HttpEntity<Program>(p, headers);
				
				
				
				
				String URL = "http://192.168.205.140:8080/systems/badgekit/issuers/spring/programs/" + program;
				
				ResponseEntity<Program> result = restTemplate.exchange(
						URL, HttpMethod.PUT, entity, Program.class);
			
				
				
				java.lang.System.out.println(result.getBody().toString());
					
		return false;
	}


	
	

}
