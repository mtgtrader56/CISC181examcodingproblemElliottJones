package com.cisc181.eNums;

public enum eTitle {
	MR("MR."), MRS("MRS."), MS("MS.");

	private String value;

	private eTitle(String Value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
