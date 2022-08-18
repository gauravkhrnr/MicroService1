package com.example.service1.model;

public class Properties {
	private String msg; 
	private String version;
	public Properties(String msg, String version) {
		super();
		this.msg = msg;
		this.version = version;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
}
