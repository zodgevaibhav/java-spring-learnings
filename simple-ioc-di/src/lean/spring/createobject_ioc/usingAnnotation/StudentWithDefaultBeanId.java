package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.stereotype.Component;

@Component
public class StudentWithDefaultBeanId {

	public StudentWithDefaultBeanId()
	{
		System.out.println("studentWithDefaultBeanId object created...");
	}

	public void printMyClassName() {
		System.out.println("I am in studentWithDefaultBeanId class");
	}
	
}
