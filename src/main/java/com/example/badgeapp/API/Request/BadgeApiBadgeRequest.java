package com.example.badgeapp.API.Request;

import com.example.badgeapp.auth.Payload;


public class BadgeApiBadgeRequest {

	private Payload payload;
	 

	/*	
 	public Payload getPayload() {
		return payload;
	}
	*/

	public void setPayload(Payload payload) {
		this.payload = payload;
	}
	
	public Payload getPayload(String method, String path) {
		payload = new Payload(method,path);
		return payload;
	}
	
}
