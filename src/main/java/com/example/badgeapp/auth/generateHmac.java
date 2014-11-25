package com.example.badgeapp.auth;

import java.security.GeneralSecurityException;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;

import com.example.badgeapp.API.Request.BadgeApiBadgeRequest;
import com.google.gson.Gson;

public class generateHmac {
	
	/*
	public String getHmac(){
		String secretKey = "yoursecret";
		

		
		//String salt = "{\"key\":\"master\",\"exp\":1414519415458,\"method\":\"GET\",\"path\":\"/systems/badgekit/badges\"}";
		Gson gson = new Gson();
		BadgeApiBadgeRequest request = new BadgeApiBadgeRequest();

		
		String generateHmacSHA256Signature = null;
		try {
			String data = gson.toJson(request.getPayload());
			System.out.println(data);
			generateHmacSHA256Signature = generateHmacSHA256Signature(data, secretKey);
			System.out.println("Signature: " + generateHmacSHA256Signature);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return generateHmacSHA256Signature;

	}
	*/
	
	public String getHmac(String method, String path){
		String secretKey = "yoursecret";
		
		Gson gson = new Gson();
		BadgeApiBadgeRequest request = new BadgeApiBadgeRequest();

		
		String generateHmacSHA256Signature = null;
		try {
			String data = gson.toJson(request.getPayload(method, path));
			System.out.println(data);
			generateHmacSHA256Signature = generateHmacSHA256Signature(data, secretKey);
			System.out.println("Signature: " + generateHmacSHA256Signature);
		} catch (GeneralSecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return generateHmacSHA256Signature;

	}

	private static String generateHmacSHA256Signature(String data, String key) throws GeneralSecurityException {
		byte[] hmacData = null;

		try {
			SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(), "HmacSHA256");
			Mac mac = Mac.getInstance("HmacSHA256");
			mac.init(secretKey);
			hmacData = mac.doFinal(data.getBytes());
			return new String(Hex.encodeHex(hmacData));
		} catch (GeneralSecurityException e) {
			throw new GeneralSecurityException(e);
		}
	}

}
