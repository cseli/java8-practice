package com.practice.java8.collections.comparator;

import java.util.Arrays;
import java.util.Comparator;

import com.practice.java8.collections.comparator.model.Person;

public class School {
	Person[] people = new Person[4];

	public School(Person[] people) {
		this.people = people;
	}

	Person[] getFirstByName() {
		Arrays.sort(people, Comparator.comparing(Person::getName));
		return people;
	}

	Person[] getFirstByLastNameThenFirstName() {
		Arrays.sort(people, Comparator
				.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName));
		return people;
	}

	Person[] getFirstByLastNameThenFirstNameHandleNull() {
		Arrays.sort(people, Comparator
				.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName, Comparator.nullsLast(Comparator.naturalOrder())));
		return people;
	}

}
