package com.bold360.defmethod;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {
	private Person person;
	private Person personClassWin;
	private Person personInterfaceClash;

	@Before
	public void setUp() throws Exception {
		person = new Student();
		personClassWin = new StudentClassWin();
		personInterfaceClash = new StudentInterfaceClash();
	}

	@Test
	public void testGetName_DefaultMethod() throws Exception {
		assertTrue("getName() should not be override", person.getName().equals("John Q. Public"));
	}

	@Test
	public void testGetName_ClassWin() throws Exception {
		assertTrue("Class implementation should win", personClassWin.getName().equals("Jon Snow"));
	}

	@Test
	public void testGetName_InterfaceClash() throws Exception {
		assertTrue("Conflict was not resolved correctly", personInterfaceClash.getName().equals("John Q. Public"));
	}
}