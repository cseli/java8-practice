package com.practice.java8.statmethod;

public interface Person {

	default int getAge() {
		return 20;
	}

	static String getMothersName() {
		return "Susanne";
	}
}

