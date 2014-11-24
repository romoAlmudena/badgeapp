package com.example.badgeapp.API.Response;


import com.example.badgeapp.classes.Badge;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="badge")
public class BadgeApiBadgeResponse {
	private Badge badge;

	public Badge getBadge() {
		return badge;
	}

	public void setBadge(Badge badge) {
		this.badge = badge;
	}

	@Override
	public String toString() {
		return "BadgeApiResponse [badge=" + badge + "]";
	}



	
}
