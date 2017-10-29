package com.bold360.defmethod;

public interface Named {
	default String getName() {
		return getClass().getName() + "_" + hashCode();
	}
}

