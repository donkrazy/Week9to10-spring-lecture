package com.estsoft.springcontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Guest {
	private String name;
	
	@Autowired
	private Friend friend;
	
	public Guest() {
		this.name = "0simyee";
	}

	@Override
	public String toString() {
		return "Guest [name=" + name + ", friend=" + friend + "]";
	}
	
	
}
