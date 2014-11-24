package com.example.badgeapp.API.Response;

import javax.xml.bind.annotation.XmlRootElement;

import com.example.badgeapp.classes.Program;
import com.example.badgeapp.classes.System;


@XmlRootElement(name="program")
public class BadgeApiProgramResponse {

	private Program program;

	public Program getProgram() {
		return program;
	}

	public void setProgram(Program program) {
		this.program = program;
	}

	@Override
	public String toString() {
		return "BadgeApiSystemResponse [program=" + program + "]";
	}
	
}
