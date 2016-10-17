package com.cisc181.Exceptions;


import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person p;
	
	public PersonException(Person p){
		super();
		this.p = p;
		System.out.println("Your Phone # is not properly formatted");
	}

}
