package com.practice.java8.statmethod;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Person person;

	@Before
	public void setUp() throws Exception {
		person = new Student();
	}

	@Test
	public void testStaticMethod() throws Exception {
		assertTrue("getMothersName() may be invoked on containing interface only", Person.getMothersName().equals("Susanne"));
	}

	@Test
	public void testOverriddenDefaultMethod() throws Exception {
		assertTrue("getAge should be overridden", person.getAge() == 30);
	}
}