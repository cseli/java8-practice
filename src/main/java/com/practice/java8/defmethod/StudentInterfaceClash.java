package com.practice.java8.defmethod;

public class StudentInterfaceClash implements Person, Named {
	@Override public long getId() {
		return 0;
	}

	@Override public String getName() {
		return Person.super.getName();
	}
}
