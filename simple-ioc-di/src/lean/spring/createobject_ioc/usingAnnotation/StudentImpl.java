package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl {

	@Autowired
	public StudentImpl(IStudentDetails std)
	{
		std.printClassName();
		System.out.println("StudentImpl object created...");
	}

	public void printMyClassName() {
		System.out.println("I am in StudentImpl class");
	}
	
}
