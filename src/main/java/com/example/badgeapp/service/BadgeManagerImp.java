package com.example.badgeapp.service;

/**
 * Modificando la capa de servicio para que haga uso de la persistencia en base de datos
 * */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.example.badgeapp.API.Response.BadgeApiBadgeResponse;
import com.example.badgeapp.API.Response.BadgeApiListBadgesResponse;
import com.example.badgeapp.auth.generateHmac;
import com.example.badgeapp.classes.Badge;
import com.example.badgeapp.domain.Category;
import com.google.gson.Gson;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
// -------------------
public class BadgeManagerImp implements BadgeManagerInterface {

	private static final long serialVersionUID = 1L;
	private RestTemplate restTemplate = new RestTemplate();
	private generateHmac hmac = new generateHmac();

	@Override
	public ResponseEntity<BadgeApiListBadgesResponse> getBadges(String system) {
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);

		HttpEntity<Badge> entity = new HttpEntity<Badge>(headers);

		String URL = "http://192.168.205.140:8080/systems/" + system
				+ "/badges";
		ResponseEntity<BadgeApiListBadgesResponse> result = restTemplate
				.exchange(URL, HttpMethod.GET, entity,
						BadgeApiListBadgesResponse.class);

		System.out.println(result.getBody().toString());

		return result;
	}

	@Override
	public ResponseEntity<BadgeApiBadgeResponse> getBadge(String system,
			String badge) {
		// Prepare acceptable media type
		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);

		// Prepare header
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(acceptableMediaTypes);

		HttpEntity<Badge> entity = new HttpEntity<Badge>(headers);

		String URL = "http://192.168.205.140:8080/systems/" + system
				+ "/badges/" + badge;

		ResponseEntity<BadgeApiBadgeResponse> result = restTemplate.exchange(
				URL, HttpMethod.GET, entity, BadgeApiBadgeResponse.class);

		System.out.println(result.getBody().toString());

		return result;
	}
    public void modifyBadge(String system , String badge, String name, String consumerDescription){
    	    		
    		// Prepare acceptable media type
    		List<MediaType> acceptableMediaTypes = new ArrayList<MediaType>();
    		acceptableMediaTypes.add(MediaType.APPLICATION_XML);
    		acceptableMediaTypes.add(MediaType.APPLICATION_JSON);
    		
    		ResponseEntity<BadgeApiBadgeResponse> original = getBadge(system, badge);

    		Badge b = original.getBody().getBadge();
    		b.setName(name);
    		b.setConsumerDescription(consumerDescription);
    		List<String> categories = new ArrayList<String>();
    		b.setCategories(categories);
   
    		// Prepare header
    		HttpHeaders headers = new HttpHeaders();
    		String path = "/systems/" + system + "/badges/"+ badge;
    		String sig = hmac.getHmac("PUT", path);
    		headers.add("signature", sig);    		
    		headers.setAccept(acceptableMediaTypes);

    		//Hay que pasar body, headers
    		//BadgeUpdate aux = new BadgeUpdate();
    
    		
    		HttpEntity<Badge> entity = new HttpEntity<Badge>(b,headers);
    		//entity.getBody().setBadge(b);
    		//entity.getBody().setStatus("update");
    		
    	
    	   	String URL = "http://192.168.205.140:8080/systems/" + system
    				+ "/badges/" + badge;

    		ResponseEntity<Badge> result = restTemplate.exchange(
    				URL, HttpMethod.PUT, entity, Badge.class);
    		//Fala el exhange
    	
    		System.out.println("Resultado: "+result.getBody().toString());
    	
    }
    public HashMap<String, Object> getStructure(){
    	Badge b = new Badge();
    	return b.getStructure();
    }
}