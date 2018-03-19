package com.cisc181.core;

public class PersonException extends Exception {
	private Person Person;
	private String justWhy = "";
	
	public PersonException(Person Person) {
		this.Person = Person;
	}
	
	public PersonException(Person Person, String cause) {
		justWhy = cause;
	}
	
	public String getJustWhy() {
		return justWhy;
	}
}
