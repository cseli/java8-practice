package com.practice.java8.collections.comparator.model;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getName() {
		return Arrays
				.asList(firstName, lastName)
				.stream().filter(name -> name != null)
				.collect(Collectors.joining(" "));
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
