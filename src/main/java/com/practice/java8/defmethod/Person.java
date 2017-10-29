package com.practice.java8.defmethod;

public interface Person {
	long getId();

	default String getName() {
		return "John Q. Public";
	}
}




