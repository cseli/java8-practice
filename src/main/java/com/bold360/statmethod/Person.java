package com.bold360.statmethod;

public interface Person {

	default int getAge() {
		return 20;
	}

	static String getMothersName() {
		return "Susanne";
	}
}

