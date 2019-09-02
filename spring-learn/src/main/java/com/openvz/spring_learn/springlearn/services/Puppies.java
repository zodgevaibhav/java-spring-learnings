package com.openvz.spring_learn.springlearn.services;

public class Puppies {

	private IAnimal dog;
	
	public Puppies(IAnimal dog)
	{
		this.dog = dog;
	}
	
	public void barkDog()
	{
		this.dog.bark();
	}
}
