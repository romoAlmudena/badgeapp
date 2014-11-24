package com.example.badgeapp.auth;

import org.joda.time.DateTime;

public class Payload {

	private String key;
	private long exp;
	private String method;
	private String path;
	
	public Payload(String method, String path) {
		this.key = "master";
		this.exp = 1414519415458l;
		this.method = method;
		this.path = path;
		
	}
	/*
	public Payload() {
		this.key = "master";
		this.exp = 1414519415458l;//DateTime.now().getMillis() + (3600*1000);
		this.method = "GET";
		this.path = "/systems/badgekit/badges";
		
	}
	*/
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public long getExp() {
		return exp;
	}

	public void setExp(long exp) {
		this.exp = exp;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
