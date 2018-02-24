package com.practice.java8.optional;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

public class OptionalExampleTest {
	private OptionalExample optionalExample;
	private OptionalExample anotherOptionalExample;

	@Before
	public void setUp() throws Exception {
		optionalExample = new OptionalExample(Optional.ofNullable(null));
		anotherOptionalExample = new OptionalExample(Optional.of(new Car(Optional.of(new LicencePlate(Optional.of(5), "HU")))));
	}

	@Test
	public void testOldWay() throws Exception {
		assertEquals(0.0, optionalExample.oldWay(null), 0.0);
	}

	@Test(expected = NullPointerException.class)
	public void testWrongWay() throws Exception {
		assertEquals(0.0, optionalExample.wrongWay(null), 0.0);
	}

	@Test
	public void testGoodWay() throws Exception {
		assertEquals(2.0, optionalExample.goodWay(Optional.ofNullable(1.0)), 0.0);
	}

	@Test
	public void testOptionalOfNullable() throws Exception {
		String test = null;
		assertEquals("Hello", Optional.ofNullable(test).orElse("Hello"));
	}

	@Test(expected = NullPointerException.class)
	public void testOptionalOf() throws Exception {
		String test = null;
		Optional.of(test).get();
	}

	@Test
	public void test() throws Exception {
		assertEquals(5, anotherOptionalExample.getCarLicencePlateNumber());
	}

	@Test
	public void testImmutableDouble() throws Exception {
		Double d = 0.0;
		Optional<Double> aDouble = Optional.ofNullable(d);
		d = 1.0;
		assertEquals(0.0, aDouble.get(), 0.0);
	}

	@Test
	public void testCollection() throws Exception {
		List<String> list = new ArrayList<>();
		Optional<List<String>> listOptional = Optional.of(list);
		list.add("Hello");
		assertEquals(1, listOptional.get().size());
	}

	@Test
	public void testOptionalFilter() throws Exception {
		Optional<Double> d = Optional.ofNullable(-1.0);
		assertEquals(0.0, d.filter(e -> e > 0).orElse(0.0), 0.0);
	}

	@Test
	public void testIfPresentWithNull() throws Exception {
		Optional.ofNullable(null).ifPresent(System.out::print);
	}
}