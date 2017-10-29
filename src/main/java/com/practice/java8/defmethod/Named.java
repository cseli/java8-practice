package com.practice.java8.defmethod;

public interface Named {
	default String getName() {
		return getClass().getName() + "_" + hashCode();
	}
}

