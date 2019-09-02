package com.openvz.spring_learn.springlearn.services;

public class Dog implements IAnimal {

	@Override
	public void eat() {
		System.out.println("I am eating");
	}

	@Override
	public void bark() {
		System.out.println("I am barking");
	}

}
