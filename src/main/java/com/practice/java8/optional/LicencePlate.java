package com.practice.java8.optional;

import java.util.Optional;

public class LicencePlate {
	private Optional<Integer> number;
	private String countryCode;

	public LicencePlate(Optional<Integer> number, String countryCode) {
		this.number = number;
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public Optional<Integer> getNumber() {
		return number;
	}

	public void setNumber(Optional<Integer> number) {
		this.number = number;
	}
}
