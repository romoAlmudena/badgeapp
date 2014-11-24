package com.example.badgeapp.API.Response;

import java.util.List;

import com.example.badgeapp.classes.Program;
import com.example.badgeapp.classes.System;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="programs")
public class BadgeApiListProgramResponse {

		private List<Program> programs;

		public List<Program> getPrograms() {
			return programs;
		}

		public void setPrograms(List<Program> programs) {
			this.programs = programs;
		}

		@Override
		public String toString() {
			return "BadgeApiListSystemResponse [programs=" + programs + "]";
		}
}
