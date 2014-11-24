package com.example.badgeapp.API.Response;

import javax.xml.bind.annotation.XmlRootElement;
import com.example.badgeapp.classes.System;


@XmlRootElement(name="system")
public class BadgeApiSystemResponse {

	private System system;

	public System getSystem() {
		return system;
	}

	public void setSystem(System system) {
		this.system = system;
	}

	@Override
	public String toString() {
		return "BadgeApiSystemResponse [system=" + system + "]";
	}
	
}
