package com.openvz.spring_learn.springlearn;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import com.openvz.spring_learn.springlearn.services.Dog;
import com.openvz.spring_learn.springlearn.services.IAnimal;
import com.openvz.spring_learn.springlearn.services.Puppies;

public class AnimalServiceTest {

	@Rule
	public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

	@Test
	public void verifyConstructorInnjectedObjectMethodIsBeingCalled() {
		IAnimal mockPuppy = mock(IAnimal.class);

		Puppies puppy = new Puppies(mockPuppy);
		puppy.barkDog();
		verify(mockPuppy, times(1)).bark();
	}
	
	@Test
	public void verifyIamEatingIsPrinted()
	{
		Dog dog = new Dog();
		dog.eat();
	
		
		assertEquals("I am eating\n",systemOutRule.getLog());
	}

}
