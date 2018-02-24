package com.practice.java8.optional;

import java.util.Optional;

public class OptionalExample {

	private Optional<Car> car;

	public OptionalExample() {
	}

	public OptionalExample(Optional<Car> car) {
		this.car = car;
	}

	public double oldWay(Double value) {

		if( value != null) {
			return value * 2;
		}

		return 0.0;
	}

	public double wrongWay(Double value) {
		Optional<Double> newOptValue = Optional.of(value);
		if( newOptValue.isPresent() ) {
			return value * 2;
		}
		return 0.0;
	}

	public double goodWay(Optional<Double> value) {
		return value.orElse(0.0) * 2;
	}

	public double optionalOrElse(Double value) {
		return Optional.ofNullable(value).orElse(0.0);
	}

	public double optionalOrElseThrow(Double value) {
		return Optional.ofNullable(value).orElseThrow(IllegalArgumentException::new);
	}

	public int getCarLicencePlateNumber() {
		return car
				.flatMap(Car::getLicencePlate)
				.flatMap(LicencePlate::getNumber)
				.orElseThrow(NoCarOrLicencePlateException::new);
	}

	public String getCarLicencePlateCountryCode() {
		return car
				.flatMap(Car::getLicencePlate)
				.get().getCountryCode();
	}

	public void optionalIsIfPresentExample() {
		String value = "Hello";

		if(Optional.ofNullable(value).isPresent())

		if( value != null)

		{
			System.out.print(value);
		}


	}

}
