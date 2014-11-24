package com.example.badgeapp.API.Response;

import java.util.List;

import com.example.badgeapp.classes.Badge;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="badges")
public class BadgeApiListBadgesResponse {
	private List<Badge> badges;

	public List<Badge> getBadges() {
		return badges;
	}

	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}

	@Override
	public String toString() {
		return "BadgeApiResponse [badges=" + badges + "]";
	}
	
	
}
