package com.cisc181.eNums;

public enum eMajor {
BUSINESS("BUSINESS"), COMPSI("COMPSI"), CHEM("CHEM"), PHYSICS("PHYSICS"), NURSING("NURSING");
	
	private String value;


	private eMajor(String Value) {
		this.value = value;
	}
	
	public String getValue(){
		return value;
	}
	
	
}
