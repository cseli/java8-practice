package com.practice.java8.collections.comparator;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.practice.java8.collections.comparator.model.Person;

public class SchoolTest {
	private School testSchool;
	private Person[] testPeople = new Person[4];

	@Before
	public void setUp() throws Exception {
		testPeople[0] = new Person("Andrew", "Alpha");
		testPeople[1] = new Person("Bob", "Alpha");
		testPeople[2] = new Person("Courtney", "Alpha");
		testPeople[3] = new Person(null, "Alpha");
		testSchool = new School(testPeople);
	}

	@Test
	public void testGetFirstByName() throws Exception {
		assertTrue("In alphabetic order Andrew Alpha should be the first one", testSchool
				.getFirstByName()[0]
				.getName()
				.equals("Alpha"));
	}

	@Test(expected = NullPointerException.class)
	public void testGetFirstByFirstNameAndByLastName() throws Exception {
		testSchool
				.getFirstByLastNameThenFirstName()[0]
				.getName()
				.equals("Andrew Alpha");
	}

	@Test
	public void testGetFirstByFirstNameAndByLastName_WithNull_CheckFirst() throws Exception {
		assertTrue("In alphabetic order Andrew Alpha should be the first one", testSchool
				.getFirstByLastNameThenFirstNameHandleNull()[0]
				.getName()
				.equals("Andrew Alpha"));
	}

	@Test
	public void testGetFirstByFirstNameAndByLastName_WithNull_CheckLast() throws Exception {
		assertTrue("In alphabetic order Alpha should be the first one", testSchool
				.getFirstByLastNameThenFirstNameHandleNull()[testPeople.length - 1]
				.getName()
				.equals("Alpha"));
	}
}