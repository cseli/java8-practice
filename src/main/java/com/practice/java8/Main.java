package com.practice.java8;

import com.practice.java8.statmethod.Person;
import com.practice.java8.statmethod.Student;

public class Main {
	public static void main(String[] args) {
		//default methods
		//		Person person = new Student();
		//		System.out.print(person.getName()); //Jon Snow

		//static methods
		Person person = new Student();
		Student student = new Student();

//		Student.getMothersName();

		System.out.print(person.getAge()); //30
//		System.out.print(person.getMothersName()); //not valid
		System.out.print(Person.getMothersName()); //Susanne
	}
}

