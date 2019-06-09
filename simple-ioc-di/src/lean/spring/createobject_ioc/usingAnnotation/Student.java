package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.stereotype.Component;

@Component("Student")
public class Student {

	public Student()
	{
		System.out.println("Student object created...");
	}

	public void printMyClassName() {
		System.out.println("I am in Student class");
	}
	
}
