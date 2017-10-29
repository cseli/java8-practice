package com.bold360;

import com.bold360.statmethod.Person;
import com.bold360.statmethod.Student;

public class Main {
	public static void main(String[] args) {
		//default methods
		//		Person person = new Student();
		//		System.out.print(person.getName()); //Jon Snow

		//static methods
		Person person = new Student();
		System.out.print(person.getAge()); //30
//		System.out.print(person.getMothersName()); //not valid
		System.out.print(Person.getMothersName()); //Susanne
	}
}

