package com.practice.java8.optional;

import java.util.Optional;

public class Car {
	private Optional<LicencePlate> licencePlate;

	public Car(Optional<LicencePlate> licencePlate) {
		this.licencePlate = licencePlate;
	}

	public Optional<LicencePlate> getLicencePlate() {
		return licencePlate;
	}

	public void setLicencePlate(Optional<LicencePlate> licencePlate) {
		this.licencePlate = licencePlate;
	}
}
