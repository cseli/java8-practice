package com.bold360.defmethod;

public interface Person {
	long getId();

	default String getName() {
		return "John Q. Public";
	}
}




