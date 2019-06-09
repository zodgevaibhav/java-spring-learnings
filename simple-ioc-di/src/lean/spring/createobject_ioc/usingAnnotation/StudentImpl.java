package lean.spring.createobject_ioc.usingAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentImpl {

	@Autowired
	public StudentImpl(IStudentDetails std) //Constructor injection
	{
		std.printClassName();
		System.out.println("StudentImpl for IStudentDetaials object created...");
	}

	//@Autowired   //Can not have two constructor with 2 autowired
	public StudentImpl(String a)//(StudentDetailsImpl std) //Constructor injection
	{
		//std.printClassName();
		System.out.println("StudentImpl for StudentDetaials object created...");
	}
	
	public StudentImpl()//precedence will be given to constructor who has autowired written
	{
		//std.printClassName();
		System.out.println("StudentImpl for deafult constructor...");
	}
	public void printMyClassName() {
		System.out.println("I am in StudentImpl class");
	}
	
}
