package com.example.badgeapp.service;

import java.io.Serializable;
import java.util.HashMap;

import org.springframework.http.ResponseEntity;

import com.example.badgeapp.API.Response.BadgeApiBadgeResponse;
import com.example.badgeapp.API.Response.BadgeApiListBadgesResponse;

public interface BadgeManagerInterface extends Serializable {

    
    public  ResponseEntity<BadgeApiListBadgesResponse> getBadges(String system);
    
    public  ResponseEntity<BadgeApiBadgeResponse> getBadge(String system , String badge);
	
    public void modifyBadge(String system , String badge, String name, String consumerDesciption);

    public HashMap<String, Object>getStructure();
}