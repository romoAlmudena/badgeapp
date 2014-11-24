package com.example.badgeapp.API.Response;

import java.util.List;
import com.example.badgeapp.classes.System;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="systems")
public class BadgeApiListSystemResponse {

		private List<System> systems;

		public List<System> getSystems() {
			return systems;
		}

		public void setSystems(List<System> systems) {
			this.systems = systems;
		}

		@Override
		public String toString() {
			return "BadgeApiListSystemResponse [systems=" + systems + "]";
		}
}
