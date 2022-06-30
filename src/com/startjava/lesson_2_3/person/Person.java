package com.startjava.lesson_2_3.person;

public class Person {

	String sex = "Male";
	String name = "Evgeniy";
	int hight = 184;
	float weight = 85.6f;
	int age = 33;

	boolean learnJava() {
		return true;
	}

	void move() {
		System.out.println("Я иду");	
	}

	void sleep() {
		System.out.println("Я уснул");
	}

	void sit() {
		System.out.println("Сел");
	}

	void speak() {
		System.out.println("Не спать! Учиться, учиться и учиться");
	}
}